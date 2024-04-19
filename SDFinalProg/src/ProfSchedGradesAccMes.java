import java.awt.EventQueue;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.SwingConstants;


import javax.swing.JFrame;

public class ProfSchedGradesAccMes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfSchedGradesAccMes window = new ProfSchedGradesAccMes();
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
	public ProfSchedGradesAccMes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 939, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 923, 520);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("__________________________________________________________________________________________________________________________________________________________________________________________________");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBackground(Color.PINK);
		lblNewLabel_1_1.setBounds(0, 169, 948, 30);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome,");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(46, 142, 132, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\Screenshot 2024-04-19 100536.png"));
		lblNewLabel_3.setBounds(-380, 115, 1677, 420);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\Screenshot 2024-04-19 085307.png"));
		lblNewLabel.setBounds(0, 0, 923, 85);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(138, 0, 0));
		panel_1.setBounds(0, 82, 923, 46);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(170, 0, 0));
		btnNewButton.setBounds(10, 11, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Schedule");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(170, 0, 0));
		btnNewButton_1.setBounds(109, 11, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Grades");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(170, 0, 0));
		btnNewButton_1_1.setBounds(208, 11, 89, 23);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Account");
		btnNewButton_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1.setBackground(new Color(170, 0, 0));
		btnNewButton_1_1_1.setBounds(307, 11, 89, 23);
		panel_1.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Messages");
		btnNewButton_1_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1_1.setBackground(new Color(170, 0, 0));
		btnNewButton_1_1_1_1.setBounds(406, 11, 97, 23);
		panel_1.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Logout");
		btnNewButton_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1.setBackground(new Color(170, 0, 0));
		btnNewButton_1_1_1_1_1.setBounds(824, 11, 89, 23);
		panel_1.add(btnNewButton_1_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Student.DESKTOP-GF5TTT1\\Desktop\\4.png"));
		lblNewLabel_1.setBounds(0, 130, 923, 390);
		panel.add(lblNewLabel_1);
	}

}
