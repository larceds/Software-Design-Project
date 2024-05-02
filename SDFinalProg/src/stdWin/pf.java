package stdWin;

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

public class pf extends JFrame {
    static Connection c = null ;
    static ResultSet rs=null;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTyson;
	private JTextField txtMike;
	private JTextField txtKingkong;
	private JTextField txtComputerScience;
	private JTextField txtWebDeveloperAnd;
	private JTextField txtRegularProfessor;
	private JTextField textField;
	private JTextField txtMiketysoncvteaceduph;
	private JTextField txtTeachingYears;
	private JTextField txtTcpeBachelors;
	private JTextField txtYearOfThe;
	private JTextField textField_1;
	private JTextField txtFirst;
	private JTextField textField_2;
	private JTextField txtCatholic;
	private JTextField txtSingle;
	private JTextField textField_3;
	private JTextField textField_4;
	
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
					pf frame = new pf();
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
	public pf() {
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
			}
		});
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(133, 448, 143, 20);
		contentPane.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(133, 424, 143, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_10_2_2_1 = new JLabel("Residence Number :");
		lblNewLabel_10_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_2_2_1.setBounds(20, 451, 126, 14);
		contentPane.add(lblNewLabel_10_2_2_1);
		
		JLabel lblNewLabel_10_2_2 = new JLabel("Cellphone Number :");
		lblNewLabel_10_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_2_2.setBounds(23, 427, 113, 14);
		contentPane.add(lblNewLabel_10_2_2);
		
		JScrollPane scrollPane_2_1_1_1_1 = new JScrollPane();
		scrollPane_2_1_1_1_1.setBounds(357, 400, 143, 20);
		contentPane.add(scrollPane_2_1_1_1_1);
		
		txtSingle = new JTextField();
		txtSingle.setText("Single");
		txtSingle.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSingle.setEditable(false);
		txtSingle.setColumns(10);
		scrollPane_2_1_1_1_1.setViewportView(txtSingle);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Civil Status :");
		lblNewLabel_10_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_2_1.setBounds(286, 404, 121, 14);
		contentPane.add(lblNewLabel_10_2_1);
		
		JScrollPane scrollPane_2_1_1_2 = new JScrollPane();
		scrollPane_2_1_1_2.setBounds(133, 400, 143, 20);
		contentPane.add(scrollPane_2_1_1_2);
		
		txtCatholic = new JTextField();
		txtCatholic.setText("Catholic");
		txtCatholic.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCatholic.setEditable(false);
		txtCatholic.setColumns(10);
		scrollPane_2_1_1_2.setViewportView(txtCatholic);
		
		JLabel lblNewLabel_10_2 = new JLabel("Religion :");
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_2.setBounds(28, 404, 121, 14);
		contentPane.add(lblNewLabel_10_2);
		
		textField_2 = new JTextField();
		textField_2.setText((String) null);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(619, 376, 143, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_13_1 = new JLabel("Birth Place :");
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13_1.setBounds(528, 379, 79, 14);
		contentPane.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Name :");
		lblNewLabel_10_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_1_1.setBounds(28, 335, 121, 14);
		contentPane.add(lblNewLabel_10_1_1);
		
		JScrollPane scrollPane_2_1_1_1 = new JScrollPane();
		scrollPane_2_1_1_1.setBounds(357, 308, 143, 20);
		contentPane.add(scrollPane_2_1_1_1);
		
		txtFirst = new JTextField();
		txtFirst.setText("First");
		txtFirst.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtFirst.setEditable(false);
		txtFirst.setColumns(10);
		scrollPane_2_1_1_1.setViewportView(txtFirst);
		
		JLabel lblNewLabel_10_1 = new JLabel("Term :");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_1.setBounds(306, 310, 121, 14);
		contentPane.add(lblNewLabel_10_1);
		
		JScrollPane scrollPane_2_1_1 = new JScrollPane();
		scrollPane_2_1_1.setBounds(133, 308, 143, 20);
		contentPane.add(scrollPane_2_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("2024");
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		scrollPane_2_1_1.setViewportView(textField_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Foreign");
		chckbxNewCheckBox_1_1.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox_1_1.setBounds(133, 176, 97, 23);
		contentPane.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxFilipino = new JCheckBox("Filipino");
		chckbxFilipino.setForeground(new Color(0, 0, 0));
		chckbxFilipino.setSelected(true);
		chckbxFilipino.setBounds(28, 176, 97, 23);
		contentPane.add(chckbxFilipino);
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(133, 282, 367, 20);
		contentPane.add(scrollPane_2_1);
		
		txtYearOfThe = new JTextField();
		txtYearOfThe.setText("Year of the Student");
		txtYearOfThe.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtYearOfThe.setEditable(false);
		txtYearOfThe.setColumns(10);
		scrollPane_2_1.setViewportView(txtYearOfThe);
		
		JLabel lblNewLabel_9_1 = new JLabel("Level :");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9_1.setBounds(28, 285, 143, 14);
		contentPane.add(lblNewLabel_9_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(133, 257, 367, 20);
		contentPane.add(scrollPane_2);
		
		txtTcpeBachelors = new JTextField();
		txtTcpeBachelors.setText("TCPE - BACHELOR OF SCIENCE IN COMPUTER ENGINEERING");
		txtTcpeBachelors.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTcpeBachelors.setEditable(false);
		txtTcpeBachelors.setColumns(10);
		scrollPane_2.setViewportView(txtTcpeBachelors);
		btnNewButton.setBounds(28, 79, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Grade");
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(116, 79, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Schedule");
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(203, 79, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel_1.setBounds(0, 0, 975, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/plhd.jpg")));
		lblNewLabel.setBounds(776, 150, 101, 102);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(new Color(255, 128, 128));
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/icon.jpg")));
		lblNewLabel_2.setBounds(38, 150, 23, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("LOG OUT");
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
			  lblNewLabel_4.setText("Welcome, Student");
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
		txtTyson.setBounds(133, 335, 170, 20);
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
		txtMike.setBounds(302, 335, 170, 20);
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
		txtKingkong.setBounds(471, 335, 170, 20);
		contentPane.add(txtKingkong);
		txtKingkong.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Last Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setBounds(183, 354, 67, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("First Name");
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(356, 354, 67, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Middle Name");
		lblNewLabel_5_2.setForeground(Color.BLACK);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_2.setBounds(518, 354, 89, 14);
		contentPane.add(lblNewLabel_5_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Male");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(780, 279, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Female");
		chckbxNewCheckBox_1.setBounds(780, 306, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Gender:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(780, 263, 67, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Classification :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(28, 236, 101, 14);
		contentPane.add(lblNewLabel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(133, 233, 367, 20);
		contentPane.add(scrollPane);
		
		txtComputerScience = new JTextField();
		scrollPane.setViewportView(txtComputerScience);
		txtComputerScience.setEditable(false);
		txtComputerScience.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtComputerScience.setText("New");
		txtComputerScience.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Application For :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(28, 211, 101, 14);
		contentPane.add(lblNewLabel_8);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(133, 208, 367, 20);
		contentPane.add(scrollPane_1);
		
		txtWebDeveloperAnd = new JTextField();
		scrollPane_1.setViewportView(txtWebDeveloperAnd);
		txtWebDeveloperAnd.setEditable(false);
		txtWebDeveloperAnd.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtWebDeveloperAnd.setText("Bachelor's Degree");
		txtWebDeveloperAnd.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Course/Program :");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(28, 260, 143, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("School Year :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(28, 310, 121, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("LRN :");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(655, 339, 148, 14);
		contentPane.add(lblNewLabel_11);
		
		txtRegularProfessor = new JTextField();
		txtRegularProfessor.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtRegularProfessor.setBounds(687, 335, 190, 20);
		contentPane.add(txtRegularProfessor);
		txtRegularProfessor.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Birth Date :");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(28, 379, 67, 14);
		contentPane.add(lblNewLabel_12);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setEditable(false);
		textField.setBounds(133, 376, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Age :");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(306, 379, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		txtMiketysoncvteaceduph = new JTextField();
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
		txtMiketysoncvteaceduph.setBounds(357, 376, 143, 20);
		contentPane.add(txtMiketysoncvteaceduph);
		txtMiketysoncvteaceduph.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Email :");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_14.setBounds(299, 427, 53, 14);
		contentPane.add(lblNewLabel_14);
		
		txtTeachingYears = new JTextField();
		txtTeachingYears.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTeachingYears.setEditable(false);
		txtTeachingYears.setBounds(357, 424, 143, 20);
		contentPane.add(txtTeachingYears);
		txtTeachingYears.setColumns(10);
		
		JButton btnNewButton_2_1 = new JButton("Account");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1.setBackground(new Color(128, 0, 0));
		btnNewButton_2_1.setBounds(286, 79, 89, 23);
		contentPane.add(btnNewButton_2_1);
		
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_15.setBounds(0, 67, 975, 41);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_16.setBounds(-285, 515, 1274, 56);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_17.setBounds(-29, 12, 1038, 594);
		contentPane.add(lblNewLabel_17);
		
		
	}
}
