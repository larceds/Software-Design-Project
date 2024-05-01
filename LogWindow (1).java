//package slfinal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Struct;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class LogWindow {

;
	private JFrame frame;
	private JTextField textField;
	private AbstractButton userText;
	protected JComponent messageLabel;


	
	

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
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 208, 214));
		panel.setBounds(0, 0, 981, 590);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel StudentAccLabel = new JLabel("Students Access Module");
		StudentAccLabel.setForeground(Color.WHITE);
		StudentAccLabel.setBounds(348, 82, 261, 43);
		StudentAccLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(StudentAccLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 81, 81));
		panel_1.setBounds(187, 123, 628, 360);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel UserAuthLabel = new JLabel("User Authentication");
		//JLabel UserAuthLabel = new JLabel("<html>User<br>Authentication</html>");
		UserAuthLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		UserAuthLabel.setForeground(Color.WHITE);
		UserAuthLabel.setBounds(41, 24, 202, 42);
		panel_1.add(UserAuthLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\didsd\\OneDrive\\Pictures\\Screenshots\\grid.png"));
		lblNewLabel_3.setBounds(41, 64, 548, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel StudentId = new JLabel("Student ID No:");
		StudentId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		StudentId.setForeground(Color.WHITE);
		StudentId.setBounds(41, 87, 129, 30);
		panel_1.add(StudentId);
		
		textField = new JTextField();
		textField.setBounds(41, 127, 489, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPasswordField password = new JPasswordField("");
		password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setForeground(Color.BLACK);
		password.setBounds(41, 199, 489, 30);
		panel_1.add(password);
		
		JButton ClearButton = new JButton("Clear Entries");
		ClearButton.setForeground(Color.WHITE);
		ClearButton.setBackground(new Color(194, 41, 14));
		ClearButton.setBounds(41, 269, 147, 32);
		panel_1.add(ClearButton);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.setForeground(Color.WHITE);
		LoginButton.setBackground(new Color(194, 41, 14));
		LoginButton.setBounds(485, 269, 104, 32);
		panel_1.add(LoginButton);
		
		
		
		JLabel PasswordLabel = new JLabel("Password:");
		PasswordLabel.setForeground(Color.WHITE);
		PasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PasswordLabel.setBounds(41, 159, 129, 30);
		panel_1.add(PasswordLabel);
		
		JButton ShowPassButton = new JButton("");
		ShowPassButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (password.getEchoChar() == '\u2022') { //Password is hidden
		            password.setEchoChar((char) 0); // will show the password
		        } else {
		            password.setEchoChar('\u2022'); // will hide the password
		        }
		    }
		});
		ShowPassButton.setForeground(Color.WHITE);
		ShowPassButton.setBackground(new Color(194, 41, 14));
		ShowPassButton.setBounds(540, 204, 25, 23);
		panel_1.add(ShowPassButton);
		
		JButton ForgotPass = new JButton("Forgot Password");
		ForgotPass.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String newPassword = JOptionPane.showInputDialog(frame, "Enter new password:");
		        if (newPassword != null && !newPassword.isEmpty()) {
		            try {
		                Class.forName("com.mysql.cj.jdbc.Driver");
		                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "password");

		                Statement stmt = con.createStatement();
		                String updateQuery = "UPDATE studentsdata SET Password = '" + newPassword + "' WHERE UserName = '" + textField.getText() + "'";
		                int rowsUpdated = stmt.executeUpdate(updateQuery);
		                if (rowsUpdated > 0) {
		                    JOptionPane.showMessageDialog(frame, "Password updated successfully!");
		                } else {
		                    JOptionPane.showMessageDialog(frame, "Failed to update password. User not found.", "Error", JOptionPane.ERROR_MESSAGE);
		                }

		                con.close();
		            } catch (Exception ex) {
		                ex.printStackTrace();
		                JOptionPane.showMessageDialog(frame, "An error occurred while updating password.", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }
		    }
		});
		ForgotPass.setForeground(Color.WHITE);
		ForgotPass.setBackground(new Color(194, 41, 14));
		ForgotPass.setBounds(281, 269, 104, 32);
		panel_1.add(ForgotPass);
	
		
		JLabel logo = new JLabel("New label");
		logo.setIcon(new ImageIcon("C:\\Users\\didsd\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-04-23 191201.png"));
		logo.setBounds(0, -12, 981, 90);
		panel.add(logo);
		
		JLabel cop = new JLabel("New label");
		cop.setIcon(new ImageIcon("C:\\Users\\didsd\\OneDrive\\Pictures\\Screenshots\\cop.png"));
		cop.setBounds(-446, 499, 1427, 72);
		panel.add(cop);
		
		JLabel bg = new JLabel("New label");
		bg.setIcon(new ImageIcon("C:\\Users\\didsd\\Downloads\\Add a heading.jpg"));
		bg.setBounds(0, 65, 981, 434);
		panel.add(bg);
		
		LoginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					 Class.forName("com.mysql.cj.jdbc.Driver");
					 Connection con=DriverManager
							 .getConnection("jdbc:mysql://localhost:3306/studentinfo","root","password");
					 
					  Statement stmt = con.createStatement();
						
					 System.out.println("Connection established");
					 
					 
					
					String localhost = "Select * from studentsdata where UserName='"+textField.getText()+"'and Password='"+String.valueOf(password.getPassword())+"'";
					 ResultSet rs=stmt.executeQuery(localhost);
					
					  if(rs.next()) {
						  System.out.println("login successful");
			           
					  }	 else {
				          System.out.println("Incorrect username and password");
					  }
					  
					 con.close();
					 
				   } catch(Exception err) {System.out.print(err);}
			}});
		
	}
	}
	


