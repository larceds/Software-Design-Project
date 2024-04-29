package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pfp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pfp window = new pfp();
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
	public pfp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(227, 28, 43));
		frame.setBounds(100, 100, 796, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPfp = new JButton("Profile");
		btnPfp.setBounds(10, 31, 89, 23);
		frame.getContentPane().add(btnPfp);
		
		JButton btnStd = new JButton("Student List");
		btnStd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStd.setBounds(109, 31, 89, 23);
		frame.getContentPane().add(btnStd);
		
		JButton btnCrs = new JButton("Courses");
		btnCrs.setBounds(208, 31, 89, 23);
		frame.getContentPane().add(btnCrs);
		
		JButton btnSch = new JButton("Schedules");
		btnSch.setBounds(307, 31, 89, 23);
		frame.getContentPane().add(btnSch);
	}
}
