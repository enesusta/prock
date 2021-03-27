package com.github.enesusta.prock.components.playground;

import com.github.enesusta.prock.components.frame.Frame;
import com.github.enesusta.prock.components.grid.GridBag;

import javax.swing.*;
import java.awt.Color;

public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        Frame frame = new Frame();

        GridBag gridBag = GridBag.newInstance()
                .fillBoth()
                .weightX(1)
                .weightY(0.450f)
                .gridY(0)
                .add(new JLabel("deneme -1"))
                .weightY(0.450f)
                .gridY(1)
                .add(new JLabel("deneme -2"));

        GridBag heating = GridBag.newInstance()
                .fillBoth()
                .weightY(1)
                .weightX(0.20f)
                .gridX(0)
                .add(borderedLabel("deneme -1"))
                .weightX(0.20f)
                .gridX(1)
                .add(borderedLabel("deneeme -2"))
                .weightX(0.60f)
                .gridX(2)
                .add(borderedLabel("deneeme -3"));



        frame.add(heating);

        UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        SwingUtilities.updateComponentTreeUI(frame);
        frame.init();
    }

    public static JLabel borderedLabel(String text) {
        JLabel jLabel = new JLabel(text);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return jLabel;
    }
}
