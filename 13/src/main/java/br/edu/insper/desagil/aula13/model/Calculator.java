package br.edu.insper.desagil.aula13.model;

public abstract class Calculator {
	private final String name;

	protected Calculator(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public abstract double calculate(double weight, double radius);
}
