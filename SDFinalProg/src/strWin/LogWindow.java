package strWin;

import java.sql.Connection;

import stdWin.stdWinMain;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
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
import profWin.profWinMain;
import admWin.adminWinMain;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("unused")
public class LogWindow {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;
	public static String log;
	public static int idn;
	public static String sect;
	
	ArrayList<Integer> num = new ArrayList();
	ArrayList<String> pw = new ArrayList();
	ArrayList<String> user_type = new ArrayList();
	ArrayList<String> sec = new ArrayList();

;
	public JFrame frame;
	private JTextField id;
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
		
		JLabel lblNewLabel_4 = new JLabel("ID Number:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(41, 87, 129, 30);
		panel_1.add(lblNewLabel_4);
		
		id = new JTextField();
		id.setBounds(41, 127, 548, 30);
		panel_1.add(id);
		id.setColumns(10);
		
		
		
		JPasswordField password = new JPasswordField("");
		/*
		password.addKeyListener(new KeyAdapter() {
			
			private KeyEvent evt;

			public void keyPressed(KeyEvent e) {
			if (e.getSource()==password) {
				if(String.val) {
					
				}
			}
			}
		});
		*/
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setForeground(Color.BLACK);
		password.setBounds(41, 199, 528, 30);
		panel_1.add(password);
		
		JButton btnNewButton = new JButton("Clear Entries");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				password.setText("");
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setBounds(41, 269, 147, 32);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setBounds(485, 269, 104, 32);
		panel_1.add(btnNewButton_1);
		
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Password:");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(41, 159, 129, 30);
		panel_1.add(lblNewLabel_4_1);
		
		JButton btnShowPassword = new JButton("Show Password");
		btnShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (password.getEchoChar() == '\u2022') { //Password is hidden
			            password.setEchoChar((char) 0); // will show the password
			        } else {
			            password.setEchoChar('\u2022'); // will hide the password
			        }
			    }
		});
		btnShowPassword.setForeground(Color.WHITE);
		btnShowPassword.setBackground(new Color(128, 0, 0));
		btnShowPassword.setBounds(568, 199, 21, 32);
		panel_1.add(btnShowPassword);
	
		
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
				
				try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
					st = c.createStatement();
       			 	System.out.println("ok");
					rs = st.executeQuery("select * from users");
					
					while(rs.next()) {
						num.add(rs.getInt("id_num"));
						pw.add(rs.getString("lname"));
						user_type.add(rs.getString("user_type"));
						sec.add(rs.getString("s"));
					}
					
					 System.out.println("Connection established");
					 int counter = 0;
					 if(num.contains(Integer.parseInt(id.getText()))) {
						 while(num.get(counter).equals(Integer.parseInt(id.getText()))!=true) {
							 counter++;
						 }
					 }else {
						 JOptionPane.showMessageDialog(null, "Incorrect credentials");
					 }
					
					 System.out.println(counter);
					 
					 if(pw.get(counter).equalsIgnoreCase(String.valueOf(password.getPassword()))) {
						 JOptionPane.showMessageDialog(null, "Successfully Logged in \n Welcome!");
						 sect = sec.get(counter);
						 log = pw.get(counter);
						 idn =Integer.parseInt(id.getText());
						 if(user_type.get(counter).equals("student")) {
								frame.dispose();
								stdWinMain student = new stdWinMain();
								student.setVisible(true);
								
							}else if(user_type.get(counter).equals("professor")){
								frame.dispose();
								profWinMain prof = new profWinMain();
								prof.setVisible(true);
								
							}else {
								frame.dispose();
								adminWinMain admin = new adminWinMain();
								admin.setVisible(true);
							}
					 }else {
						 JOptionPane.showMessageDialog(null, "Incorrect credentials");
						 id.setText(null);
						 password.setText(null);
					 }
					
				   } catch(Exception err) {System.out.print(err);}
				
				
			}});
		
	}
	}
	


