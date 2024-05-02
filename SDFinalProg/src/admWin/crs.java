package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;

public class crs {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crs window = new crs();
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
	public crs() {
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
		
		JButton btnNewButton_2 = new JButton("Profile");
		btnNewButton_2.setBounds(35, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Grade");
		btnNewButton_3.setBounds(120, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Schedule");
		btnNewButton_4.setBounds(205, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Courses");
		btnNewButton_5.setBounds(291, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Account");
		btnNewButton_6.setBounds(378, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton button = new JButton("Student");
		button.setBounds(465, 70, 89, 23);
		frame.getContentPane().add(button);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(170, 166, 762, 349);
		frame.getContentPane().add(tabbedPane);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(832, 70, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
