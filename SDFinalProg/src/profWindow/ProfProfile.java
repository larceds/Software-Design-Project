package profWindow;

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
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JCheckBox;

public class ProfProfile extends JFrame {

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
	private JTextField txtTysonmikegmailcom;
	private JTextField txtTeachingYears;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfProfile frame = new ProfProfile();
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
	public ProfProfile() {
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
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Student\\Downloads\\topback.jpg"));
		lblNewLabel_1.setBounds(0, 0, 975, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Student\\Downloads\\put pic.jpg"));
		lblNewLabel.setBounds(753, 136, 101, 102);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(new Color(255, 128, 128));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Student\\Downloads\\iconpic.jpg"));
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
		
		JLabel lblNewLabel_4 = new JLabel("Welcome, Tyson , Mike kingkong (09223341515)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(38, 113, 389, 14);
		contentPane.add(lblNewLabel_4);
		
		txtTyson = new JTextField();
		txtTyson.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTyson.setHorizontalAlignment(SwingConstants.CENTER);
		txtTyson.setText("Tyson");
		txtTyson.setEditable(false);
		txtTyson.setBounds(38, 195, 167, 20);
		contentPane.add(txtTyson);
		txtTyson.setColumns(10);
		
		txtMike = new JTextField();
		txtMike.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtMike.setHorizontalAlignment(SwingConstants.CENTER);
		txtMike.setText("Mike");
		txtMike.setEditable(false);
		txtMike.setBounds(208, 195, 172, 20);
		contentPane.add(txtMike);
		txtMike.setColumns(10);
		
		txtKingkong = new JTextField();
		txtKingkong.setEditable(false);
		txtKingkong.setText("KingKong");
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
		
		txtComputerScience = new JTextField();
		txtComputerScience.setEditable(false);
		txtComputerScience.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtComputerScience.setText("Computer Science ");
		txtComputerScience.setBounds(117, 273, 161, 20);
		contentPane.add(txtComputerScience);
		txtComputerScience.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Designation:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(283, 277, 78, 14);
		contentPane.add(lblNewLabel_8);
		
		txtWebDeveloperAnd = new JTextField();
		txtWebDeveloperAnd.setEditable(false);
		txtWebDeveloperAnd.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtWebDeveloperAnd.setText("Web Developer And Software Developer");
		txtWebDeveloperAnd.setBounds(355, 274, 240, 20);
		contentPane.add(txtWebDeveloperAnd);
		txtWebDeveloperAnd.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Area Of Specialization:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(28, 312, 143, 14);
		contentPane.add(lblNewLabel_9);
		
		txtDataProcessingInformation = new JTextField();
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
		txtMiketysoncvteaceduph.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtMiketysoncvteaceduph.setText("Mike.tyson.cvt@eac.edu.ph");
		txtMiketysoncvteaceduph.setBounds(63, 406, 170, 20);
		contentPane.add(txtMiketysoncvteaceduph);
		txtMiketysoncvteaceduph.setColumns(10);
		
		txtTysonmikegmailcom = new JTextField();
		txtTysonmikegmailcom.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTysonmikegmailcom.setText("tysonmike@gmail.com");
		txtTysonmikegmailcom.setBounds(63, 428, 170, 20);
		contentPane.add(txtTysonmikegmailcom);
		txtTysonmikegmailcom.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("No. of Years of Experience:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_14.setBounds(246, 379, 160, 14);
		contentPane.add(lblNewLabel_14);
		
		txtTeachingYears = new JTextField();
		txtTeachingYears.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTeachingYears.setEditable(false);
		txtTeachingYears.setText("Teaching: 8 Years");
		txtTeachingYears.setBounds(405, 376, 190, 20);
		contentPane.add(txtTeachingYears);
		txtTeachingYears.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\Student\\Downloads\\SecondTop.png"));
		lblNewLabel_15.setBounds(0, 67, 975, 41);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\Student\\Downloads\\bottom.jpg"));
		lblNewLabel_16.setBounds(-285, 515, 1274, 56);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\Student\\Downloads\\background.png"));
		lblNewLabel_17.setBounds(0, 0, 975, 571);
		contentPane.add(lblNewLabel_17);
	}
}
