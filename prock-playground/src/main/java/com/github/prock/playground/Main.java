package com.github.prock.playground;

import com.github.enesusta.prock.components.frame.Frame;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        Frame frame = new Frame();
        frame.getContentPane().add(new JLabel("enesusta"));

        UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        SwingUtilities.updateComponentTreeUI(frame);
        frame.init();
    }
}
