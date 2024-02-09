package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textMail;
	private JTextField textPw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
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
	public Log() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 651);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textMail = new JTextField();
		textMail.setBounds(274, 277, 313, 38);
		contentPane.add(textMail);
		textMail.setColumns(10);
		
		textPw = new JTextField();
		textPw.setBounds(274, 383, 313, 38);
		contentPane.add(textPw);
		textPw.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Teacher ", "Student ", "Admin"}));
		comboBox.setBounds(374, 158, 96, 32);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Log.class.getResource("/oops/user (1).png")));
		lblNewLabel.setBounds(382, 52, 56, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LogIn page");
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.BOLD, 17));
		lblNewLabel_1.setBounds(374, 105, 107, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mode:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(308, 161, 56, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setIcon(new ImageIcon(Log.class.getResource("/oops/mail (1).png")));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(375, 228, 114, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PW:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setIcon(new ImageIcon(Log.class.getResource("/oops/key (1) (1).png")));
		lblNewLabel_4.setBounds(382, 325, 88, 50);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBackground(new Color(165, 42, 42));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(375, 522, 107, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Don't have an account?");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_5.setBounds(192, 528, 187, 26);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(374, 465, 107, 35);
		contentPane.add(btnNewButton);
	}
}
