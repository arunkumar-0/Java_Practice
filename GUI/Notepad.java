package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class Notepad implements ActionListener {
    JFrame jf;
    JMenuBar bar;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea ta;

    Notepad() {
        jf = new JFrame();
        jf.setLayout(null);
        jf.setSize(400, 400);
        jf.setVisible(true);

        bar = new JMenuBar();
        file = new JMenu("FILE");
        edit = new JMenu("EDIT");
        help = new JMenu("HELP");
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("select all");

        ta = new JTextArea();
        ta.setBounds(60, 60, 500, 100);

        bar.add(file);
        bar.add(edit);
        bar.add(help);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        jf.setJMenuBar(bar);
        jf.add(ta);

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            ta.cut();
        }
        if (e.getSource() == copy) {
            ta.copy();
        }
        if (e.getSource() == paste) {
            ta.paste();
        }
        if (e.getSource() == selectAll) {
            ta.selectAll();
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}