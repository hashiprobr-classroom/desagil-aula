package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LimpaDicionarioTest {
	private LimpaDicionario l;
	private Map<Integer, Character> presente;

	@BeforeEach
	void setUp() {
		l = new LimpaDicionario();
	}

	@Test
	void vazio() {
		presente = new HashMap<>(Map.of());
		l.filtra(presente, 'a');
		assertEquals(Map.of(), presente);
	}

	@Test
	void naoRemoveDeUm() {
		presente = new HashMap<>(Map.of(1, 'a'));
		l.filtra(presente, 'b');
		assertEquals(Map.of(1, 'a'), presente);
	}

	@Test
	void removeUmDeUm() {
		presente = new HashMap<>(Map.of(1, 'a'));
		l.filtra(presente, 'a');
		assertEquals(Map.of(), presente);
	}

	@Test
	void naoRemoveDeDois() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'b'));
		l.filtra(presente, 'c');
		assertEquals(Map.of(1, 'a', 2, 'b'), presente);
	}

	@Test
	void removePrimeiroDeDois() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'b'));
		l.filtra(presente, 'a');
		assertEquals(Map.of(2, 'b'), presente);
	}

	@Test
	void removeSegundoDeDois() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'b'));
		l.filtra(presente, 'b');
		assertEquals(Map.of(1, 'a'), presente);
	}

	@Test
	void removeDoisDeDois() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'a'));
		l.filtra(presente, 'a');
		assertEquals(Map.of(), presente);
	}

	@Test
	void naoRemoveDeTres() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'c'));
		l.filtra(presente, 'd');
		assertEquals(Map.of(1, 'a', 2, 'b', 3, 'c'), presente);
	}

	@Test
	void removePrimeiroDeTres() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'c'));
		l.filtra(presente, 'a');
		assertEquals(Map.of(2, 'b', 3, 'c'), presente);
	}

	@Test
	void removeSegundoDeTres() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'c'));
		l.filtra(presente, 'b');
		assertEquals(Map.of(1, 'a', 3, 'c'), presente);
	}

	@Test
	void removeTerceiroDeTres() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'c'));
		l.filtra(presente, 'c');
		assertEquals(Map.of(1, 'a', 2, 'b'), presente);
	}

	@Test
	void removePrimeiroSegundoDeTres() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'a', 3, 'b'));
		l.filtra(presente, 'a');
		assertEquals(Map.of(3, 'b'), presente);
	}

	@Test
	void removePrimeiroTerceiroDeTres() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'a'));
		l.filtra(presente, 'a');
		assertEquals(Map.of(2, 'b'), presente);
	}

	@Test
	void removeSegundoTerceiroDeTres() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'b'));
		l.filtra(presente, 'b');
		assertEquals(Map.of(1, 'a'), presente);
	}

	@Test
	void removeTresDeTres() {
		presente = new HashMap<>(Map.of(1, 'a', 2, 'a', 3, 'a'));
		l.filtra(presente, 'a');
		assertEquals(Map.of(), presente);
	}
}
