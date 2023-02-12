package br.edu.insper.desagil.aula3;

import java.util.Map;

public class LimpaDicionario {

	public void filtra(Map<Integer, Character> presente, char c) {
		for (int i : presente.keySet()) {
			if (presente.get(i) == c) {
				presente.remove(i);
			}
		}
	}

}
