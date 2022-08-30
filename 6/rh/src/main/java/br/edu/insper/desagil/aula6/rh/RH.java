package br.edu.insper.desagil.aula6.rh;

import java.util.ArrayList;
import java.util.List;

public class RH {
	private List<Funcionario> folha;

	public RH() {
		this.folha = new ArrayList<>();
	}

	public void contrata(Funcionario funcionario) {
		folha.add(funcionario);
	}

	public double calculaMedia() {
		if (folha.isEmpty()) {
			return 0;
		}
		double s = 0;
		for (Funcionario funcionario : folha) {
			s += funcionario.calculaSalarioTotal();
		}
		return s / folha.size();
	}
}
