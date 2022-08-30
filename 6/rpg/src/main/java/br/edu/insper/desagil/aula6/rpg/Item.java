package br.edu.insper.desagil.aula6.rpg;

public class Item extends Elemento {
	private String nome;

	public Item(int x, int y, String nome) {
		super(x, y);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
