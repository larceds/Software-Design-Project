package website;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;

public class corn {

	private JFrame frame;
	private JTextField textField;
	private final JPanel panel = new JPanel(); 
	private JPasswordField passwordField;
    private String[] username = {"charles","benedict","rafols"};
    private String[] password = {"123","321","231"};
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					corn window = new corn();
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
	public corn() {
		initialize();
	}

	/*
	 * Initialize the contents of the frame.
	 */
	//	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 945, 622);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 929, 10);
		frame.getContentPane().add(panel);
		
	
		
		textField.setBounds(236, 239, 406, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] Username = {"charles","benedict","rafols"};
				String[] Password = {"123","321","231"};
				
				boolean loggedIn=false;
				
				for (int i=0 <username.length; i++) {
					if (username.equals(username[1]))&& password.eqials(passwordw[i]){
						loggedin=true;
						break;
					}
				
				
				}
				if(LoggenIn)
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(236, 387, 138, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(504, 387, 138, 48);
		frame.getContentPane().add(btnRegister);
		
		JTextArea txtrAd = new JTextArea();
		txtrAd.setEditable(false);
		txtrAd.setFont(new Font("MS Gothic", Font.PLAIN, 13));
		txtrAd.setForeground(new Color(255, 255, 255));
		txtrAd.setBackground(new Color(0, 0, 0));
		txtrAd.setText("USERNAME");
		txtrAd.setBounds(239, 218, 35, 22);
		frame.getContentPane().add(txtrAd);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setEditable(false);
		txtrName.setFont(new Font("MS Gothic", Font.PLAIN, 13));
		txtrName.setForeground(new Color(0, 0, 0));
		txtrName.setBackground(new Color(255, 128, 0));
		txtrName.setText("NAME");
		txtrName.setBounds(273, 218, 35, 22);
		frame.getContentPane().add(txtrName);
		
		JTextArea txtrCorn = new JTextArea();
		txtrCorn.setEditable(false);
		txtrCorn.setForeground(new Color(255, 255, 255));
		txtrCorn.setBackground(new Color(0, 0, 0));
		txtrCorn.setFont(new Font("MS Gothic", Font.PLAIN, 75));
		txtrCorn.setTabSize(70);
		txtrCorn.setText("CORN");
		txtrCorn.setBounds(262, 91, 148, 87);
		frame.getContentPane().add(txtrCorn);
		
		JTextArea txtrHub = new JTextArea();
		txtrHub.setEditable(false);
		txtrHub.setForeground(new Color(0, 0, 0));
		txtrHub.setBackground(new Color(255, 128, 0));
		txtrHub.setText("HUB");
		txtrHub.setTabSize(70);
		txtrHub.setFont(new Font("MS Gothic", Font.PLAIN, 75));
		txtrHub.setBounds(419, 91, 196, 80);
		frame.getContentPane().add(txtrHub);
		
		JTextArea txtrWord = new JTextArea();
		txtrWord.setEditable(false);
		txtrWord.setText("WORD");
		txtrWord.setForeground(Color.BLACK);
		txtrWord.setFont(new Font("MS Gothic", Font.PLAIN, 13));
		txtrWord.setBackground(new Color(255, 128, 0));
		txtrWord.setBounds(273, 298, 35, 22);
		frame.getContentPane().add(txtrWord);
		
		JTextArea txtrPass = new JTextArea();
		txtrPass.setEditable(false);
		txtrPass.setText("PASS");
		txtrPass.setForeground(Color.WHITE);
		txtrPass.setFont(new Font("MS Gothic", Font.PLAIN, 13));
		txtrPass.setBackground(Color.BLACK);
		txtrPass.setBounds(236, 298, 35, 22);
		frame.getContentPane().add(txtrPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(236, 323, 406, 39);
		frame.getContentPane().add(passwordField);
		
		
	}
}
