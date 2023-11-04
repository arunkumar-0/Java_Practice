package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label1 {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("logo.png");

        JLabel label = new JLabel();
        label.setText("adding Jlabel ");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER); // left , right , center for image icon

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
    }
}
