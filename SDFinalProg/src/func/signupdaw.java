package func;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class signupdaw {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;
	
	ArrayList <String> ig1 = new ArrayList();
	
	
	private JFrame frame;
	private JTable table;
	private JTextField ign;
	private JPasswordField pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signupdaw window = new signupdaw();
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
	public signupdaw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			 st = c.createStatement();
			System.out.println("ok");
			
		}catch (Exception e) {
			System.out.println("1");

		}
		
		JList list = new JList();
		list.setBounds(69, 281, 200, 0);
		frame.getContentPane().add(list);
		
		table = new JTable();
		table.setBounds(69, 217, 118, 0);
		frame.getContentPane().add(table);
		
		
		ign = new JTextField();
		ign.setBounds(31, 69, 191, 19);
		frame.getContentPane().add(ign);
		ign.setColumns(10);
		
		pw = new JPasswordField();
		pw.setBounds(31, 119, 191, 19);
		frame.getContentPane().add(pw);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i = ign.getText();
				String p = String.valueOf(pw.getPassword());
				String reg = "insert into users "
						+"(fullname,password1)"
						+" values ('"+i+"','"+p+"')";
				try {
					st = c.createStatement();
					rs = st.executeQuery("select * from users");
					st.executeUpdate(reg);
					
					JLabel suc = new JLabel("Successfully created account");
					suc.setBounds(31, 194, 150, 13);
					frame.getContentPane().add(suc);
				} catch (SQLException e1) {

					e1.printStackTrace();
					JLabel suc = new JLabel("Error");
					suc.setBounds(31, 194, 90, 13);
					frame.getContentPane().add(suc);
				}
				
				
			}
		});
		btnNewButton.setBounds(324, 167, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Log in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(324, 139, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(31, 46, 99, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(31, 98, 85, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
	}
}
