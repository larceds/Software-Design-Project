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
		btnPf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				pf win = new pf();
				win.setVisible(true);
			}
		});
		btnPf.setBounds(34, 82, 89, 23);
		frame.getContentPane().add(btnPf);
		
		JButton btnGr = new JButton("Grades");
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
		btnprof.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				prof win = new prof();
				win.frame.setVisible(true);
			}
		});
		btnprof.setBounds(539, 82, 89, 23);
		frame.getContentPane().add(btnprof);
		
		JButton btnlog = new JButton("Logout");
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
		scrollPane.setBounds(240, 147, 677, 371);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(55, 174, 114, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setBounds(69, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				regWin.regProf win = new regWin.regProf();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(69, 401, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
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
		
		JLabel lblNewLabel_4 = new JLabel("Professor Name");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(55, 154, 114, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_3.setBounds(0, 116, 975, 422);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
