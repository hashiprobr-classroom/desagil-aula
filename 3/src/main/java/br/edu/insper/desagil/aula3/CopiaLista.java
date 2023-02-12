package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class CopiaLista {

	public List<Integer> realiza(List<Integer> original) {
		List<Integer> copiada = new ArrayList<>();
		for (int i : original) {
			copiada.add(i);
		}
		return copiada;
	}

}
