package br.edu.insper.desagil.desmat.visao;

import javax.swing.*;
import java.awt.*;

public class FixedPanel extends JPanel {
    public FixedPanel(int width, int height) {
        setLayout(null);
        setPreferredSize(new Dimension(width, height));
    }

    public void add(Component component, int x, int y, int width, int height) {
        super.add(component);
        component.setBounds(x, y, width, height);
    }
}
