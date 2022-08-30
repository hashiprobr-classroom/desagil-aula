package br.edu.insper.desagil.aula6.rpg;

public class Equipamento extends Item {
	private int peso;

	public Equipamento(int x, int y, String nome, int peso) {
		super(x, y, nome);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}
}
