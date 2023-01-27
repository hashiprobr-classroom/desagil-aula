package br.edu.insper.desagil.aula2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PotenciaTest {
	private Potencia p;

	@BeforeEach
	void setUp() {
		p = new Potencia();
	}

	@Test
	void calcula0por0() {
		assertEquals(1, p.calcula(0, 0));
	}

	@Test
	void calcula0por1() {
		assertEquals(0, p.calcula(0, 1));
	}

	@Test
	void calcula0por2() {
		assertEquals(0, p.calcula(0, 2));
	}

	@Test
	void calcula0por3() {
		assertEquals(0, p.calcula(0, 3));
	}

	@Test
	void calcula1por0() {
		assertEquals(1, p.calcula(1, 0));
	}

	@Test
	void calcula1por1() {
		assertEquals(1, p.calcula(1, 1));
	}

	@Test
	void calcula1por2() {
		assertEquals(1, p.calcula(1, 2));
	}

	@Test
	void calcula1por3() {
		assertEquals(1, p.calcula(1, 3));
	}

	@Test
	void calcula2por0() {
		assertEquals(1, p.calcula(2, 0));
	}

	@Test
	void calcula2por1() {
		assertEquals(2, p.calcula(2, 1));
	}

	@Test
	void calcula2por2() {
		assertEquals(4, p.calcula(2, 2));
	}

	@Test
	void calcula2por3() {
		assertEquals(8, p.calcula(2, 3));
	}

	@Test
	void calcula3por0() {
		assertEquals(1, p.calcula(3, 0));
	}

	@Test
	void calcula3por1() {
		assertEquals(3, p.calcula(3, 1));
	}

	@Test
	void calcula3por2() {
		assertEquals(9, p.calcula(3, 2));
	}

	@Test
	void calcula3por3() {
		assertEquals(27, p.calcula(3, 3));
	}
}
