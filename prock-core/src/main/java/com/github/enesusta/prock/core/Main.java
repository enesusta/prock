package com.github.enesusta.prock.core;

import com.github.enesusta.prock.components.grids.Grid;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {
        Grid grid = Grid.newInstance(3, 5);

        try {
            JFrame frame = new JFrame();
            frame.getContentPane().add(grid);

            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
            SwingUtilities.updateComponentTreeUI(frame);


            frame.show();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
