package oops;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sign extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField textEmail;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign frame = new Sign();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 652);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Sign.class.getResource("/oops/sign-up (1).png")));
		lblNewLabel.setBounds(392, 10, 52, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to SingnUp Page");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(327, 65, 219, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setIcon(new ImageIcon(Sign.class.getResource("/oops/mail (1).png")));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(370, 230, 110, 32);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Teacher", "Student ", "Admin"}));
		comboBox.setFont(new Font("Calibri", Font.BOLD, 15));
		comboBox.setBounds(134, 172, 102, 39);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setIcon(new ImageIcon(Sign.class.getResource("/oops/padlock (1).png")));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(356, 321, 124, 44);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mode:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setIcon(new ImageIcon(Sign.class.getResource("/oops/group (1).png")));
		lblNewLabel_4.setBounds(29, 165, 95, 45);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("UserName:");
		lblNewLabel_5.setIcon(new ImageIcon(Sign.class.getResource("/oops/name-card (1).png")));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_5.setBounds(344, 121, 136, 39);
		contentPane.add(lblNewLabel_5);
		
		textUsername = new JTextField();
		textUsername.setBounds(301, 170, 245, 39);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(281, 272, 295, 39);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setBounds(282, 378, 294, 39);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Courses:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_6.setBounds(51, 275, 73, 29);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Calibri", Font.BOLD, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BIBM", "BIT"}));
		comboBox_1.setBounds(134, 274, 102, 38);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("Already have an account?");
		lblNewLabel_7.setFont(new Font("Century", Font.BOLD, 17));
		lblNewLabel_7.setBounds(156, 528, 220, 21);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_1 = new JButton("LogIn");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(378, 520, 102, 38);
		contentPane.add(btnNewButton_1);
		
		JButton create = new JButton("SignIn");
		create.setBackground(new Color(255, 0, 0));
		create.setFont(new Font("Tahoma", Font.BOLD, 15));
		create.setBounds(378, 455, 102, 38);
		contentPane.add(create);
	}

}

