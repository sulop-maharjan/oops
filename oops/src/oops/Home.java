import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {

    public Home() {
        setTitle("Course Management System Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel for the dashboard
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2, 10, 10));

        // Buttons for the dashboard
        JButton btnAddCourse = new JButton("Add Course");
        btnAddCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add Course logic
                showAddCourseDialog();
            }
        });

        JButton btnViewCourses = new JButton("View Courses");
        btnViewCourses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // View Courses logic
                JOptionPane.showMessageDialog(null, "View Courses button clicked!");
            }
        });

        JButton btnEnrollStudent = new JButton("Enroll Student");
        btnEnrollStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Enroll Student logic
                JOptionPane.showMessageDialog(null, "Enroll Student button clicked!");
            }
        });

        JButton btnViewStudents = new JButton("View Students");
        btnViewStudents.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // View Students logic
                JOptionPane.showMessageDialog(null, "View Students button clicked!");
            }
        });

        JButton btnGenerateReport = new JButton("Generate Report");
        btnGenerateReport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Generate Report logic
                JOptionPane.showMessageDialog(null, "Generate Report button clicked!");
            }
        });

        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logout logic
                JOptionPane.showMessageDialog(null, "Logout button clicked!");
            }
        });

        // Adding buttons to the main panel
        mainPanel.add(btnAddCourse);
        mainPanel.add(btnViewCourses);
        mainPanel.add(btnEnrollStudent);
        mainPanel.add(btnViewStudents);
        mainPanel.add(btnGenerateReport);
        mainPanel.add(btnLogout);

        // Adding the main panel to the frame
        add(mainPanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void showAddCourseDialog() {
        // Create a dialog for adding a course
        JDialog addCourseDialog = new JDialog(this, "Add Course", true);
        addCourseDialog.setSize(300, 200);
        addCourseDialog.setLocationRelativeTo(this);

        JPanel addCoursePanel = new JPanel();
        addCoursePanel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblCourseName = new JLabel("Course Name:");
        JTextField txtCourseName = new JTextField();

        JLabel lblCourseCode = new JLabel("Course Code:");
        JTextField txtCourseCode = new JTextField();

        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add Course logic (you can modify this according to your requirements)
                String courseName = txtCourseName.getText();
                String courseCode = txtCourseCode.getText();

                // Perform your logic here (e.g., add the course to a database)

                // Close the dialog
                addCourseDialog.dispose();
            }
        });

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the dialog without adding the course
                addCourseDialog.dispose();
            }
        });

        addCoursePanel.add(lblCourseName);
        addCoursePanel.add(txtCourseName);
        addCoursePanel.add(lblCourseCode);
        addCoursePanel.add(txtCourseCode);
        addCoursePanel.add(btnAdd);
        addCoursePanel.add(btnCancel);

        addCourseDialog.add(addCoursePanel);
        addCourseDialog.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Home();
            }
        });
    }
}
