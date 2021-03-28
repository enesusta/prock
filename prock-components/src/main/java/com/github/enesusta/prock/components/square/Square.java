package com.github.enesusta.prock.components.square;

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Square extends JPanel {

    private Square() {
        super();
        setLayout(new BorderLayout());
    }

    public static Square newInstance() {
        return new Square();
    }

    public <E extends JComponent> Square center(E e) {
        add(e, BorderLayout.CENTER);
        return this;
    }

    public <E extends JComponent> Square pageStart(E e) {
        add(e, BorderLayout.PAGE_START);
        return this;
    }

    public <E extends JComponent> Square pageEnd(E e) {
        add(e, BorderLayout.PAGE_END);
        return this;
    }

    public <E extends JComponent> Square north(E e) {
        add(e, BorderLayout.NORTH);
        return this;
    }

    public <E extends JComponent> Square south(E e) {
        add(e, BorderLayout.SOUTH);
        return this;
    }

    public <E extends JComponent> Square lineStart(E e) {
        add(e, BorderLayout.LINE_START);
        return this;
    }

    public <E extends JComponent> Square lineEnd(E e) {
        add(e, BorderLayout.LINE_END);
        return this;
    }

    public <E extends JComponent> Square east(E e) {
        add(e, BorderLayout.EAST);
        return this;
    }

    public <E extends JComponent> Square west(E e) {
        add(e, BorderLayout.WEST);
        return this;
    }

}
