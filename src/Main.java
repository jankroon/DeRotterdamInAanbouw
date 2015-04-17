/**
 * EduCode created by Jan Kroon (Hogeschool Rotterdam) on 15-03-15.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JButton backButton;
    JButton forwardButton;
    ImagePanel imagePanel;

    public static void main(String[] args) {
        System.out.println("De Rotterdam in aanbouw");
            Main gui = new Main();
            gui.setUpUI();
        }

    public void setUpUI() {
        // Window
        JFrame frame = new JFrame();

        // GUI Control components
        backButton = new JButton("vroeger");
        backButton.addActionListener(this);
        forwardButton = new JButton("later");
        forwardButton.addActionListener(this);


        // GUI Content components
        imagePanel = new ImagePanel();

        // GUI Containers
        JPanel buttonsPanel = new JPanel();

        buttonsPanel.add(backButton);
        buttonsPanel.add(forwardButton);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonsPanel);
        frame.getContentPane().add(BorderLayout.CENTER, imagePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("De Rotterdam in aanbouw");
        frame.setSize(750,600);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
//        ((JButton)ae.getSource()).setText("I've been clicked");
        if (ae.getSource() == forwardButton) {
            imagePanel.nextImage();
        } else if (ae.getSource() == backButton) {
            imagePanel.previousImage();
        }
    }
}
