package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class gr {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gr window = new gr();
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
	public gr() {
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
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.setBounds(35, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Grade");
		btnNewButton_2.setBounds(121, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.setBounds(207, 69, 89, 23);
		frame.getContentPane().add(btnSchedule);
		
		JButton btnNewButton_3 = new JButton("Courses");
		btnNewButton_3.setBounds(292, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Account");
		btnNewButton_4.setBounds(379, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Student");
		btnNewButton_5.setBounds(464, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Logout");
		btnNewButton_6.setBounds(861, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JMenu mnNewMenu = new JMenu("Subject\r\n");
		mnNewMenu.setBounds(35, 123, 115, 26);
		frame.getContentPane().add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Section");
		mnNewMenu_1.setBounds(167, 123, 115, 26);
		frame.getContentPane().add(mnNewMenu_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 193, 859, 273);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JButton btnNewButton = new JButton("Approve");
		btnNewButton.setBounds(10, 477, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Select All ");
		chckbxNewCheckBox.setBounds(69, 167, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 975, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_1.setBounds(0, 59, 975, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_1_1.setBounds(0, 530, 975, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_2.setBounds(0, 90, 975, 440);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
