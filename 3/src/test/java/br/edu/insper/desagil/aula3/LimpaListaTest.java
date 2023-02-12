package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LimpaListaTest {
	private LimpaLista l;
	private List<Character> letras;

	@BeforeEach
	void setUp() {
		l = new LimpaLista();
	}

	@Test
	void vazio() {
		letras = new ArrayList<>(List.of());
		l.filtra(letras, 'a');
		assertEquals(List.of(), letras);
	}

	@Test
	void naoRemoveDeUm() {
		letras = new ArrayList<>(List.of('a'));
		l.filtra(letras, 'b');
		assertEquals(List.of('a'), letras);
	}

	@Test
	void removeUmDeUm() {
		letras = new ArrayList<>(List.of('a'));
		l.filtra(letras, 'a');
		assertEquals(List.of(), letras);
	}

	@Test
	void naoRemoveDeDois() {
		letras = new ArrayList<>(List.of('a', 'b'));
		l.filtra(letras, 'c');
		assertEquals(List.of('a', 'b'), letras);
	}

	@Test
	void removePrimeiroDeDois() {
		letras = new ArrayList<>(List.of('a', 'b'));
		l.filtra(letras, 'a');
		assertEquals(List.of('b'), letras);
	}

	@Test
	void removeSegundoDeDois() {
		letras = new ArrayList<>(List.of('a', 'b'));
		l.filtra(letras, 'b');
		assertEquals(List.of('a'), letras);
	}

	@Test
	void removeDoisDeDois() {
		letras = new ArrayList<>(List.of('a', 'a'));
		l.filtra(letras, 'a');
		assertEquals(List.of(), letras);
	}

	@Test
	void naoRemoveDeTres() {
		letras = new ArrayList<>(List.of('a', 'b', 'c'));
		l.filtra(letras, 'd');
		assertEquals(List.of('a', 'b', 'c'), letras);
	}

	@Test
	void removePrimeiroDeTres() {
		letras = new ArrayList<>(List.of('a', 'b', 'c'));
		l.filtra(letras, 'a');
		assertEquals(List.of('b', 'c'), letras);
	}

	@Test
	void removeSegundoDeTres() {
		letras = new ArrayList<>(List.of('a', 'b', 'c'));
		l.filtra(letras, 'b');
		assertEquals(List.of('a', 'c'), letras);
	}

	@Test
	void removeTerceiroDeTres() {
		letras = new ArrayList<>(List.of('a', 'b', 'c'));
		l.filtra(letras, 'c');
		assertEquals(List.of('a', 'b'), letras);
	}

	@Test
	void removePrimeiroSegundoDeTres() {
		letras = new ArrayList<>(List.of('a', 'a', 'b'));
		l.filtra(letras, 'a');
		assertEquals(List.of('b'), letras);
	}

	@Test
	void removePrimeiroTerceiroDeTres() {
		letras = new ArrayList<>(List.of('a', 'b', 'a'));
		l.filtra(letras, 'a');
		assertEquals(List.of('b'), letras);
	}

	@Test
	void removeSegundoTerceiroDeTres() {
		letras = new ArrayList<>(List.of('a', 'b', 'b'));
		l.filtra(letras, 'b');
		assertEquals(List.of('a'), letras);
	}

	@Test
	void removeTresDeTres() {
		letras = new ArrayList<>(List.of('a', 'a', 'a'));
		l.filtra(letras, 'a');
		assertEquals(List.of(), letras);
	}
}
