package br.edu.insper.desagil.aula6.rh;

public class DiretorDeVendas extends Diretor {
	private double faturamentoTotal;

	public DiretorDeVendas(int id, String nome, double salarioBase) {
		super(id, nome, salarioBase, "Vendas");
		this.faturamentoTotal = 0;
	}

	public void incrementa(double faturamento) {
		faturamentoTotal += faturamento;
	}

	@Override
	public double calculaSalarioTotal() {
		return super.calculaSalarioTotal() + 0.1 * faturamentoTotal;
	}

	@Override
	public String getTitulo() {
		return getNome() + " (CSO)";
	}
}
