package stdWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.DropMode;

public class gr extends JFrame {

	private JPanel contentPane;
	private JTextField txtSchoolYear;
	private JTextField txtAd;
	private JTextField txtCourseCodeTcpe;
	private JTextField txtGpa;
	private JTextField txtsubjectCodeDescriptions;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gr frame = new gr();
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
	public gr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setBounds(22, 78, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Grade");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(110, 78, 95, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Schedule");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(203, 78, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Log out");
		btnNewButton_3.setBounds(810, 78, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Welcome, Poging Roge (22-1-00380)");
		lblNewLabel.setBounds(22, 112, 308, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(22, 133, 877, 367);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Attention to all students");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(360, 11, 158, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\tViewing of grades online is strictly for personal use only! Students who want an official copy from the Registrar for interoffice transaction's , must make a request for the official document from the Registrar's Office.  \r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(10, 25, 867, 28);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Your GRADES posted in AIMS from the previous school years were part of the data we migrated from the old enrollment system and are still subject for checking and validation from the registrar.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_3.setBounds(48, 48, 848, 14);
		panel.add(lblNewLabel_3);
		
		txtSchoolYear = new JTextField();
		txtSchoolYear.setBackground(new Color(255, 128, 128));
		txtSchoolYear.setText("     \tSCHOOL YEAR 2324\t\t\t\tTERM SECOND");
		txtSchoolYear.setBounds(10, 73, 857, 20);
		panel.add(txtSchoolYear);
		txtSchoolYear.setColumns(10);
		
		txtAd = new JTextField();
		txtAd.setText("\tADMISSION STATUS OLD\t\t\t\tSCHOLASTIC STATUS REGULAR");
		txtAd.setBackground(new Color(255, 128, 128));
		txtAd.setBounds(10, 96, 857, 20);
		panel.add(txtAd);
		txtAd.setColumns(10);
		
		txtCourseCodeTcpe = new JTextField();
		txtCourseCodeTcpe.setText("\tCOURSE CODE TCPE\t\t\t\tCOURSE DESCRIPTION COMPUTER ENGINEERING");
		txtCourseCodeTcpe.setBackground(new Color(255, 128, 128));
		txtCourseCodeTcpe.setBounds(10, 119, 857, 20);
		panel.add(txtCourseCodeTcpe);
		txtCourseCodeTcpe.setColumns(10);
		
		txtGpa = new JTextField();
		txtGpa.setText("\tGPA");
		txtGpa.setBackground(new Color(255, 128, 128));
		txtGpa.setBounds(10, 144, 857, 20);
		panel.add(txtGpa);
		txtGpa.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 175, 867, 196);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtsubjectCodeDescriptions = new JTextField();
		txtsubjectCodeDescriptions.setEditable(false);
		txtsubjectCodeDescriptions.setForeground(Color.WHITE);
		txtsubjectCodeDescriptions.setText("\r\n\t#Subject code\tDescriptions\tUnits\tSection\tPrelims\tMidterm\tFinals\tSemestral Grade\tRemarks\r\n");
		txtsubjectCodeDescriptions.setBackground(new Color(128, 0, 0));
		txtsubjectCodeDescriptions.setBounds(10, 0, 848, 31);
		panel_1.add(txtsubjectCodeDescriptions);
		txtsubjectCodeDescriptions.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(240, 255, 255));
		textField_1.setBounds(10, 35, 848, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(240, 255, 255));
		textField_2.setBounds(10, 61, 848, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(240, 255, 255));
		textField_3.setBounds(10, 87, 848, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(240, 255, 255));
		textField_4.setBounds(10, 113, 848, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(240, 255, 255));
		textField_5.setBounds(10, 139, 848, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(240, 255, 255));
		textField_6.setBounds(10, 165, 848, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_2_1 = new JButton("Account");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setBackground(new Color(128, 0, 0));
		btnNewButton_2_1.setBounds(292, 78, 89, 23);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_6.setBounds(0, 65, 907, 44);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel_5.setBounds(0, 0, 907, 67);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_4.setBounds(-12, -13, 919, 573);
		contentPane.add(lblNewLabel_4);
		
		
	}
}
