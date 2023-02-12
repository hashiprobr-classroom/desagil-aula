package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CopiaListaTest {
	private CopiaLista c;

	@BeforeEach
	void setUp() {
		c = new CopiaLista();
	}

	@Test
	void vazia() {
		assertEquals(List.of(), c.realiza(List.of()));
	}

	@Test
	void apenas1() {
		assertEquals(List.of(1), c.realiza(List.of(1)));
	}

	@Test
	void apenas2() {
		assertEquals(List.of(2), c.realiza(List.of(2)));
	}

	@Test
	void apenas3() {
		assertEquals(List.of(3), c.realiza(List.of(3)));
	}

	@Test
	void doisIguais() {
		assertEquals(List.of(1, 1), c.realiza(List.of(1, 1)));
	}

	@Test
	void doisDiferentes() {
		assertEquals(List.of(1, 2), c.realiza(List.of(1, 2)));
	}

	@Test
	void tresIguais() {
		assertEquals(List.of(1, 1, 1), c.realiza(List.of(1, 1, 1)));
	}

	@Test
	void umDiferenteDoisIguais() {
		assertEquals(List.of(1, 2, 2), c.realiza(List.of(1, 2, 2)));
	}

	@Test
	void doisIguaisUmDiferente() {
		assertEquals(List.of(1, 1, 2), c.realiza(List.of(1, 1, 2)));
	}

	@Test
	void tresDiferentes() {
		assertEquals(List.of(1, 2, 3), c.realiza(List.of(1, 2, 3)));
	}
}
