import javax.swing.*;

public class Process {
    private int type;

    public void preprocess(String imageFile) {
            JOptionPane.showMessageDialog(null, "Image is pre-processed, " +
                    "\ni.e. first we convert to grayscale, " +
                    "\nthen apply gaussian blur, " +
                    "\nthen further noise reduction via appropriate filters.");
            postprocess(imageFile);
    }

    public void postprocess(String imageFile) {
        JOptionPane.showMessageDialog(null, "Image is post-processed, " +
                "\ni.e. we apply a pretrained classification model for image segment classification");

        new Display(imageFile).showImage(imageFile);
    }
}
