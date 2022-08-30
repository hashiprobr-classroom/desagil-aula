package br.edu.insper.desagil.aula6.rh;

public abstract class Diretor extends Funcionario {
	private String departamento;

	public Diretor(int id, String nome, double salarioBase, String departamento) {
		super(id, nome, salarioBase);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	@Override
	public double calculaSalarioTotal() {
		return 2 * super.calculaSalarioTotal();
	}

	public abstract String getTitulo();
}
