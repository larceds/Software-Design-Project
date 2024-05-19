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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import strWin.LogWindow;

public class sch {
	public static LogWindow log = new LogWindow();
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;
	HashSet<String> subj = new HashSet();

	JFrame frame;
	private JTable tblData;

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
		btnNewButton.setBounds(222, 84, 74, 24);
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
			profWinMain win = new profWinMain();
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
		btnSchedule.setBounds(97, 84, 127, 24);
		btnSchedule.setForeground(new Color(255, 255, 255));
		btnSchedule.setBackground(new Color(131, 7, 11));
		btnSchedule.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().add(btnSchedule);
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win = new strWin.LogWindow();
				win.frame.setVisible(true);
			}
		});
		btnLogout.setBounds(856, 82, 88, 24);
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(131, 7, 11));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnLogout);
		
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
		scrollPane.setBounds(33, 181, 911, 338);
		frame.getContentPane().add(scrollPane);
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			st = c.createStatement();
			rs = st.executeQuery("select sub_name from sub");
			while(rs.next()) {
				subj.add(rs.getString("sub_name"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		JComboBox schoolYear = new JComboBox();
		schoolYear.setBackground(new Color(131, 7, 11));
		schoolYear.setForeground(new Color(255, 255, 255));
		schoolYear.setFont(new Font("Tahoma", Font.BOLD, 10));
		schoolYear.setModel(new DefaultComboBoxModel(new String[] {"2024 - 2025","2025 - 2026"}));
		schoolYear.setBounds(97, 154, 103, 21);
		frame.getContentPane().add(schoolYear);
		
		JComboBox semester = new JComboBox();
		semester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tblData = new JTable();
		tblData.setRowSelectionAllowed(false);
		tblData.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(tblData);
		tblData.setFont(new Font("Tahoma", Font.BOLD, 13));
		tblData.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"Section", "Time in", "Time Out"
			}
		) {
			
			Class[] columnTypes = new Class[] {
				Object.class, Double.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
			
		});
		tblData.getColumnModel().getColumn(0).setResizable(false);
		tblData.getColumnModel().getColumn(0).setPreferredWidth(24);
		tblData.getColumnModel().getColumn(1).setResizable(false);
		tblData.getColumnModel().getColumn(2).setResizable(false);
		tblData.getColumnModel().getColumn(2).setPreferredWidth(341);
		
		JComboBox sub = new JComboBox(subj.toArray());
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String yr = schoolYear.getSelectedItem().toString();
				String sem = semester.getSelectedItem().toString();
				String subject = sub.getSelectedItem().toString();
				
				try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
					st = c.createStatement();
					rs = st.executeQuery("select sec, tin, tout from sch where sy = '"+yr+"' && term = '"+sem+"' && sub = '"+subject+"'");
					System.out.println("1");
					ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
					System.out.println("2");
				    int cols = rsmd.getColumnCount();
				    String[] colName = new String[cols];
				    for (int i = 0; i < cols; i++) {
				        colName[i] = rsmd.getColumnName(i + 1);
				    }
				    System.out.println("3");
				    DefaultTableModel model = (DefaultTableModel) tblData.getModel();
				    model.setRowCount(0);
				    while (rs.next()) {
				        Object[] rowData = new Object[cols];
				        for (int i = 0; i < cols; i++) {
				            rowData[i] = rs.getObject(i + 1);
				        }
				        model.addRow(rowData); 
				    }
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		sub.setForeground(Color.WHITE);
		sub.setFont(new Font("Tahoma", Font.BOLD, 11));
		sub.setBackground(new Color(131, 7, 11));
		sub.setBounds(372, 154, 185, 21);
		frame.getContentPane().add(sub);
		
		
		semester.setForeground(new Color(255, 255, 255));
		semester.setBackground(new Color(131, 7, 11));
		semester.setModel(new DefaultComboBoxModel(new String[] {"First", "Second", "Summer"}));
		semester.setFont(new Font("Tahoma", Font.BOLD, 11));
		semester.setBounds(241, 154, 88, 21);
		frame.getContentPane().add(semester);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 977, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_5.setBounds(0, 67, 975, 56);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sub:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(339, 158, 45, 13);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_4.setBounds(0, 120, 977, 453);
		frame.getContentPane().add(lblNewLabel_4);
	}
}