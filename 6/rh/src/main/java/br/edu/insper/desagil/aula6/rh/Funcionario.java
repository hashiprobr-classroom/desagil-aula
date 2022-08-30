package br.edu.insper.desagil.aula6.rh;

public class Funcionario {
	private int id;
	private String nome;
	private double salarioBase;

	public Funcionario(int id, String nome, double salarioBase) {
		this.id = id;
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double calculaSalarioTotal() {
		return 0.6 * salarioBase;
	}
}
