package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FichasTest {
	private Fichas f;
	private List<Map<String, String>> originais;
	private List<Map<String, String>> modificados;

	@BeforeEach
	void setUp() {
		f = new Fichas();
		originais = new ArrayList<>();
		modificados = new ArrayList<>();
	}

	@Test
	void exemploEnunciado() {
		originais.add(Map.of("login", "mariads", "nome", "Maria", "sobrenome", "da Silva"));
		originais.add(Map.of("login", "joaods", "nome", "João", "sobrenome", "de Souza", "curso", "Engenharia de Computação"));
		originais.add(Map.of("login", "marianads", "nome", "Maria", "sobrenome", "de Souza", "curso", "Ciência da Computação"));
		originais.add(Map.of("login", "joseds", "nome", "José", "sobrenome", "da Silva"));
		modificados.add(Map.of("email", "mariads@insper.edu.br", "nome", "Maria da Silva"));
		modificados.add(Map.of("email", "joaods@al.insper.edu.br", "nome", "João de Souza"));
		modificados.add(Map.of("email", "marianads@al.insper.edu.br", "nome", "Maria de Souza"));
		modificados.add(Map.of("email", "joseds@insper.edu.br", "nome", "José da Silva"));
		assertEquals(modificados, f.reformata(originais));
	}
}
