package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CopiaDicionarioTest {
	private static final double DELTA = 0.000001;

	private CopiaDicionario c;

	@BeforeEach
	void setUp() {
		c = new CopiaDicionario();
	}

	@Test
	void vazia() {
		assertMapEquals(Map.of(), c.realiza(Map.of()));
	}

	@Test
	void umIgual() {
		assertMapEquals(Map.of(1, 1.0), c.realiza(Map.of(1, 1.0)));
	}

	@Test
	void umDiferente() {
		assertMapEquals(Map.of(1, 2.3), c.realiza(Map.of(1, 2.3)));
	}

	@Test
	void doisIguais() {
		assertMapEquals(Map.of(1, 1.0, 2, 2.0), c.realiza(Map.of(1, 1.0, 2, 2.0)));
	}

	@Test
	void doisDiferentes() {
		assertMapEquals(Map.of(1, 2.3, 4, 5.6), c.realiza(Map.of(1, 2.3, 4, 5.6)));
	}

	@Test
	void tresIguais() {
		assertMapEquals(Map.of(1, 1.0, 2, 2.0, 3, 3.0), c.realiza(Map.of(1, 1.0, 2, 2.0, 3, 3.0)));
	}

	@Test
	void umDiferenteDoisIguais() {
		assertMapEquals(Map.of(1, 2.3, 4, 4.0, 5, 5.0), c.realiza(Map.of(1, 2.3, 4, 4.0, 5, 5.0)));
	}

	@Test
	void doisIguaisUmDiferente() {
		assertMapEquals(Map.of(1, 1.0, 2, 2.0, 3, 4.5), c.realiza(Map.of(1, 1.0, 2, 2.0, 3, 4.5)));
	}

	@Test
	void tresDiferentes() {
		assertMapEquals(Map.of(1, 2.3, 4, 5.6, 7, 8.9), c.realiza(Map.of(1, 2.3, 4, 5.6, 7, 8.9)));
	}

	private void assertMapEquals(Map<Integer, Double> expected, Map<Integer, Double> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i : expected.keySet()) {
			assertEquals(expected.get(i), actual.get(i), DELTA);
		}
	}
}
