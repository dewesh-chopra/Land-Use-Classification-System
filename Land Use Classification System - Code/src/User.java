import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class User {
    private String username;
    private int userid;
    private String filename;

    public void choice() {
        // Display a GUI window to prompt the user for input
        Object[] options = {"Display previous image", "Enter new details"};
        int choice = JOptionPane.showOptionDialog(null, "Would you like to display a previously entered image or enter new details?",
                "User Choice", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice == JOptionPane.YES_OPTION) {
            // Display previously entered image
            // TODO: Implement logic to display image

            // Enter new details
            JTextField nameField = new JTextField(20);
            JTextField idField = new JTextField(10);

            // Create a JPanel to hold the input fields
            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new GridLayout(2, 2));
            inputPanel.add(new JLabel("Name:"));
            inputPanel.add(nameField);
            inputPanel.add(new JLabel("ID:"));
            inputPanel.add(idField);

            // Display the input panel and wait for the user to click the OK button
            int result = JOptionPane.showConfirmDialog(null, inputPanel, "Enter User Details", JOptionPane.OK_CANCEL_OPTION);
            String name = null;
            int id = 0;

            String csvFile = "src/user-details.csv";
            String line = "";
            String cvsSplitBy = ",";
            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                while ((line = br.readLine()) != null) {
                    // use comma as separator
                    String[] userDetails = line.split(cvsSplitBy);
                    String column1 = userDetails[0];
                    String column2 = userDetails[1];
                    String column3 = userDetails[2];
                    if(column1.equals(nameField.getText()) && column2.equals(idField.getText())) {
                        new Data(column3);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Enter new details
            JTextField nameField = new JTextField(20);
            JTextField idField = new JTextField(10);
            JButton uploadButton = new JButton("Upload image");

            // Create a JPanel to hold the input fields
            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new GridLayout(3, 2));
            inputPanel.add(new JLabel("Name:"));
            inputPanel.add(nameField);
            inputPanel.add(new JLabel("ID:"));
            inputPanel.add(idField);
            inputPanel.add(new JLabel("Image:"));
            inputPanel.add(uploadButton);

            // Display a file chooser dialog when the user clicks the "Upload image" button
            uploadButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    int result = fileChooser.showOpenDialog(null);
                    if (result == JFileChooser.APPROVE_OPTION) {
                        File file = fileChooser.getSelectedFile();
                        // TODO: Implement logic to read image file
                        System.out.println("Uploading image: " + file.getName());
                        filename = file.getAbsolutePath();
                    }
                }
            });

            // Display the input panel and wait for the user to click the OK button
            int result = JOptionPane.showConfirmDialog(null, inputPanel, "Enter User Details", JOptionPane.OK_CANCEL_OPTION);
            String name = null;
            int id = 0;
            if (result == JOptionPane.OK_OPTION) {
                name = nameField.getText();
                id = Integer.parseInt(idField.getText());

                String csvFile = "src/user-details.csv";
                String line = "";
                String cvsSplitBy = ",";
                try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                    while ((line = br.readLine()) != null) {
                        // use comma as separator
                        String[] userDetails = line.split(cvsSplitBy);
                        String column1 = userDetails[0];
                        String column2 = userDetails[1];
                        if(column1.equals(nameField.getText()) && column2.equals(idField.getText())) {
                            JOptionPane.showMessageDialog(null, "An image was already uploaded with this name and id");
                            System.exit(0);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // TODO: Implement logic to save user details to a file in CSV format
                try {
                    FileWriter writer = new FileWriter("src/user-details.csv", true);
                    writer.write(name + "," + id + "," + filename + "\n");
                    writer.close();
                    System.out.println("User details saved to file");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            new Data(filename);
        }
    }

    public static void main(String[] args) {
        new User().choice();
    }
}
