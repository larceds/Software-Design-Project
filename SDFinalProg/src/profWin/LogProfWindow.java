package tags;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class LogProfWindow {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogProfWindow window = new LogProfWindow();
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
	public LogProfWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 925, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Professors Access Module");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(279, 96, 368, 31);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(255, 0, 0));
		btnLogin.setBounds(593, 323, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnNewButton = new JButton("Clear Entries");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(243, 323, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("Username:");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setBounds(243, 193, 81, 11);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(243, 259, 81, 11);
		frame.getContentPane().add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(243, 281, 439, 31);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(243, 215, 439, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("_______________________________________________________________");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(210, 164, 503, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("User Authentication\r\n");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(243, 151, 154, 31);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Student.DESKTOP-603F66B\\Desktop\\BG2.png"));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(223, 138, 480, 234);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Student.DESKTOP-603F66B\\Desktop\\logo1.png"));
		lblNewLabel_1.setBounds(0, -11, 909, 100);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Student.DESKTOP-603F66B\\Desktop\\bg3.png"));
		lblNewLabel.setBounds(-512, 21, 1482, 490);
		frame.getContentPane().add(lblNewLabel);
		
	}
}

