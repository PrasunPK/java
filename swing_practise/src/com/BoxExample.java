package com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BoxExample extends JFrame implements ActionListener {
    private JFrame frame;

    public BoxExample() {
        frame = new JFrame();
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "You are male");
    }

    public static void main(String args[]) {
        new BoxExample();
    }
}