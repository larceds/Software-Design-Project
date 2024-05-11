package regWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class regSch {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regSch window = new regSch();
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
	public regSch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1197, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(78, 131, 1017, 557);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("Add schedule", null, panel, null);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(27);
		table.setBounds(67, 134, 877, 299);
		panel.add(table);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(486, 473, 115, 30);
		panel.add(btnNewButton);
		
		JButton btnClearEntry = new JButton("Clear entry\r\n");
		btnClearEntry.setBounds(647, 473, 115, 30);
		panel.add(btnClearEntry);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDone.setBounds(799, 473, 115, 30);
		panel.add(btnDone);
		
		textField = new JTextField();
		textField.setBounds(111, 74, 70, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Time in");
		lblNewLabel_2.setBounds(111, 55, 70, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(410, 74, 169, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(713, 74, 169, 20);
		panel.add(textField_2);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Subject");
		lblNewJgoodiesLabel.setBounds(410, 55, 92, 14);
		panel.add(lblNewJgoodiesLabel);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(201, 74, 70, 20);
		panel.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Time out");
		lblNewLabel_2_1.setBounds(201, 55, 70, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Profesor");
		lblNewLabel_2_2.setBounds(713, 55, 70, 14);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Schedule Registration");
		lblNewJgoodiesLabel_1.setFont(new Font("Constantia", Font.BOLD, 24));
		lblNewJgoodiesLabel_1.setBounds(354, 11, 276, 33);
		panel.add(lblNewJgoodiesLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("Schedule");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(67, 121, 102, 14);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("Delete", null, panel_1, null);
		panel_1.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
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
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table_1.setBounds(67, 139, 869, 295);
		panel_1.add(table_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(642, 466, 115, 30);
		panel_1.add(btnSave);
		
		JButton btnClearEntry_2 = new JButton("Done");
		btnClearEntry_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClearEntry_2.setBounds(796, 466, 115, 30);
		panel_1.add(btnClearEntry_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select Schedule to Delete");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(67, 114, 214, 24);
		panel_1.add(lblNewLabel_3);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(642, 98, 115, 30);
		panel_1.add(btnDelete);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.setBounds(796, 98, 115, 30);
		panel_1.add(btnUndo);
		
		JLabel lblNewLabel_4 = new JLabel("Schedule Cancelation");
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 23));
		lblNewLabel_4.setBounds(365, 22, 282, 30);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("Edit", null, panel_2, null);
		panel_2.setLayout(null);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table_2.setBounds(72, 151, 869, 295);
		panel_2.add(table_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Schedule Edit");
		lblNewLabel_4_1.setFont(new Font("Constantia", Font.BOLD, 23));
		lblNewLabel_4_1.setBounds(422, 11, 213, 30);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("Select Schedule to Edit");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(72, 126, 163, 30);
		panel_2.add(lblNewLabel_5);
		
		JButton btnSave_1 = new JButton("Save");
		btnSave_1.setBounds(653, 469, 115, 30);
		panel_2.add(btnSave_1);
		
		JButton btnUndo_1 = new JButton("Undo");
		btnUndo_1.setBounds(814, 469, 115, 30);
		panel_2.add(btnUndo_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 88, 70, 20);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(199, 88, 70, 20);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(412, 88, 169, 20);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(705, 88, 169, 20);
		panel_2.add(textField_7);
		
		JLabel lblNewLabel_7 = new JLabel("Time in");
		lblNewLabel_7.setBounds(111, 73, 46, 14);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Time out");
		lblNewLabel_7_1.setBounds(199, 73, 70, 14);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Subject ");
		lblNewLabel_7_2.setBounds(412, 73, 56, 14);
		panel_2.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Profesor ");
		lblNewLabel_7_3.setBounds(705, 73, 63, 14);
		panel_2.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel = new JLabel("banner eac");
		lblNewLabel.setBounds(0, -14, 1181, 96);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("backround");
		lblNewLabel_1.setBounds(0, 66, 1181, 707);
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		frame.getContentPane().add(lblNewLabel_1);
	}
}
