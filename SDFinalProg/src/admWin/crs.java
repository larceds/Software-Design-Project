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
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;

public class crs {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTable table;
	private JTable table_1;

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
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				pf win= new pf();
				win.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(35, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Grade");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win= new gr();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(120, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Schedule");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton_4.setBounds(205, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Courses");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				crs win= new crs();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton_5.setBounds(291, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Account");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				acc win= new acc();
				win.frame.setVisible(true);
				
			}
		});
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
		btnNewButton_1.setBounds(418, 265, 89, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Edit Course", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Edit Subject", null, panel_2, null);
		panel_2.setLayout(null);
		
		JMenu mnNewMenu_1 = new JMenu("Course");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.RIGHT);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		mnNewMenu_1.setBounds(0, 0, 117, 17);
		panel_2.add(mnNewMenu_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 40, 761, 313);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setToolTipText("");
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Subject Code", "Subject Name", "#Units"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_7 = new JButton("Delete subject");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_7.setBounds(558, 352, 106, 23);
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Add Subject");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_8.setBounds(663, 352, 89, 23);
		panel_2.add(btnNewButton_8);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("See Courses ", null, panel_4, null);
		panel_4.setLayout(null);
		
		JMenu mnNewMenu = new JMenu("Course");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		mnNewMenu.setBounds(0, 0, 117, 17);
		panel_4.add(mnNewMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 37, 759, 313);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Subject Code", "Subject Name", "#Units", "Pre-requisites"
			}
		));
		scrollPane.setViewportView(table);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 0, 0);
		panel_4.add(tabbedPane_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(114, 4, 92, 22);
		panel_4.add(comboBox);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win= new strWin.LogWindow();
				win.frame.setVisible(true);
				
			}
		});
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
