package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Label1 {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("Label Example");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);

        ImageIcon img = new ImageIcon("logo.png");
        label.setIcon(img);
    }
}