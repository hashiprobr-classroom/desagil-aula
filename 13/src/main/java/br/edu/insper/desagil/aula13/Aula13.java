package br.edu.insper.desagil.aula13;

import java.util.LinkedList;

import javax.swing.JFrame;

import br.edu.insper.desagil.aula13.model.CCCCalculator;
import br.edu.insper.desagil.aula13.model.CFCCalculator;
import br.edu.insper.desagil.aula13.model.Calculator;
import br.edu.insper.desagil.aula13.view.View;

public class Aula13 {
	public static void main(String[] args) {
		LinkedList<Calculator> model = new LinkedList<>();
		model.add(new CCCCalculator());
		model.add(new CFCCalculator());

		View view = new View(model);

		javax.swing.SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame();
			frame.setContentPane(view);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.pack();
			frame.setVisible(true);
		});
	}
}
