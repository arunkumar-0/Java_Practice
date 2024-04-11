//simple calculator 

package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Calculator implements ActionListener {
    JTextField f1, f2, f3;
    JButton b1, b2, b3, b4;

    Calculator() {
        JFrame jf = new JFrame("Simple Calculator");
        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setVisible(true);

        f1 = new JTextField("Number 1");
        f1.setBounds(20, 30, 150, 40);
        f2 = new JTextField("Number 2");
        f2.setBounds(20, 100, 150, 40);
        f3 = new JTextField("Result");
        f3.setBounds(20, 170, 150, 40);
        f3.setEditable(false);

        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        b1.setBounds(20, 250, 60, 40);
        b2.setBounds(70, 250, 60, 40);
        b3.setBounds(110, 250, 60, 40);
        b4.setBounds(150, 250, 60, 40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        jf.add(f1);
        jf.add(f2);
        jf.add(f3);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = f1.getText();
        String s2 = f2.getText();

        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = 0;
        if (e.getSource() == b1) {
            d3 = d1 + d2;
        } else if (e.getSource() == b2) {
            d3 = d1 - d2;
        } else if (e.getSource() == b3) {
            d3 = d1 * d2;
        } else if (e.getSource() == b4) {
            d3 = d1 / d2;
        }
        String result = String.valueOf(d3);
        f3.setText(result);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
