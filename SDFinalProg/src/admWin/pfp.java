package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class pfp {

	private JFrame frame;
	private JTable gradesTable;
	private JTextField txtNameSrch;
	private JTextField txtIdSrch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pfp window = new pfp();
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
	public pfp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(227, 28, 43));
		frame.setBounds(100, 100, 796, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane adminPanel = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.setBounds(10, 65, 760, 315);
		frame.getContentPane().add(adminPanel);
		
		JPanel profile = new JPanel();
		adminPanel.addTab("Profile", null, profile, null);
		
		JPanel studList = new JPanel();
		adminPanel.addTab("Student List", null, studList, null);
		studList.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(244, 36, 501, 240);
		studList.add(scrollPane);
		
		gradesTable = new JTable();
		scrollPane.setViewportView(gradesTable);
		gradesTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		
		JLabel lblStudents = new JLabel("Students");
		lblStudents.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblStudents.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudents.setBounds(362, 11, 261, 21);
		studList.add(lblStudents);
		
		txtNameSrch = new JTextField();
		txtNameSrch.setBounds(23, 40, 175, 21);
		studList.add(txtNameSrch);
		txtNameSrch.setColumns(10);
		
		JButton btnSrch = new JButton("Search");
		btnSrch.setBounds(94, 128, 30, 23);
		studList.add(btnSrch);
		
		txtIdSrch = new JTextField();
		txtIdSrch.setColumns(10);
		txtIdSrch.setBounds(23, 96, 175, 21);
		studList.add(txtIdSrch);
		
		JLabel lblNameSrch = new JLabel("Student Name");
		lblNameSrch.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameSrch.setBounds(23, 18, 175, 14);
		studList.add(lblNameSrch);
		
		JLabel lblIDSrch = new JLabel("Student Number");
		lblIDSrch.setHorizontalAlignment(SwingConstants.CENTER);
		lblIDSrch.setBounds(23, 72, 175, 14);
		studList.add(lblIDSrch);
		
		JButton btnRegStud = new JButton("Register New Student");
		btnRegStud.setBounds(20, 230, 178, 29);
		studList.add(btnRegStud);
		
		JButton btnOpProf = new JButton("Check Student");
		btnOpProf.setBounds(23, 162, 175, 23);
		studList.add(btnOpProf);
		
		JPanel courses = new JPanel();
		adminPanel.addTab("Courses", null, courses, null);
		
		JPanel Sections = new JPanel();
		adminPanel.addTab("Sections", null, Sections, null);
		
		JPanel Schedule = new JPanel();
		adminPanel.addTab("Schedules", null, Schedule, null);
		
		JPanel grades = new JPanel();
		adminPanel.addTab("Grades", null, grades, null);
	}
}
