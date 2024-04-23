package jojo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class StudentProff {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentProff window = new StudentProff();
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
	public StudentProff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 925, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(0, 0, 909, 490);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(101, 81, 78));
		panel_2.setBounds(258, 134, 397, 206);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Select User");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(59, 30, 271, 141);
		panel_2.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Professor");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(179, 0, 0));
		btnNewButton_1.setBounds(251, 131, 117, 36);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Student");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(179, 0, 0));
		btnNewButton_1_1.setBounds(38, 131, 117, 36);
		panel_2.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("____________________________________________________________________");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(-11, 60, 441, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Welcome to EAC-C!");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(-11, -34, 441, 141);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Student.DESKTOP-603F66B\\Desktop\\BG2.png"));
		lblNewLabel_4.setBounds(-11, -4, 420, 217);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Student.DESKTOP-603F66B\\Desktop\\logo1.png"));
		lblNewLabel.setBounds(0, 0, 909, 80);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Student.DESKTOP-603F66B\\Desktop\\bg3.png"));
		lblNewLabel_1.setBounds(-512, 42, 1439, 448);
		panel_1.add(lblNewLabel_1);
	}
}