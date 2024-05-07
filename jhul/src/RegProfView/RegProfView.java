package RegProfView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class RegProfView {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_5;
    private JTextField textField_6;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegProfView window = new RegProfView();
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
    public RegProfView() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 930, 499);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 916, 460);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Register");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get input data
                String fullName = textField.getText();
                String degree = textField_1.getText();
                String contactNo = textField_2.getText();
                String designation = textField_3.getText();
                String yearsOfExperience = textField_5.getText();
                String emailAddress = textField_6.getText();
                
                // Check if any field is empty
                if (fullName.isEmpty() || degree.isEmpty() || contactNo.isEmpty() ||
                    designation.isEmpty() || yearsOfExperience.isEmpty() || emailAddress.isEmpty()) {
                    // Display message if any field is empty
                    JOptionPane.showMessageDialog(frame, "You have to fill all the blanks to make a registration.");
                } else {
                    // Display registration details in console
                    System.out.println("Full Name: " + fullName);
                    System.out.println("Degree: " + degree);
                    System.out.println("Contact No: " + contactNo);
                    System.out.println("Designation: " + designation);
                    System.out.println("Years of Experience: " + yearsOfExperience);
                    System.out.println("Email Address: " + emailAddress);
                    System.out.println("Your registration is successfully!");
                    
                    // Show registration success message
                    JOptionPane.showMessageDialog(frame, "Your registration is successfully!");
                }
            }
        });

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(220, 329, 444, 20);
        panel.add(textField_6);

        JLabel lblNewLabel_4_1_3 = new JLabel("Email Address:");
        lblNewLabel_4_1_3.setForeground(Color.WHITE);
        lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_4_1_3.setBounds(220, 306, 195, 30);
        panel.add(lblNewLabel_4_1_3);

        JLabel lblNewLabel_4_1_2 = new JLabel("Designation:");
        lblNewLabel_4_1_2.setForeground(Color.WHITE);
        lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_4_1_2.setBounds(220, 212, 195, 30);
        panel.add(lblNewLabel_4_1_2);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(220, 235, 444, 20);
        panel.add(textField_5);
        btnNewButton.setBounds(397, 357, 89, 23);
        panel.add(btnNewButton);

        JLabel lblNewLabel_5 = new JLabel("PROFESSOR REGISTRATION FORM");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_5.setBounds(302, 84, 286, 14);
        panel.add(lblNewLabel_5);

        JLabel lblNewLabel_4_1_1_1 = new JLabel("Number of Years of Experience");
        lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_4_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_4_1_1_1.setBounds(460, 254, 195, 30);
        panel.add(lblNewLabel_4_1_1_1);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(460, 287, 204, 20);
        panel.add(textField_3);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(220, 287, 204, 20);
        panel.add(textField_2);

        JLabel lblNewLabel_4_1_1 = new JLabel("Contact NO:");
        lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_4_1_1.setForeground(Color.WHITE);
        lblNewLabel_4_1_1.setBounds(220, 253, 96, 30);
        panel.add(lblNewLabel_4_1_1);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(220, 181, 444, 20);
        panel.add(textField_1);

        JLabel lblNewLabel_4_1 = new JLabel("Degree:");
        lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_4_1.setForeground(Color.WHITE);
        lblNewLabel_4_1.setBounds(220, 154, 195, 30);
        panel.add(lblNewLabel_4_1);

        textField = new JTextField();
        textField.setBounds(220, 123, 444, 20);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Full Name:");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setBounds(220, 98, 61, 30);
        panel.add(lblNewLabel_4);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Student\\Desktop\\Screenshot 2024-04-19 085307.png"));
        lblNewLabel.setBounds(0, 0, 916, 73);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("D:\\Screenshot 2024-04-19 100536.png"));
        lblNewLabel_2.setBounds(-482, 45, 1424, 442);
        panel.add(lblNewLabel_2);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(698, 104, 157, 137);
        panel.add(panel_1);
    }
}