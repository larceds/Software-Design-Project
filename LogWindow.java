package slfinals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Struct;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.Icon;
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
		
		JLabel lblNewLabel_1 = new JLabel("Students Access Module");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(348, 82, 261, 43);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 81, 81));
		panel_1.setBounds(187, 123, 628, 360);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("User Authentication");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(41, 24, 202, 42);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\didsd\\OneDrive\\Pictures\\Screenshots\\grid.png"));
		lblNewLabel_3.setBounds(41, 64, 548, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblUsername = new JLabel("Student ID No:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(41, 87, 129, 30);
		panel_1.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(41, 127, 447, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPasswordField password = new JPasswordField("");
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setForeground(Color.BLACK);
		password.setBounds(41, 200, 447, 29);
		panel_1.add(password);
		
	
		
		JButton ForgotPass = new JButton("Forgot Password");
		ForgotPass.setFont(new Font("Tahoma", Font.PLAIN, 10));
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
		                	Icon iconn = new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"));
		                    JOptionPane.showMessageDialog(frame, "Password updated successfully!","",JOptionPane.INFORMATION_MESSAGE,iconn);
		                } else {
		                	Icon iconn = new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"));
		                    JOptionPane.showMessageDialog(frame, "Failed to update password. User not found.", "",JOptionPane.INFORMATION_MESSAGE,iconn);
		                }

		                con.close();
		            } catch (Exception ex) {
		                ex.printStackTrace();
		                Icon iconn = new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"));
		                JOptionPane.showMessageDialog(frame, "An error occurred while updating password.", "", JOptionPane.ERROR_MESSAGE,iconn);
		            }
		        }
		    }
		});
		ForgotPass.setForeground(Color.WHITE);
		ForgotPass.setBackground(new Color(194, 41, 14));
		ForgotPass.setBounds(41, 311, 147, 21);
		panel_1.add(ForgotPass);
		
		

		JButton ShowPassButton = new JButton("Show Password");
		Icon iconnn = new javax.swing.ImageIcon(getClass().getResource("/image/showpass.png"));
		
	    Image img = ((ImageIcon) iconnn).getImage();
	    Image newimage = (img.getScaledInstance(28, 28, java.awt.Image.SCALE_SMOOTH));
	    iconnn = new ImageIcon (newimage);
		
		
		
		ShowPassButton.setSelectedIcon(new ImageIcon(LogWindow.class.getResource("/image/showpass.png")));
		ShowPassButton.setIcon(iconnn);
		ShowPassButton.addActionListener(new ActionListener() {
			
		    public void actionPerformed(ActionEvent e) {
		        if (password.getEchoChar() == '\u2022') { //Password is hidden
		            password.setEchoChar((char) 0); // will show the password
		        } else {
		            password.setEchoChar('\u2022'); // will hide the password
		        }
		    }
		});
		ShowPassButton.setForeground(new Color(255, 255, 255));
		ShowPassButton.setBackground(new Color(255, 255, 255));
		ShowPassButton.setBounds(485, 200, 23, 30);
		panel_1.add(ShowPassButton);

		
		JButton btnClearEntries = new JButton("Clear Entries");
		btnClearEntries.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				password.setText("");
			}
		});
		btnClearEntries.setForeground(Color.WHITE);
		btnClearEntries.setBackground(new Color(194, 41, 14));
		btnClearEntries.setBounds(41, 269, 147, 32);
		panel_1.add(btnClearEntries);
		
		
		
	   
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(194, 41, 14));
		btnNewButton_1.setBounds(485, 269, 104, 32);
		panel_1.add(btnNewButton_1);
		
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Password:");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(41, 159, 129, 30);
		panel_1.add(lblNewLabel_4_1);
	
		
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
		
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					 Class.forName("com.mysql.cj.jdbc.Driver");
					 Connection con=DriverManager
							 .getConnection("jdbc:mysql://localhost:3306/studentinfo","root","password");
					 
					  Statement stmt = con.createStatement();
						
					
					 
					 
					
					String localhost = "Select * from studentsdata where UserName='"+textField.getText()+"'and Password='"+String.valueOf(password.getPassword())+"'";
					 ResultSet rs=stmt.executeQuery(localhost);
					
					  if(rs.next()) {
						  Icon icon = new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"));
						  JOptionPane.showMessageDialog(frame,"You have been login successfully","",JOptionPane.INFORMATION_MESSAGE,icon);
			           
					  }	 else {
						  Icon icon = new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"));
						  JOptionPane.showMessageDialog(frame,"Incorrect password and student id number","",JOptionPane.INFORMATION_MESSAGE,icon);
					  }
					  
					 con.close();
					 
				   } catch(Exception err) {System.out.print(err);}
			}});
		
	}
	}
	


