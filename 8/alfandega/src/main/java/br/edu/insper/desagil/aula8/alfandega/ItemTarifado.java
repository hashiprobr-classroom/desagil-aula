package br.edu.insper.desagil.aula8.alfandega;

public class ItemTarifado {
	private String nome;
	private double valor;
	private double tarifa;
	private double taxa;

	public ItemTarifado(String nome, double valor, double tarifa, double taxa) {
		this.nome = nome;
		this.valor = valor;
		this.tarifa = tarifa;
		this.taxa = taxa;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public double getTarifa() {
		return tarifa;
	}

	public double getTaxa() {
		return taxa;
	}
}
