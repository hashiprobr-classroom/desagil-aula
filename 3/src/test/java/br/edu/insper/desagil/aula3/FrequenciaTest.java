package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrequenciaTest {
	private Frequencia f;
	private Map<Character, Integer> frequencia;

	@BeforeEach
	void setUp() {
		f = new Frequencia();
		frequencia = new HashMap<>();
	}

	@Test
	void banana() {
		frequencia.put('b', 1);
		frequencia.put('a', 3);
		frequencia.put('n', 2);
		assertEquals(frequencia, f.conta("banana"));
	}

	@Test
	void abobora() {
		frequencia.put('a', 2);
		frequencia.put('b', 2);
		frequencia.put('o', 2);
		frequencia.put('r', 1);
		assertEquals(frequencia, f.conta("abobora"));
	}

	@Test
	void insper() {
		frequencia.put('i', 1);
		frequencia.put('n', 1);
		frequencia.put('s', 1);
		frequencia.put('p', 1);
		frequencia.put('e', 1);
		frequencia.put('r', 1);
		assertEquals(frequencia, f.conta("insper"));
	}
}
