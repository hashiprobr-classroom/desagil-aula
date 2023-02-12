package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisoresTest {
	private Divisores d;
	private List<Integer> divisores;

	@BeforeEach
	void setUp() {
		d = new Divisores();
	}

	@Test
	void um() {
		divisores = List.of(1);
		assertEquals(divisores, d.extrai(1));
	}

	@Test
	void dois() {
		divisores = List.of(1, 2);
		assertEquals(divisores, d.extrai(2));
	}

	@Test
	void tres() {
		divisores = List.of(1, 3);
		assertEquals(divisores, d.extrai(3));
	}

	@Test
	void quatro() {
		divisores = List.of(1, 2, 4);
		assertEquals(divisores, d.extrai(4));
	}

	@Test
	void cinco() {
		divisores = List.of(1, 5);
		assertEquals(divisores, d.extrai(5));
	}

	@Test
	void seis() {
		divisores = List.of(1, 2, 3, 6);
		assertEquals(divisores, d.extrai(6));
	}

	@Test
	void sete() {
		divisores = List.of(1, 7);
		assertEquals(divisores, d.extrai(7));
	}

	@Test
	void oito() {
		divisores = List.of(1, 2, 4, 8);
		assertEquals(divisores, d.extrai(8));
	}

	@Test
	void nove() {
		divisores = List.of(1, 3, 9);
		assertEquals(divisores, d.extrai(9));
	}
}
