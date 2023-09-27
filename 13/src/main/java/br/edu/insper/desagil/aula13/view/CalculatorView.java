package br.edu.insper.desagil.aula13.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.insper.desagil.aula13.model.Calculator;

public class CalculatorView extends FixedPanel implements ActionListener {
	private static final long serialVersionUID = -8142290119825157645L;

	private final Calculator calculator;

	private final JTextField weightField;
	private final JTextField radiusField;
	private final JTextField resultField;

	private final Image image;

	public CalculatorView(Calculator calculator) {
		super(245, 346);

		this.calculator = calculator;

		weightField = new JTextField();
		radiusField = new JTextField();
		resultField = new JTextField();

		JLabel weightLabel = new JLabel("Weight");
		JLabel radiusLabel = new JLabel("Radius");
		JLabel resultLabel = new JLabel("Result");

		add(weightLabel, 10, 10, 75, 25);
		add(weightField, 85, 10, 150, 25);
		add(radiusLabel, 10, 45, 75, 25);
		add(radiusField, 85, 45, 150, 25);
		add(resultLabel, 10, 311, 75, 25);
		add(resultField, 85, 311, 150, 25);

		String name = calculator.toString() + ".png";
		URL url = getClass().getClassLoader().getResource(name);
		image = getToolkit().getImage(url);

		weightField.addActionListener(this);
		radiusField.addActionListener(this);

		resultField.setEnabled(false);

		update();
	}

	private void update() {
		double weight;
		double radius;

		try {
			weight = Double.parseDouble(weightField.getText());
			radius = Double.parseDouble(radiusField.getText());
		} catch (NumberFormatException exception) {
			resultField.setText("?");
			return;
		}

		double result = calculator.calculate(weight, radius);

		resultField.setText(Double.toString(result));
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		update();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 10, 80, 221, 221, this);
		getToolkit().sync();
	}
}
