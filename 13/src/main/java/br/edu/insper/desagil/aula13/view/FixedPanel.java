package br.edu.insper.desagil.aula13.view;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;

public class FixedPanel extends JPanel {
	private static final long serialVersionUID = 4354641551186757252L;

	protected FixedPanel(int width, int height) {
		setLayout(null);
		setPreferredSize(new Dimension(width, height));
	}

	protected Component add(Component component, int x, int y, int width, int height) {
		super.add(component);
		component.setBounds(x, y, width, height);
		return component;
	}
}
