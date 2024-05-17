package admWin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import strWin.LogWindow;

public class adminWinMain extends JFrame {
    static Connection c = null ;
    static ResultSet rs=null;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTyson;
	private JTextField txtMike;
	private JTextField txtKingkong;
	private JTextField txtComputerScience;
	private JTextField txtWebDeveloperAnd;
	private JTextField txtDataProcessingInformation;
	private JTextField txtMarch;
	private JTextField txtRegularProfessor;
	private JTextField textField;
	private JTextField txtMiketysoncvteaceduph;
	
	/**
	 * Launch the application.
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args){
		
		//==============================================================================================
		try {
			  c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/view1","root","kenn232004");
			  Statement st=c.createStatement();
			  rs=st.executeQuery("select * from profview");
			System.out.println("not gwenchana");	
			}catch (Exception e){
			System.out.println("gwenchanay");
			}
		Statement st;
		try {
			st=c.createStatement();
			rs=st.executeQuery("select * from profview");
			String s ="insert into profview"+"(lastname,firstname,Middlename,email)"+"values ('asd','fgh','qwe','rty')";
			//st.executeUpdate(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//=========================================================================================================
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					adminWinMain frame = new adminWinMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	});
	}


	/**
	 * Create the frame.
	 */
	public adminWinMain() {
		setAlwaysOnTop(true);
		setBackground(new Color(255, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 991, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				adminWinMain win= new adminWinMain();
				win.setVisible(true);
			}
		});
		btnNewButton.setBounds(28, 79, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Grade");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				gr win= new gr();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(116, 79, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Schedule");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				sch win= new sch();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(203, 79, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel_1.setBounds(0, 0, 975, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(new Color(255, 128, 128));
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/icon.jpg")));
		lblNewLabel_2.setBounds(38, 150, 23, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("LOG OUT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				strWin.LogWindow win = new strWin.LogWindow();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(128, 0, 0));
		btnNewButton_3.setBounds(823, 79, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Personal Information");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_3.setBounds(61, 152, 172, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel();
		try {
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/view1","root","kenn232004");
			  Statement st=c.createStatement();
			  rs=st.executeQuery("select * from profview where id=9");
			 String Lname =null;
			 String fname =null;
			 String mname =null;
			  while(rs.next()) {
				  mname=rs.getString(3);
				  fname=rs.getString(2);
				   Lname = rs.getString(1);
			  }
			  lblNewLabel_4.setText("Welcome, " + Lname + " " + fname +" " + mname);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			
		}
		
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(38, 113, 389, 14);
		contentPane.add(lblNewLabel_4);
		
		txtTyson = new JTextField();
		txtTyson.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTyson.setHorizontalAlignment(SwingConstants.CENTER);
		try {
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/view1","root","kenn232004");
			  Statement st=c.createStatement();
			  rs=st.executeQuery("select lastname from profview where id=9");
			 String Lname =null;
			  while(rs.next()) {
				   Lname = rs.getString(1);
			  }
			txtTyson.setText(Lname);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			
		}
		txtTyson.setEditable(false);
		txtTyson.setBounds(38, 195, 167, 20);
		contentPane.add(txtTyson);
		txtTyson.setColumns(10);
		
		txtMike = new JTextField();
		txtMike.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtMike.setHorizontalAlignment(SwingConstants.CENTER);
		try {
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/view1","root","kenn232004");
			  Statement st=c.createStatement();
			  rs=st.executeQuery("select firstname from profview where id=9");
			 String Lname =null;
			  while(rs.next()) {
				   Lname = rs.getString(1);
			  }
			txtMike.setText(Lname);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			
		}
		txtMike.setEditable(false);
		txtMike.setBounds(208, 195, 172, 20);
		contentPane.add(txtMike);
		txtMike.setColumns(10);
		
		txtKingkong = new JTextField();
		txtKingkong.setEditable(false);
		try {
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/view1","root","kenn232004");
			  Statement st=c.createStatement();
			  rs=st.executeQuery("select Middlename from profview where id=9");
			 String Lname =null;
			  while(rs.next()) {
				   Lname = rs.getString(1);
			  }
			txtKingkong.setText(Lname);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			
		}
		txtKingkong.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtKingkong.setHorizontalAlignment(SwingConstants.CENTER);
		txtKingkong.setBounds(383, 195, 167, 20);
		contentPane.add(txtKingkong);
		txtKingkong.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Last Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setBounds(82, 224, 67, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("First Name");
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(258, 225, 67, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Middle Name");
		lblNewLabel_5_2.setForeground(Color.BLACK);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_2.setBounds(423, 224, 77, 14);
		contentPane.add(lblNewLabel_5_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Male");
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(753, 292, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Female");
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_1.setBounds(753, 315, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Gender:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(753, 271, 67, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Master Degree:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(28, 276, 101, 14);
		contentPane.add(lblNewLabel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(117, 273, 161, 20);
		contentPane.add(scrollPane);
		
		txtComputerScience = new JTextField();
		txtComputerScience.setEnabled(false);
		scrollPane.setViewportView(txtComputerScience);
		txtComputerScience.setEditable(false);
		txtComputerScience.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtComputerScience.setText("Computer Science ");
		txtComputerScience.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Designation:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(283, 277, 78, 14);
		contentPane.add(lblNewLabel_8);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(355, 273, 268, 20);
		contentPane.add(scrollPane_1);
		
		txtWebDeveloperAnd = new JTextField();
		txtWebDeveloperAnd.setEnabled(false);
		scrollPane_1.setViewportView(txtWebDeveloperAnd);
		txtWebDeveloperAnd.setEditable(false);
		txtWebDeveloperAnd.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtWebDeveloperAnd.setText("Web Developer And Software Developer");
		txtWebDeveloperAnd.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Area Of Specialization:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(28, 312, 143, 14);
		contentPane.add(lblNewLabel_9);
		
		txtDataProcessingInformation = new JTextField();
		txtDataProcessingInformation.setEnabled(false);
		txtDataProcessingInformation.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDataProcessingInformation.setForeground(new Color(0, 0, 0));
		txtDataProcessingInformation.setEditable(false);
		txtDataProcessingInformation.setText("Data Processing, Information Technology and Software Engineering");
		txtDataProcessingInformation.setBounds(159, 309, 436, 20);
		contentPane.add(txtDataProcessingInformation);
		txtDataProcessingInformation.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Date of Joining EAC :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(28, 344, 121, 14);
		contentPane.add(lblNewLabel_10);
		
		txtMarch = new JTextField();
		txtMarch.setEnabled(false);
		txtMarch.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtMarch.setEditable(false);
		txtMarch.setText("March 29 , 2018");
		txtMarch.setBounds(147, 341, 113, 20);
		contentPane.add(txtMarch);
		txtMarch.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel(" Nature of Association:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(270, 344, 148, 14);
		contentPane.add(lblNewLabel_11);
		
		txtRegularProfessor = new JTextField();
		txtRegularProfessor.setEnabled(false);
		txtRegularProfessor.setEditable(false);
		txtRegularProfessor.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtRegularProfessor.setText("Regular Professor");
		txtRegularProfessor.setBounds(405, 340, 190, 20);
		contentPane.add(txtRegularProfessor);
		txtRegularProfessor.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Mobile No:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(28, 379, 67, 14);
		contentPane.add(lblNewLabel_12);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setEditable(false);
		textField.setText("09223341515");
		textField.setBounds(94, 376, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Email:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(28, 409, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		txtMiketysoncvteaceduph = new JTextField();
		txtMiketysoncvteaceduph.setEnabled(false);
		txtMiketysoncvteaceduph.setEditable(false);
		txtMiketysoncvteaceduph.setFont(new Font("Tahoma", Font.BOLD, 11));
		try {
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/view1","root","kenn232004");
			  Statement st=c.createStatement();
			  rs=st.executeQuery("select email from profview where id=9");
			 String Lname =null;
			  while(rs.next()) {
				   Lname = rs.getString(1);
			  }
			txtMiketysoncvteaceduph.setText(Lname);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			
		}
		txtMiketysoncvteaceduph.setBounds(63, 406, 170, 20);
		contentPane.add(txtMiketysoncvteaceduph);
		txtMiketysoncvteaceduph.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Courses");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBackground(new Color(131, 7, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				crs win = new crs();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(291, 79, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Account");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setBackground(new Color(131, 7, 11));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				acc win= new acc();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(380, 79, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Students");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(131, 7, 11));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				std win=new std();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton_6.setBounds(468, 79, 97, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Change Password");
		btnNewButton_7.setBackground(new Color(131, 7, 11));
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_7.setBounds(740, 470, 134, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Professors");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8.setBackground(new Color(131, 7, 11));
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				prof win = new prof();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(560, 79, 101, 23);
		contentPane.add(btnNewButton_8);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_15.setBounds(0, 67, 975, 41);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_16.setBounds(-285, 515, 1274, 56);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_17.setBounds(-29, 12, 1038, 594);
		contentPane.add(lblNewLabel_17);
		
		
		
		
		
		
	}
}
