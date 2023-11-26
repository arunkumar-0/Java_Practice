package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class frame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(420, 420); // x and y dimension
        jf.setTitle("Jframe tutorial");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close application on clicking the cross (X)
        jf.setResizable(false);

        ImageIcon image = new ImageIcon("logo.png");
        jf.setIconImage(image.getImage());// change icon of frame

        jf.getContentPane().setBackground(new Color(200, 150, 0));

        jf.setVisible(true); // make frame visible
    }
}
