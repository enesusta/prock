package com.github.enesusta.prock.components.grid;

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBag extends JPanel {

    private final GridBagConstraints constraints = new GridBagConstraints();

    private GridBag() {
        super();
        setLayout(new GridBagLayout());
    }

    public static GridBag newInstance() {
        return new GridBag();
    }

    public <E extends JComponent> GridBag add(E e) {
        add(e, constraints);
        return this;
    }

    public GridBag fillBoth() {
        constraints.fill = GridBagConstraints.BOTH;
        return this;
    }

    public GridBag weightX(float x) {
        constraints.weightx = x;
        return this;
    }

    public GridBag weightY(float y) {
        constraints.weighty = y;
        return this;
    }

    public GridBag gridX(int x) {
        constraints.gridx = x;
        return this;
    }

    public GridBag gridY(int y) {
        constraints.gridy = y;
        return this;
    }
}
