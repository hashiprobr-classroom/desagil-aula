package br.edu.insper.desagil.aula6.rh;

import java.util.ArrayList;
import java.util.List;

public class DiretorDeMarketing extends Diretor {
	private List<String> portfolio;

	public DiretorDeMarketing(int id, String nome, double salarioBase) {
		super(id, nome, salarioBase, "Marketing");
		this.portfolio = new ArrayList<>();
	}

	public List<String> getPortfolio() {
		return portfolio;
	}

	public void adiciona(String item) {
		portfolio.add(item);
	}

	@Override
	public String getTitulo() {
		return getNome() + " (CMO)";
	}
}
