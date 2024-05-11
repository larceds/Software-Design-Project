package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class crs {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crs window = new crs();
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
	public crs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Profile");
		btnNewButton_2.setBounds(35, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Grade");
		btnNewButton_3.setBounds(120, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Schedule");
		btnNewButton_4.setBounds(205, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Courses");
		btnNewButton_5.setBounds(291, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Account");
		btnNewButton_6.setBounds(378, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton button = new JButton("Student");
		button.setBounds(465, 70, 89, 23);
		frame.getContentPane().add(button);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(39, 124, 882, 380);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Course", null, panel, null);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(66, 26, 126, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Course Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(66, 57, 126, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(256, 26, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Total Units");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(256, 57, 86, 14);
		panel.add(lblNewLabel_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(92, 115, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Subjects");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(92, 146, 86, 14);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Add Course");
		btnNewButton_1.setBounds(451, 25, 89, 23);
		panel.add(btnNewButton_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(79, 171, 514, 178);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Edit Course", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Add Subject", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(89, 29, 86, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(330, 29, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(518, 29, 86, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Subject Name");
		lblNewLabel_3.setBounds(89, 60, 86, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel label = new JLabel("No. of Units");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(330, 60, 86, 14);
		panel_2.add(label);
		
		JLabel lblNewLabel_4 = new JLabel("Pre-requisites");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(89, 169, 86, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Subject Code");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(518, 60, 86, 14);
		panel_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 148, 86, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Add Subject");
		btnNewButton_7.setBounds(590, 341, 89, 23);
		panel_2.add(btnNewButton_7);
		
		table_2 = new JTable();
		table_2.setBounds(89, 194, 614, 129);
		panel_2.add(table_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Edit Subject", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("See Courses ", null, panel_4, null);
		panel_4.setLayout(null);
		
		JMenu mnNewMenu = new JMenu("Course");
		mnNewMenu.setBounds(22, 24, 115, 26);
		panel_4.add(mnNewMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 76, 576, 262);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Subject Code", "Subject Name", "Units", "Pre-requisites"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(832, 70, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel_6.setBounds(0, 0, 975, 66);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_7.setBounds(0, 59, 975, 45);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_8.setBounds(0, 533, 1000, 38);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_9.setBounds(-15, 87, 1000, 447);
		frame.getContentPane().add(lblNewLabel_9);
	}
}
