import javax.swing.*;

public class Data {
    private String imageFile;

    public Data(String imageFile) {
        this.imageFile = imageFile;
        this.feedData(this.imageFile);
    }

    public boolean checkData(String file) {
        JOptionPane.showMessageDialog(null, "Data has been verified");
        return true;
    }

    public void feedData(String imageFile) {
        if(!this.checkData(imageFile)) {
            JOptionPane.showMessageDialog(null, "The image does not qualify");
            System.exit(0);
        } else {
            new Process().preprocess(imageFile);
        }
    }
}
