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
import javax.swing.ImageIcon;

public class std {

	JFrame frame;
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
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStd = new JLabel("STUDENTS");
		lblStd.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblStd.setHorizontalAlignment(SwingConstants.CENTER);
		lblStd.setBounds(613, 123, 147, 31);
		frame.getContentPane().add(lblStd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(393, 155, 541, 387);
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
		btnSrch.setBounds(149, 274, 39, 23);
		frame.getContentPane().add(btnSrch);
		
		JButton btnReg = new JButton("Register Student");
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				regWin.regStd win= new regWin.regStd();
				win.frame.setVisible(true);
			}
		});
		btnReg.setBounds(95, 448, 137, 23);
		frame.getContentPane().add(btnReg);
		
		JButton btnChcStd = new JButton("Check Student");
		btnChcStd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChcStd.setBounds(95, 392, 137, 23);
		frame.getContentPane().add(btnChcStd);
		
		txtStdNm = new JTextField();
		txtStdNm.setBounds(95, 187, 147, 20);
		frame.getContentPane().add(txtStdNm);
		txtStdNm.setColumns(10);
		
		txtStdNum = new JTextField();
		txtStdNum.setBounds(95, 240, 147, 23);
		frame.getContentPane().add(txtStdNum);
		txtStdNum.setColumns(10);
		
		JLabel lblStdNum = new JLabel("Student Number");
		lblStdNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblStdNum.setBounds(95, 218, 147, 14);
		frame.getContentPane().add(lblStdNum);
		
		JLabel lblStdNm_1 = new JLabel("Student Name");
		lblStdNm_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStdNm_1.setBounds(127, 162, 82, 14);
		frame.getContentPane().add(lblStdNm_1);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				pf win= new pf();
				win.setVisible(true);
			}
		});
		btnNewButton.setBounds(28, 83, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Student");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				std win= new std();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(463, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Courses");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				crs win= new crs();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(290, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Schedule");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(203, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win= new strWin.LogWindow();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(876, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Grade");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win= new gr();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(116, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Account");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				acc win= new acc();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(374, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel lblLogo = new JLabel("logo");
		lblLogo.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblLogo.setBounds(0, 0, 975, 75);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel.setBounds(0, 68, 975, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_1.setBounds(-14, 101, 999, 484);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
	}
}
