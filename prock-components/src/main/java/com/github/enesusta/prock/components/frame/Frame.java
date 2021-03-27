package com.github.enesusta.prock.components.frame;

import javax.swing.JFrame;
import java.awt.BorderLayout;


public class Frame extends JFrame {

    public Frame() {
        this("");
    }

    public Frame(String name) {
        super(name);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    public void init() {
        pack();
        setVisible(true);
    }
}
