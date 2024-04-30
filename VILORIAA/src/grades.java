import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class grades {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	grades window = new grades();
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
    public grades() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setEnabled(false);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setBounds(100, 100, 1258, 610);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, -8, 1529, 94);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\434637222_2369367910121302_5462547168545990256_n.jpg"));
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("Grades");
        btnNewButton.setBounds(159, 97, 98, 24);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openGradesWindow();
            }
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(204, 4, 34));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        frame.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Profile");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
		btnNewButton_1.setBounds(33, 97, 98, 24);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBackground(new Color(204, 4, 34));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.setBounds(283, 97, 98, 24);
		btnSchedule.setForeground(new Color(255, 255, 255));
		btnSchedule.setBackground(new Color(204, 4, 34));
		btnSchedule.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnSchedule);
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(1102, 97, 98, 24);
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(204, 4, 34));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBounds(-10, 78, 1262, 68);
		panel.setBackground(new Color(149, 0, 0));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-389, 505, 1633, 68);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ACER\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-04-20 154402.png"));
		frame.getContentPane().add(lblNewLabel_2);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/EAC.png"));
		lblNewLabel.setIcon(img);

        // Other buttons and components omitted for brevity
    }

    /**
     * Open the grades window.
     */
		    private void openGradesWindow() {
			    	frame = new JFrame("Grades - 1st Semester");
			        frame.setSize(600, 400);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
			        String[] columnNames = {"Subject", "Prelim", "Midterm", "Finals", "Average"};
			        Object[][] data = {
			            {"Numerical Method", 85, 78, 90, null},
			            {"FEC Lecture", 80, 75, 85, null},	
			            {"Art App", 88, 82, 87, null},
			            {"Software Design Lecture", 75, 70, 80, null},
			            {"Survival Technique", 90, 85, 95, null},
			            {"FEC Lab", 85, 80, 88, null},
			            {"Ethics", 92, 88, 95, null},
			            {"Rizal", 78, 75, 85, null},
			            {"Software Design Lab", 80, 76, 82, null}
			        };
	
			        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
			            @Override
			            public Class<?> getColumnClass(int columnIndex) {
			                return columnIndex == 0 ? String.class : Integer.class;
			            }
	
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false;
			            }
			        };
	
			        JTable table = new JTable(model);
	
			        // Calculate average for each row and add to the table
			        for (int row = 0; row < model.getRowCount(); row++) {
			            int sum = 0;
			            for (int col = 1; col < 4; col++) {
			                sum += (int) model.getValueAt(row, col);
			            }
			            double average = sum / 3.0;
			            model.setValueAt(String.format("%.2f", average), row, 4);
			        }
	
			        JScrollPane scrollPane = new JScrollPane(table);
			        frame.getContentPane().add(scrollPane);
			        frame.setVisible(true);
			    }
			}