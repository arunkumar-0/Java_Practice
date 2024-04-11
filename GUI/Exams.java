package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exams {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JTextArea t = new JTextArea();
        JButton b = new JButton("submit");
        t.setBounds(50, 50, 150, 20);
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText("WELCOME");
            }
        });
        jf.add(b);
        jf.add(t);
        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
