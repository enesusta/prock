package com.github.enesusta.prock.components.grid;

import com.github.enesusta.prock.components.Addable;

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.GridLayout;

public final class Grid extends JPanel implements Addable {

    private Grid(final int rows, final int columns) {
        super();
        setLayout(new GridLayout(rows, columns));
    }

    @Override
    public final <E extends JComponent> void add(E... e) {
        for (E components : e) add(components);
    }

    public static Grid newInstance(final int rows, final int columns) {
        return new Grid(rows, columns);
    }

}
