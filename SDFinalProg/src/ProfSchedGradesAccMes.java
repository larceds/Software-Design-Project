import java.awt.EventQueue;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.SwingConstants;


import javax.swing.JFrame;
import javax.swing.JTextField;

public class ProfSchedGradesAccMes {

	private JFrame frame;
	private JLabel txtWelcomeStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfSchedGradesAccMes window = new ProfSchedGradesAccMes();
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
	public ProfSchedGradesAccMes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1147, 715);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1131, 676);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("LOG OUT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(1032, 100, 89, 23);
		panel.add(btnNewButton);
		
		txtWelcomeStudent = new JLabel();
		txtWelcomeStudent.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtWelcomeStudent.setText("WELCOME STUDENT");
		txtWelcomeStudent.setBounds(10, 102, 130, 20);
		panel.add(txtWelcomeStudent);
		
		JLabel lblNewLabel = new JLabel("BackGround");
		lblNewLabel.setBounds(0, 0, 1131, 91);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gaming\\Downloads\\434627077_1175237720161374_3404114073950410921_n.jpg"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGO");
		lblNewLabel_1.setBounds(0, 87, 1131, 589);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Gaming\\Downloads\\435025794_1107787247218589_5248061200249681595_n.png"));
		panel.add(lblNewLabel_1);
	}
}
