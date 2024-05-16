package regWin;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class regProf {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regProf window = new regProf();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public regProf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 930, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 916, 515);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(778, 81, 89, 23);
		panel.add(btnNewButton_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(451, 295, 210, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nature of Association");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(441, 270, 136, 14);
		panel.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(220, 295, 185, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Date of Joining EAC");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(210, 270, 116, 14);
		panel.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(220, 239, 444, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Area of Specialization ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(220, 214, 143, 14);
		panel.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(217, 382, 444, 20);
		panel.add(textField_6);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Email Address:");
		lblNewLabel_4_1_3.setForeground(Color.WHITE);
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_3.setBounds(210, 363, 129, 20);
		panel.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Designation:");
		lblNewLabel_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_2.setBounds(441, 160, 195, 30);
		panel.add(lblNewLabel_4_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(453, 189, 211, 20);
		panel.add(textField_5);
		btnNewButton.setBounds(397, 413, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("PROFESSOR REGISTRATION FORM");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(302, 84, 286, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Number of Years of Experience");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1.setBounds(441, 315, 195, 23);
		panel.add(lblNewLabel_4_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(451, 337, 210, 20);
		panel.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(220, 337, 185, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Contact NO:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(210, 311, 96, 30);
		panel.add(lblNewLabel_4_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(220, 189, 185, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Degree:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setBounds(210, 160, 195, 30);
		panel.add(lblNewLabel_4_1);
		
		textField = new JTextField();
		textField.setBounds(220, 143, 444, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Full Name:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(210, 116, 61, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg3.jpg")));
		lblNewLabel_3.setBounds(188, 104, 530, 345);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 916, 73);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_2.setBounds(-174, 460, 1238, 86);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_1.setBounds(0, -92, 946, 607);
		panel.add(lblNewLabel_1);
		
	}
}
