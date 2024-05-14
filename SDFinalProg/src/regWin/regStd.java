package regWin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import javax.swing.JFrame;

public class regStd {

    private JFrame frame;
    private JTextField lastNameField;
    private JTextField firstNameField;
    private JTextField middleNameField;
    private JTextField birthDateField;
    private JTextField ageField;
    private JTextField birthPlaceField;
    private JTextField lrnField;
    private JTextField cellphoneField;
    private JTextField emailField;
    private JTextField residenceField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    regStd window = new regStd();
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
    public regStd() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 983, 712);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 206, 209));
        panel.setBounds(0, 0, 977, 680);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "Personal Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_1.setBackground(new Color(255, 206, 209));
        panel_1.setBounds(20, 60, 940, 590);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblApplicationFor = new JLabel("Application For:");
        lblApplicationFor.setBounds(20, 30, 150, 30);
        panel_1.add(lblApplicationFor);

        JComboBox<String> comboBoxApplicationFor = new JComboBox<>(new String[] {"Bachelor's Degree"});
        comboBoxApplicationFor.setBounds(180, 30, 200, 30);
        panel_1.add(comboBoxApplicationFor);

        JLabel lblClassification = new JLabel("Classification:");
        lblClassification.setBounds(20, 70, 150, 30);
        panel_1.add(lblClassification);

        JComboBox<String> comboBoxClassification = new JComboBox<>(new String[] {"New"});
        comboBoxClassification.setBounds(180, 70, 200, 30);
        panel_1.add(comboBoxClassification);

        JLabel lblCourse = new JLabel("Course/Program:");
        lblCourse.setBounds(20, 110, 150, 30);
        panel_1.add(lblCourse);

        JComboBox<String> comboBoxCourse = new JComboBox<>(new String[] {"TCPE - BACHELOR OF SCIENCE IN COMPUTER ENGINEERING"});
        comboBoxCourse.setBounds(180, 110, 400, 30);
        panel_1.add(comboBoxCourse);

        JLabel lblLevel = new JLabel("Level:");
        lblLevel.setBounds(20, 150, 150, 30);
        panel_1.add(lblLevel);

        JComboBox<String> comboBoxLevel = new JComboBox<>(new String[] {"Year of the Student"});
        comboBoxLevel.setBounds(180, 150, 200, 30);
        panel_1.add(comboBoxLevel);

        JLabel lblSchoolYear = new JLabel("School Year:");
        lblSchoolYear.setBounds(20, 190, 150, 30);
        panel_1.add(lblSchoolYear);

        JComboBox<String> comboBoxSchoolYear = new JComboBox<>(new String[] {"2024"});
        comboBoxSchoolYear.setBounds(180, 190, 200, 30);
        panel_1.add(comboBoxSchoolYear);

        JLabel lblTerm = new JLabel("Term:");
        lblTerm.setBounds(20, 230, 150, 30);
        panel_1.add(lblTerm);

        JComboBox<String> comboBoxTerm = new JComboBox<>(new String[] {"First"});
        comboBoxTerm.setBounds(180, 230, 200, 30);
        panel_1.add(comboBoxTerm);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 270, 150, 30);
        panel_1.add(lblName);

        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setBounds(180, 250, 150, 30);
        panel_1.add(lblLastName);

        JLabel lblFirstName = new JLabel("First Name");
        lblFirstName.setBounds(380, 250, 150, 30);
        panel_1.add(lblFirstName);

        JLabel lblMiddleName = new JLabel("Middle Name");
        lblMiddleName.setBounds(580, 250, 150, 30);
        panel_1.add(lblMiddleName);

        lastNameField = new JTextField();
        lastNameField.setBounds(180, 270, 150, 30);
        panel_1.add(lastNameField);

        firstNameField = new JTextField();
        firstNameField.setBounds(380, 270, 150, 30);
        panel_1.add(firstNameField);

        middleNameField = new JTextField();
        middleNameField.setBounds(580, 270, 150, 30);
        panel_1.add(middleNameField);

        JLabel lblGender = new JLabel("Gender:");
        lblGender.setBounds(20, 310, 150, 30);
        panel_1.add(lblGender);

        JRadioButton rdbtnMale = new JRadioButton("Male");
        rdbtnMale.setBounds(180, 310, 100, 30);
        panel_1.add(rdbtnMale);

        JRadioButton rdbtnFemale = new JRadioButton("Female");
        rdbtnFemale.setBounds(280, 310, 100, 30);
        panel_1.add(rdbtnFemale);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdbtnMale);
        genderGroup.add(rdbtnFemale);

        JLabel lblBirthDate = new JLabel("Birth Date:");
        lblBirthDate.setBounds(20, 350, 150, 30);
        panel_1.add(lblBirthDate);

        birthDateField = new JTextField();
        birthDateField.setBounds(180, 350, 150, 30);
        panel_1.add(birthDateField);

        JLabel lblAge = new JLabel("Age:");
        lblAge.setBounds(380, 350, 50, 30);
        panel_1.add(lblAge);

        ageField = new JTextField();
        ageField.setBounds(420, 350, 50, 30);
        panel_1.add(ageField);

        JLabel lblBirthPlace = new JLabel("Birth Place:");
        lblBirthPlace.setBounds(480, 350, 100, 30);
        panel_1.add(lblBirthPlace);

        birthPlaceField = new JTextField();
        birthPlaceField.setBounds(580, 350, 150, 30);
        panel_1.add(birthPlaceField);

        JLabel lblReligion = new JLabel("Religion:");
        lblReligion.setBounds(20, 390, 150, 30);
        panel_1.add(lblReligion);

        JComboBox<String> comboBoxReligion = new JComboBox<>(new String[] {"Catholic"});
        comboBoxReligion.setBounds(180, 390, 200, 30);
        panel_1.add(comboBoxReligion);

        JLabel lblCivilStatus = new JLabel("Civil Status:");
        lblCivilStatus.setBounds(20, 430, 150, 30);
        panel_1.add(lblCivilStatus);

        JComboBox<String> comboBoxCivilStatus = new JComboBox<>(new String[] {"Single"});
        comboBoxCivilStatus.setBounds(180, 430, 200, 30);
        panel_1.add(comboBoxCivilStatus);

        JLabel lblCellphone = new JLabel("Cellphone Number:");
        lblCellphone.setBounds(20, 470, 150, 30);
        panel_1.add(lblCellphone);

        cellphoneField = new JTextField();
        cellphoneField.setBounds(180, 470, 200, 30);
        panel_1.add(cellphoneField);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 510, 150, 30);
        panel_1.add(lblEmail);

        emailField = new JTextField();
        emailField.setBounds(180, 510, 200, 30);
        panel_1.add(emailField);

        JLabel lblResidence = new JLabel("Residence Number:");
        lblResidence.setBounds(400, 510, 150, 30);
        panel_1.add(lblResidence);

        residenceField = new JTextField();
        residenceField.setBounds(580, 510, 150, 30);
        panel_1.add(residenceField);

        JLabel lblLrn = new JLabel("LRN:");
        lblLrn.setBounds(400, 470, 150, 30);
        panel_1.add(lblLrn);

        lrnField = new JTextField();
        lrnField.setBounds(580, 470, 150, 30);
        panel_1.add(lrnField);

        JLabel lblWelcome = new JLabel("Welcome, Student");
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblWelcome.setBounds(20, 10, 940, 30);
        panel.add(lblWelcome);
    }
}
