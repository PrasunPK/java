package com;

import javax.swing.*;
import java.awt.event.*;

class BoxExample extends JFrame implements ActionListener {
    JTextField txt;
    JRadioButton rb1, rb2;
    JButton b;

    public BoxExample() {

        txt = new JTextField();
        txt.setBounds(100, 100, 100, 30);

        JFrame frame = new JFrame();
        frame.add(txt);

        b = new JButton("click");
        b.setBounds(100, 150, 80, 30);
        b.addActionListener(this);

        add(txt);
        add(b);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (txt.isValid()) {
            JOptionPane.showMessageDialog(this, "You are male");
        }
    }

    public static void main(String args[]) {
        new BoxExample();
    }
}