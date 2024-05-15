package regWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class regCrs {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regCrs window = new regCrs();
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
	public regCrs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 434, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 402, 362);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Courses", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(161, 29, 200, 260);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"", "Subject"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		textField = new JTextField();
		textField.setBounds(28, 43, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Course Name");
		lblNewLabel.setBounds(28, 18, 86, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_1 = new JTextField();
		textField_1.setBounds(28, 99, 86, 20);
		panel.add(textField_1);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JLabel lblTotalUnits = new JLabel("Total Units");
		lblTotalUnits.setBounds(28, 74, 86, 14);
		panel.add(lblTotalUnits);
		lblTotalUnits.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton_1 = new JButton("Save Course");
		btnNewButton_1.setBounds(28, 193, 103, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Manage Subjects");
		btnNewButton.setBounds(193, 300, 129, 23);
		panel.add(btnNewButtonpes[c	
		JLabel lblSubjects = new JLabel("Subjects");
		lblSubjects.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubjects.setBounds(161, 11, 200, 14);
		panel.add(lblSubjects);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Edit Course", null, panel_1, null);
	olumnIndex];
			}
		});
	}
}
