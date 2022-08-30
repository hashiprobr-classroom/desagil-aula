package br.edu.insper.desagil.aula6.rh;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
	private List<Funcionario> funcionarios;

	public Gerente(int id, String nome, double salarioBase) {
		super(id, nome, salarioBase);
		this.funcionarios = new ArrayList<>();
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void adiciona(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
}
