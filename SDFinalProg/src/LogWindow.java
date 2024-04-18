import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LogWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogWindow window = new LogWindow();
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
	public LogWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 208, 214));
		panel.setBounds(0, 0, 981, 571);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 981, 99);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lomat\\OneDrive\\Pictures\\Screenshots\\Screenshot (172).png"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Students Access Module");
		lblNewLabel_1.setBounds(373, 125, 261, 43);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 81, 81));
		panel_1.setBounds(189, 164, 614, 371);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("User Authentication");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(41, 24, 202, 42);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\lomat\\OneDrive\\Pictures\\Screenshots\\Screenshot (176).png"));
		lblNewLabel_3.setBounds(41, 64, 548, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Student ID No:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(41, 87, 129, 30);
		panel_1.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(41, 127, 548, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Password:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(41, 167, 129, 30);
		panel_1.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(41, 207, 548, 32);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(194, 41, 14));
		btnNewButton.setBounds(41, 269, 97, 32);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(194, 41, 14));
		btnNewButton_1.setBounds(485, 269, 104, 32);
		panel_1.add(btnNewButton_1);
	}
}
