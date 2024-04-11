package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class TabbedPane {
    TabbedPane() {
        JFrame jf = new JFrame();
        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setVisible(true);
        JTextArea ta = new JTextArea();

        JTabbedPane tp = new JTabbedPane();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.add(ta);
        tp.setBounds(50, 50, 200, 200);
        tp.addTab("main", p3);
        tp.addTab("visit", p2);
        tp.addTab("help", p1);
        jf.add(tp);
    }

    public static void main(String[] args) {
        new TabbedPane();
    }
}
