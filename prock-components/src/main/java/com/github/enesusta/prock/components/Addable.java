package com.github.enesusta.prock.components;

import javax.swing.JComponent;

public interface Addable {
    <E extends JComponent> void add(E... e);
}
