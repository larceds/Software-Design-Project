package profWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sch {

	JFrame frame;
	private JTable table;
	private JTable table_1;

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
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Grades");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gr win= new gr();
				win.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(181, 84, 74, 24);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(131, 7, 11));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_5_1.setBounds(2, 530, 975, 56);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pf win = new pf();
			win.setVisible(true);
			frame.dispose();
			}
		});
		btnNewButton_1.setBounds(33, 84, 74, 24);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(131, 7, 11));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.setVisible(true);
			}
		});
		btnSchedule.setBounds(106, 84, 77, 24);
		btnSchedule.setForeground(new Color(255, 255, 255));
		btnSchedule.setBackground(new Color(131, 7, 11));
		btnSchedule.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().add(btnSchedule);
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.setBounds(856, 82, 88, 24);
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(131, 7, 11));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome, ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(33, 119, 74, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JList list = new JList();
		list.setBackground(Color.BLACK);
		list.setBounds(165, 339, 156, -89);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_2 = new JLabel("Sem:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(210, 157, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("School Year:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(19, 157, 88, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 181, 911, 157);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
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
			},
			new String[] {
				"#", "Subject Code", "Description", "Lec", "Lab", "Units", "Schedule"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Double.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(24);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(341);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(34);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(34);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(40);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setPreferredWidth(297);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(131, 7, 11));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2022 - 2023", "2023 - 2024", "2024 - 2025"}));
		comboBox.setBounds(97, 154, 103, 21);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(new Color(255, 255, 255));
		comboBox_1.setBackground(new Color(131, 7, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"First", "Second", "Summer"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setBounds(241, 154, 88, 21);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 977, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(19, 358, 952, 142);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.getTableHeader().setReorderingAllowed(false);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		table_1.getColumnModel().getColumn(3).setResizable(false);
		table_1.getColumnModel().getColumn(4).setResizable(false);
		table_1.getColumnModel().getColumn(5).setResizable(false);
		table_1.getColumnModel().getColumn(6).setResizable(false);
		table_1.getColumnModel().getColumn(7).setResizable(false);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_4.setBounds(0, 120, 977, 453);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_5.setBounds(0, 67, 975, 56);
		frame.getContentPane().add(lblNewLabel_5);
		
		
	}
}