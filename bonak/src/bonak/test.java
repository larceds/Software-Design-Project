package bonak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;

public class test {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 152, 861, 234);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane surroundwithscrollPane = new JScrollPane();
		surroundwithscrollPane.setBounds(0, 0, 861, 234);
		panel.add(surroundwithscrollPane);
		
		table = new JTable();
		table.setBackground(new Color(245, 245, 245));
		surroundwithscrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"  #", "              Subject Code", "                              Description", " Lec", " Lab", " Units", "                                              Schedule "
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(160);
		table.getColumnModel().getColumn(2).setPreferredWidth(240);
		table.getColumnModel().getColumn(3).setPreferredWidth(35);
		table.getColumnModel().getColumn(4).setPreferredWidth(35);
		table.getColumnModel().getColumn(5).setPreferredWidth(45);
		table.getColumnModel().getColumn(6).setPreferredWidth(350);
		
		table_1 = new JTable();
		surroundwithscrollPane.setColumnHeaderView(table_1);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(0, 0, 887, 72);
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\HP\\Documents\\ivan\\Software-Design-Project\\images\\logo.jpg"));
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Welcome, (Last Name, First Name) (Student Number)");
		lblNewLabel_9.setBounds(55, 127, 352, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Account");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(40, 83, 89, 23);
		btnNewButton.setBackground(new Color(128, 0, 0));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" Profile");
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(147, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Schedule\r\n\r\n");
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(256, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Grades\r\n");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(128, 0, 0));
		btnNewButton_3.setBounds(365, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\HP\\Documents\\ivan\\Software-Design-Project\\images\\bg.jpg"));
		lblNewLabel_6.setBounds(0, 0, 887, 450);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
