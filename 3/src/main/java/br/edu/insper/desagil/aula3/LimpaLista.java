package br.edu.insper.desagil.aula3;

import java.util.List;

public class LimpaLista {

	public void filtra(List<Character> letras, char c) {
		for (int i = 0; i < letras.size(); i++) {
			if (letras.get(i) == c) {
				letras.remove(i);
			}
		}
	}

}
