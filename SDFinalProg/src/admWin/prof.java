package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import strWin.LogWindow;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class prof {

	JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prof window = new prof();
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
	public prof() {
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
		
		JButton btnPf = new JButton("Profile");
		btnPf.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPf.setBackground(new Color(131, 7, 11));
		btnPf.setForeground(new Color(255, 255, 255));
		btnPf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				adminWinMain win = new adminWinMain();
				win.setVisible(true);
			}
		});
		btnPf.setBounds(34, 82, 89, 23);
		frame.getContentPane().add(btnPf);
		
		JButton btnGr = new JButton("Grades");
		btnGr.setBackground(new Color(131, 7, 11));
		btnGr.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGr.setForeground(new Color(255, 255, 255));
		btnGr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win = new gr();
				win.frame.setVisible(true);
			}
		});
		btnGr.setBounds(110, 82, 89, 23);
		frame.getContentPane().add(btnGr);
		
		JButton btnSch = new JButton("Schedule");
		btnSch.setForeground(new Color(255, 255, 255));
		btnSch.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSch.setBackground(new Color(131, 7, 11));
		btnSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
			}
		});
		btnSch.setBounds(197, 82, 89, 23);
		frame.getContentPane().add(btnSch);
		
		JButton btnCrs = new JButton("Courses");
		btnCrs.setForeground(new Color(255, 255, 255));
		btnCrs.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCrs.setBackground(new Color(131, 7, 11));
		btnCrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				crs win = new crs();
				win.frame.setVisible(true);
			}
		});
		btnCrs.setBounds(285, 82, 89, 23);
		frame.getContentPane().add(btnCrs);
		
		JButton btnAcc = new JButton("Account");
		btnAcc.setBackground(new Color(131, 7, 11));
		btnAcc.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAcc.setForeground(new Color(255, 255, 255));
		btnAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				acc win= new acc();
				win.frame.setVisible(true);
			}
		});
		btnAcc.setBounds(373, 82, 89, 23);
		frame.getContentPane().add(btnAcc);
		
		JButton btnStd = new JButton("Students");
		btnStd.setForeground(new Color(255, 255, 255));
		btnStd.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStd.setBackground(new Color(131, 7, 11));
		btnStd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				std win = new std();
				win.frame.setVisible(true);
			}
		});
		btnStd.setBounds(453, 82, 89, 23);
		frame.getContentPane().add(btnStd);
		
		JButton btnprof = new JButton("Professors");
		btnprof.setBackground(new Color(131, 7, 11));
		btnprof.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnprof.setForeground(new Color(255, 255, 255));
		btnprof.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				prof win = new prof();
				win.frame.setVisible(true);
			}
		});
		btnprof.setBounds(539, 82, 99, 23);
		frame.getContentPane().add(btnprof);
		
		JButton btnlog = new JButton("Logout");
		btnlog.setForeground(new Color(255, 255, 255));
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlog.setBackground(new Color(131, 7, 11));
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win= new strWin.LogWindow();
				win.frame.setVisible(true);
			}
		});
		btnlog.setBounds(861, 82, 89, 23);
		frame.getContentPane().add(btnlog);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 182, 862, 336);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.getTableHeader().setReorderingAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Professor Name", "Course Specialization", "Schedule"
			}
		));
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(47, 151, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(131, 7, 11));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(197, 148, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register ");
		btnNewButton_1.setBackground(new Color(131, 7, 11));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				regWin.regProf win = new regWin.regProf();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(768, 140, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setText("Welcome, null null null");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(34, 126, 389, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 975, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_1.setBounds(0, 73, 975, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_2.setBounds(0, 536, 975, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_3.setBounds(0, 116, 975, 422);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		
	}
}
