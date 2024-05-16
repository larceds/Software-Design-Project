package strWin;

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
	public JFrame frame;
	private JTextField txtStd;
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
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg3.jpg")));
		lblNewLabel_3.setBounds(41, 64, 548, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Student ID No:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(41, 87, 129, 30);
		panel_1.add(lblNewLabel_4);
		
		txtStd = new JTextField();
		txtStd.setBounds(41, 127, 530, 30);
		panel_1.add(txtStd);
		txtStd.setColumns(10);
		
		JPasswordField password = new JPasswordField("");
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setForeground(Color.BLACK);
		password.setBounds(41, 199, 530, 30);
		panel_1.add(password);
		
		JButton btnNewButton = new JButton("Clear Entries");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtStd.setText("");
				password.setText("");
			}
		});
		
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(194, 41, 14));
		btnNewButton.setBounds(41, 269, 147, 32);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(194, 41, 14));
		btnNewButton_1.setBounds(485, 269, 104, 32);
		panel_1.add(btnNewButton_1);
		
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
		ShowPassButton.setBounds(581, 199, 37, 30);
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
		                String updateQuery = "UPDATE studentsdata SET Password = '" + newPassword + "' WHERE UserName = '" + txtStd.getText() + "'";
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
		ForgotPass.setBounds(262, 269, 141, 32);
		panel_1.add(ForgotPass);
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Password:");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(41, 159, 129, 30);
		panel_1.add(lblNewLabel_4_1);
	
		
		JLabel logo = new JLabel("New label");
		logo.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		logo.setBounds(0, -12, 981, 90);
		panel.add(logo);
		
		JLabel cop = new JLabel("New label");
		cop.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		cop.setBounds(-446, 499, 1427, 72);
		panel.add(cop);
		
		JLabel bg = new JLabel("New label");
		bg.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
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
						
					 System.out.println("Connection established");
					 
					 
					
					String localhost = "Select * from studentsdata where UserName='"+txtStd.getText()+"'and Password='"+String.valueOf(password.getPassword())+"'";
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
	


