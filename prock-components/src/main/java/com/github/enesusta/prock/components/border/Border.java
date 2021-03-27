package com.github.enesusta.prock.components.border;

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Border extends JPanel {

    public Border() {
        super();
        setLayout(new BorderLayout());
    }

    public <E extends JComponent> void addCenter(E e) {
        add(e, BorderLayout.CENTER);
    }

    public <E extends JComponent> void addPageStart(E e) {
        add(e, BorderLayout.PAGE_START);
    }

    public <E extends JComponent> void addPageEnd(E e) {
        add(e, BorderLayout.PAGE_END);
    }

    public <E extends JComponent> void addNorth(E e) {
        add(e, BorderLayout.NORTH);
    }

    public <E extends JComponent> void addWest(E e) {
        add(e, BorderLayout.WEST);
    }

    public <E extends JComponent> void addEast(E e) {
        add(e, BorderLayout.EAST);
    }
}
