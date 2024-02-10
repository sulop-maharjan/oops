package javasignment;

import java.awt.EventQueue;
import java.awt.Toolkit;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textMail;
	private JTextField textPw;


	/**
	 * Launch the application.
	 */
	
	


	
	
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void close() {
	    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}


	/**
	 * Create the frame.
	 */
	public Login() {
		setBackground(SystemColor.windowBorder);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 833, 657);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Elephant", Font.PLAIN, 12));
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Select user type", "Teacher", "Student", "Admin"}));
        comboBox.setBounds(521, 154, 106, 36);
        contentPane.add(comboBox);
        
    

		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(new Color(50, 205, 50));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }

			
				// TODO Auto-generated method stub
            private void handleLogin() {
                String enteredUsername = textMail.getText().trim();
                String enteredPassword = textPw.getText().trim();
               

                // Use the class-level comboBox directly
                String enteredMode = comboBox.getSelectedItem().toString();
                
               
                
                


                String url = "jdbc:mysql://localhost:3306/coursemanage";
                String username1 = "root";
                String password1 = "";

                try (Connection con1 = DriverManager.getConnection(url, username1, password1);
                	     Statement st = con1.createStatement()) {

                	    String database;
                	    if (enteredMode.equals("Student")) {
                	        database = "SELECT * FROM student WHERE Email=? AND Password=? AND Mode=?";
                	    } else if ("Admin".equals(enteredMode)) {
                	        database = "SELECT * FROM admin WHERE Email=? AND Password=?";
                	    } else if ("Teacher".equals(enteredMode)) {
                	        database = "SELECT * FROM teacher WHERE Email=? AND Password=? AND Mode=?";
                	    } else {
                	        JOptionPane.showMessageDialog(null, "Invalid user type");
                	        return; // You may want to handle this case differently
                	    }

                	    try (PreparedStatement pst = con1.prepareStatement(database)) {
                	        pst.setString(1, enteredUsername);
                	        pst.setString(2, enteredPassword);
                	        if (!"Admin".equals(enteredMode)) {
                	            pst.setString(3, enteredMode);
                	        }

                	        ResultSet rs = pst.executeQuery();
                	        if (rs.next()) {
                	        	
                	        	   UserSession.setRole(enteredMode);

                	            // Successful login logic here
                	           
                	                // Only allow delete and update for admin
                	                close();
                	                Dashboard nw = new Dashboard();
                	                nw.setVisible(true);
                	            } 
                	            
                	         else {
                	            // No matching record found
                	            JOptionPane.showMessageDialog(null, "Incorrect username, password, or mode");
                	        }
                	    }
                	} catch (SQLException ex) {
                	    ex.printStackTrace();
                	}

            }

        });
		
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(598, 463, 96, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(426, 266, 60, 25);
		contentPane.add(lblNewLabel);
		
		textMail = new JTextField();
		textMail.setBounds(496, 260, 256, 41);
		contentPane.add(textMail);
		textMail.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(426, 359, 83, 25);
		contentPane.add(lblNewLabel_4);
		
		textPw = new JTextField();
		textPw.setBounds(521, 354, 242, 40);
		contentPane.add(textPw);
		textPw.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(Login.class.getResource("/javasignment/password (1).png")));
		lblNewLabel_6.setBounds(360, 348, 56, 50);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("Dont have account?");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_2.setBounds(384, 526, 187, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("SignUp");
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				open();
				}

			private void open() {
				// TODO Auto-generated method stub
				dispose();
				Signup nw = new Signup();
				nw.setVisible(true);

				
			}
		});
		btnNewButton_1.setBounds(598, 523, 96, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/javasignment/user (1).png")));
		lblNewLabel_1.setBounds(360, 255, 56, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel(":");
		lblNewLabel_7.setIcon(new ImageIcon(Login.class.getResource("/javasignment/group (1).png")));
		lblNewLabel_7.setBounds(455, 152, 56, 40);
		contentPane.add(lblNewLabel_7);
		
		
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBackground(new Color(255, 255, 255));
		lblNewLabel_8.setIcon(new ImageIcon(Login.class.getResource("/javasignment/sign-up (1) (1).png")));
		lblNewLabel_8.setBounds(567, 523, 35, 25);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBackground(new Color(127, 255, 212));
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/javasignment/bwink_bld_03_single_03 (1).png")));
		lblNewLabel_3.setBounds(0, 10, 350, 648);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("WELCOME TO LOGIN PAGE :)");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel_5.setBounds(266, 69, 486, 33);
		contentPane.add(lblNewLabel_5);
		
		
		

		
		JLabel lblNewLabel_9 = new JLabel(":");
		lblNewLabel_9.setIcon(new ImageIcon(Login.class.getResource("/javasignment/online-learning (1).png")));
		lblNewLabel_9.setBounds(208, 52, 48, 50);
		contentPane.add(lblNewLabel_9);
	}
}
