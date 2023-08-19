import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    private String imageFile;
    private JButton btnShow;
    private JComboBox<String> cmbOptions;
    private JLabel lblImage;

    public Display(String imageFile) {
        super("Image Viewer Interface of \'Land-use Classification System\'");
        this.imageFile = imageFile;
        setTitle("Viewer Interface");
        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] options = {"Mapped Image", "Classified Image", "Changes in Image"};
        cmbOptions = new JComboBox<String>(options);
        btnShow = new JButton("Show");
        btnShow.addActionListener(e -> showImagesOption());
        setLayout(new FlowLayout());
        add(cmbOptions);
        add(btnShow);

        lblImage = new JLabel();
        add(lblImage);
        setVisible(true);
    }

    // here
    public void showImagesOption() {
        String option = (String)cmbOptions.getSelectedItem();

        if(option.equals("Classified Image")) {
            new Data(imageFile);
        } else if(option.equals("Mapped Image")) {
            new Data(imageFile);
        } else if(option.equals("Changes in Image")) {
            JOptionPane.showMessageDialog(null, "Changes in same image over a time period is shown");
        }
    }

    // here
    public void showImage(String imageFile) {
        ImageIcon imageIcon = new ImageIcon(imageFile);
        lblImage.setIcon(new ImageIcon(new ImageIcon(imageFile).getImage().getScaledInstance(imageIcon.getIconWidth(), imageIcon.getIconHeight(), Image.SCALE_DEFAULT)));
    }
}
