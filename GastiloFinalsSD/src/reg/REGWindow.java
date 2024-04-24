package reg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class REGWindow {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("Register:");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGWindow window = new REGWindow();
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
	public REGWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 983, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBackground(new Color(255, 206, 209));
		panel.setBounds(0, 0, 977, 680);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -54, 1038, 172);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\marco\\Downloads\\EAC.png"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(101, 81, 78));
		panel_1.setBounds(154, 164, 657, 402);
		panel.add(panel_1);
		panel_1.setLayout(null);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(34, 26, 313, 36);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\marco\\OneDrive\\Desktop\\LINE.png"));
		lblNewLabel_2.setBounds(34, 63, 553, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LRN");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(34, 72, 89, 30);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(34, 99, 553, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("FULLNAME(SURNAME, FIRST NAME, M.I)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(34, 139, 398, 30);
		panel_1.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(34, 304, 553, 30);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("USERNAME");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(34, 207, 120, 30);
		panel_1.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(34, 235, 553, 30);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_51 = new JLabel("PASSWORD");
		lblNewLabel_51.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_51.setForeground(Color.WHITE);
		lblNewLabel_51.setBounds(34, 276, 120, 30);
		panel_1.add(lblNewLabel_51);
		
		textField_2 = new JTextField();
		textField_2.setBounds(34, 168, 553, 29);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(217, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(350, 356, 133, 36);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("RESET");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton1.setForeground(Color.WHITE);
		btnNewButton1.setBackground(new Color(217, 0, 0));
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton1.setBounds(140, 356, 133, 36);
		panel_1.add(btnNewButton1);
		
		JLabel lblNewLabel_31 = new JLabel("New label");
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31.setIcon(new ImageIcon("C:\\Users\\marco\\Downloads\\AIMS1.png"));
		lblNewLabel_31.setBounds(-91, 242, 1160, 514);
		panel.add(lblNewLabel_31);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("STUDENT REGISTRATION");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_6.setBounds(327, 115, 280, 39);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_311 = new JLabel("New label");
		lblNewLabel_311.setBounds(-347, -71, 1677, 680);
		panel.add(lblNewLabel_311);
		lblNewLabel_311.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_311.setIcon(new ImageIcon("C:\\Users\\marco\\Downloads\\Gradient.png"));
	}

}