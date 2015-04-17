/**
 * EduCode created by Jan Kroon (Hogeschool Rotterdam) on 15-03-15.
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ImagePanel extends JPanel {
    int visibleImageId = 0;

    // Load images
    ArrayList<Image> allImages = new ArrayList<Image>();
    boolean success = false;
    Image image0 = new ImageIcon("DeRotterdamInAanbouw_0.png").getImage();
    boolean success0 = allImages.add(image0);
    Image image1 = new ImageIcon("DeRotterdamInAanbouw_1.png").getImage();
    boolean success1 = allImages.add(image1);
    Image image2 = new ImageIcon("DeRotterdamInAanbouw_2.png").getImage();
    boolean success2 = allImages.add(image2);
    Image image3 = new ImageIcon("DeRotterdamInAanbouw_3.png").getImage();
    boolean success3 = allImages.add(image3);
    Image image4 = new ImageIcon("DeRotterdamInAanbouw_4.png").getImage();
    boolean success4 = allImages.add(image4);
    Image image5 = new ImageIcon("DeRotterdamInAanbouw_5.png").getImage();
    boolean success5 = allImages.add(image5);
    Image image6 = new ImageIcon("DeRotterdamInAanbouw_6.png").getImage();
    boolean success6 = allImages.add(image6);
    Image image7 = new ImageIcon("DeRotterdamInAanbouw_7.png").getImage();
    boolean success7 = allImages.add(image7);
    Image image8 = new ImageIcon("DeRotterdamInAanbouw_8.png").getImage();
    boolean success8 = allImages.add(image8);
    Image image9 = new ImageIcon("DeRotterdamInAanbouw_9.png").getImage();
    boolean success9 = allImages.add(image9);
    Image image10 = new ImageIcon("DeRotterdamBijNacht.jpg").getImage();
    boolean success10 = allImages.add(image10);


    public void nextImage() {
        if (this.visibleImageId < allImages.size() -1) {
            this.visibleImageId++;
            System.out.println("CHECK visibleImageId is now: " + String.valueOf(this.visibleImageId));
            this.repaint();
        } else {
            // Do nothing
        }
    }

    public void previousImage() {
        if (this.visibleImageId > 0) {
        this.visibleImageId--;
        System.out.println("CHECK visibleImageId is now: " + String.valueOf(this.visibleImageId));
        this.repaint();
        } else {
            // Do nothing
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(allImages.get(visibleImageId), 3, 4, this);
    }
}
