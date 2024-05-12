package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class sch {

	private JFrame frame;
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
					sch window = new sch();
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
	public sch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 53, 53));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_4_2_1 = new JButton("Student");
		btnNewButton_4_2_1.setBounds(488, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_4_2_1);
		
		JButton btnNewButton_4_2 = new JButton("Account");
		btnNewButton_4_2.setBounds(395, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_4_1 = new JButton("LOG OUT");
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4_1.setBounds(817, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_2 = new JButton("Profile");
		btnNewButton_2.setBounds(23, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Grade");
		btnNewButton_2_1.setBounds(116, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Schedule");
		btnNewButton_3.setBounds(209, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Course");
		btnNewButton_4.setBounds(302, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("BUTTON BG");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_3.setBounds(0, 72, 975, 36);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBounds(717, 532, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.setBounds(817, 532, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(70, 119, 836, 402);
		frame.getContentPane().add(tabbedPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("Search", null, scrollPane_1, null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, ""},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Time", "Subject", "Course/Section", "Faculty Name", "Room"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Set", null, scrollPane, null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Time", "Subject", "Course/Section", "Faculty Name", "Room"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		tabbedPane.addTab("Faculty", null, scrollPane_2, null);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Time", "Faculty Name", "Subject", "Course/Section", "Room"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblNewLabel = new JLabel("logo");
		lblNewLabel.setBounds(0, 0, 975, 73);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 975, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("bg");
		lblNewLabel_1.setBounds(0, 61, 975, 499);
		new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_1.setBounds(0, 72, 975, 499);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
