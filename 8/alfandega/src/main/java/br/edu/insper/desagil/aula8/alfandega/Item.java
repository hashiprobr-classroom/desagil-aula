package br.edu.insper.desagil.aula8.alfandega;

public class Item {
	private String nome;
	private double valor;
	private double tarifa;

	public Item(String nome, double valor, double tarifa) {
		this.nome = nome;
		this.valor = valor;
		this.tarifa = tarifa;
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
}
