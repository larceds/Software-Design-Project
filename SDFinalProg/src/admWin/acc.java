package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;

public class acc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acc window = new acc();
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
	public acc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 993, 665);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Student\\eclipse-workspace\\clone\\Software-Design-Project\\SDFinalProg\\src\\imgs\\logo.png"));
		lblNewLabel.setBounds(0, 0, 977, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Student\\eclipse-workspace\\clone\\Software-Design-Project\\SDFinalProg\\src\\imgs\\bg2.png"));
		lblNewLabel_2.setBounds(0, 583, 977, 43);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setForeground(new Color(64, 0, 0));
		btnNewButton.setBounds(31, 83, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Grade");
		btnNewButton_1.setBounds(117, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Schedule");
		btnNewButton_2.setBounds(204, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Courses");
		btnNewButton_3.setBounds(291, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Account");
		btnNewButton_4.setBounds(375, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Student");
		btnNewButton_5.setBounds(461, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Logout");
		btnNewButton_6.setBounds(878, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Student\\eclipse-workspace\\clone\\Software-Design-Project\\SDFinalProg\\src\\imgs\\bg2.png"));
		lblNewLabel_1.setBounds(0, 73, 977, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(27, 128, 862, 221);
		frame.getContentPane().add(panel);
	}
}
