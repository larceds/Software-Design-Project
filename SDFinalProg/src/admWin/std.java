package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class std {

	private JFrame frame;
	private JTable table;
	private JTextField txtStdNm;
	private JTextField txtStdNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					std window = new std();
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
	public std() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 45, 45));
		frame.getContentPane().setForeground(new Color(255, 0, 0));
		frame.setBounds(100, 100, 744, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStd = new JLabel("STUDENTS");
		lblStd.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblStd.setHorizontalAlignment(SwingConstants.CENTER);
		lblStd.setBounds(391, 59, 147, 31);
		frame.getContentPane().add(lblStd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(235, 101, 452, 203);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		
		JButton btnSrch = new JButton("New button");
		btnSrch.setBounds(80, 162, 39, 23);
		frame.getContentPane().add(btnSrch);
		
		JButton btnReg = new JButton("Register Student");
		btnReg.setBounds(37, 257, 137, 23);
		frame.getContentPane().add(btnReg);
		
		JButton btnChcStd = new JButton("Check Student");
		btnChcStd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChcStd.setBounds(37, 196, 137, 23);
		frame.getContentPane().add(btnChcStd);
		
		txtStdNm = new JTextField();
		txtStdNm.setBounds(27, 89, 147, 20);
		frame.getContentPane().add(txtStdNm);
		txtStdNm.setColumns(10);
		
		txtStdNum = new JTextField();
		txtStdNum.setBounds(27, 131, 147, 23);
		frame.getContentPane().add(txtStdNum);
		txtStdNum.setColumns(10);
		
		JLabel lblStdNum = new JLabel("Student Number");
		lblStdNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblStdNum.setBounds(27, 115, 147, 14);
		frame.getContentPane().add(lblStdNum);
		
		JLabel lblStdNm_1 = new JLabel("Student Name");
		lblStdNm_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStdNm_1.setBounds(66, 71, 82, 14);
		frame.getContentPane().add(lblStdNm_1);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setBounds(27, 37, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Student List");
		btnNewButton_1.setBounds(151, 37, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Courses");
		btnNewButton_2.setBounds(275, 37, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Schedules");
		btnNewButton_3.setBounds(393, 37, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
