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

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;

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
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(220, 347, 444, 20);
		panel.add(textField_6);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Email Address:");
		lblNewLabel_4_1_3.setForeground(Color.WHITE);
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_3.setBounds(210, 318, 195, 30);
		panel.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Designation:");
		lblNewLabel_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_2.setBounds(210, 217, 195, 30);
		panel.add(lblNewLabel_4_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(220, 246, 444, 20);
		panel.add(textField_5);
		btnNewButton.setBounds(390, 378, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("PROFESSOR REGISTRATION FORM");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(302, 84, 286, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Number of Years of Experience");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1.setBounds(450, 266, 195, 30);
		panel.add(lblNewLabel_4_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(460, 295, 204, 20);
		panel.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(220, 295, 204, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Contact NO:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(210, 266, 96, 30);
		panel.add(lblNewLabel_4_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(220, 197, 444, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Degree:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setBounds(210, 168, 195, 30);
		panel.add(lblNewLabel_4_1);
		
		textField = new JTextField();
		textField.setBounds(220, 147, 444, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Full Name:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(210, 118, 61, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Windows 10\\Desktop\\438209119_1613889482762237_7642544475342964595_n.jpg"));
		lblNewLabel_3.setBounds(203, 104, 485, 316);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Windows 10\\Desktop\\436878544_422829097118730_4985006852360313674_n.png"));
		lblNewLabel.setBounds(0, 0, 916, 73);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Windows 10\\Desktop\\4.png"));
		lblNewLabel_2.setBounds(-174, 284, 1238, 262);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Windows 10\\Desktop\\2.png"));
		lblNewLabel_1.setBounds(0, -174, 916, 502);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(698, 104, 157, 137);
		panel.add(panel_1);
	}
}
