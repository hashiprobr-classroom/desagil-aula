package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SomaListaTest {
	private SomaLista s;

	@BeforeEach
	void setUp() {
		s = new SomaLista();
	}

	@Test
	void vazia() {
		assertEquals(0, s.calcula(List.of()));
	}

	@Test
	void apenas1() {
		assertEquals(1, s.calcula(List.of(1)));
	}

	@Test
	void apenas2() {
		assertEquals(2, s.calcula(List.of(2)));
	}

	@Test
	void apenas3() {
		assertEquals(3, s.calcula(List.of(3)));
	}

	@Test
	void doisIguais() {
		assertEquals(2, s.calcula(List.of(1, 1)));
	}

	@Test
	void doisDiferentes() {
		assertEquals(3, s.calcula(List.of(1, 2)));
	}

	@Test
	void tresIguais() {
		assertEquals(3, s.calcula(List.of(1, 1, 1)));
	}

	@Test
	void umDiferenteDoisIguais() {
		assertEquals(5, s.calcula(List.of(1, 2, 2)));
	}

	@Test
	void doisIguaisUmDiferente() {
		assertEquals(4, s.calcula(List.of(1, 1, 2)));
	}

	@Test
	void tresDiferentes() {
		assertEquals(6, s.calcula(List.of(1, 2, 3)));
	}
}
