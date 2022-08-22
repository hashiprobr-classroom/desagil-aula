package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisoresTest {
	private Divisores d;
	private List<Integer> divisores;

	@BeforeEach
	private void setUp() {
		d = new Divisores();
	}

	@Test
	void um() {
		divisores = Arrays.asList(1);
		assertEquals(divisores, d.calcula(1));
	}

	@Test
	void dois() {
		divisores = Arrays.asList(1, 2);
		assertEquals(divisores, d.calcula(2));
	}

	@Test
	void tres() {
		divisores = Arrays.asList(1, 3);
		assertEquals(divisores, d.calcula(3));
	}

	@Test
	void quatro() {
		divisores = Arrays.asList(1, 2, 4);
		assertEquals(divisores, d.calcula(4));
	}

	@Test
	void cinco() {
		divisores = Arrays.asList(1, 5);
		assertEquals(divisores, d.calcula(5));
	}

	@Test
	void seis() {
		divisores = Arrays.asList(1, 2, 3, 6);
		assertEquals(divisores, d.calcula(6));
	}

	@Test
	void sete() {
		divisores = Arrays.asList(1, 7);
		assertEquals(divisores, d.calcula(7));
	}

	@Test
	void oito() {
		divisores = Arrays.asList(1, 2, 4, 8);
		assertEquals(divisores, d.calcula(8));
	}

	@Test
	void nove() {
		divisores = Arrays.asList(1, 3, 9);
		assertEquals(divisores, d.calcula(9));
	}
}
