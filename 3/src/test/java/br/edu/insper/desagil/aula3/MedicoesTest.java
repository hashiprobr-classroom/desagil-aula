package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MedicoesTest {
	private static final double DELTA = 0.000001;

	private Medicoes m;
	private Map<Integer, Double> actual;
	private Map<Integer, Double> expected;

	private void compare(Map<Integer, Double> expected, Map<Integer, Double> actual) {
		assertEquals(expected.size(), expected.size());
		for (int chave : expected.keySet()) {
			assertEquals(expected.get(chave), actual.get(chave), DELTA);
		}
	}

	@BeforeEach
	private void setUp() {
		m = new Medicoes();
		actual = new HashMap<>();
		expected = new HashMap<>();
	}

	@Test
	void umUmUm() {
		actual.put(1, 1.0);
		actual.put(2, 1.0);
		actual.put(3, 1.0);
		m.normaliza(actual);
		expected.put(1, 0.333333);
		expected.put(2, 0.333333);
		expected.put(3, 0.333333);
		compare(expected, actual);
	}

	@Test
	void umUmDois() {
		actual.put(1, 1.0);
		actual.put(2, 1.0);
		actual.put(3, 2.0);
		m.normaliza(actual);
		expected.put(1, 0.25);
		expected.put(2, 0.25);
		expected.put(3, 0.5);
		compare(expected, actual);
	}

	@Test
	void umUmCinco() {
		actual.put(1, 1.0);
		actual.put(2, 1.0);
		actual.put(3, 5.0);
		m.normaliza(actual);
		expected.put(1, 0.142857);
		expected.put(2, 0.142857);
		expected.put(3, 0.714285);
		compare(expected, actual);
	}

	@Test
	void umDoisDois() {
		actual.put(1, 1.0);
		actual.put(2, 2.0);
		actual.put(3, 2.0);
		m.normaliza(actual);
		expected.put(1, 0.2);
		expected.put(2, 0.4);
		expected.put(3, 0.4);
		compare(expected, actual);
	}

	@Test
	void umDoisCinco() {
		actual.put(1, 1.0);
		actual.put(2, 2.0);
		actual.put(3, 5.0);
		m.normaliza(actual);
		expected.put(1, 0.125);
		expected.put(2, 0.25);
		expected.put(3, 0.625);
		compare(expected, actual);
	}

	@Test
	void doisDoisDois() {
		actual.put(1, 2.0);
		actual.put(2, 2.0);
		actual.put(3, 2.0);
		m.normaliza(actual);
		expected.put(1, 0.333333);
		expected.put(2, 0.333333);
		expected.put(3, 0.333333);
		compare(expected, actual);
	}

	@Test
	void DoisDoisCinco() {
		actual.put(1, 2.0);
		actual.put(2, 2.0);
		actual.put(3, 5.0);
		m.normaliza(actual);
		expected.put(1, 0.222222);
		expected.put(2, 0.222222);
		expected.put(3, 0.555555);
		compare(expected, actual);
	}

	@Test
	void DoisCincoCinco() {
		actual.put(1, 2.0);
		actual.put(2, 5.0);
		actual.put(3, 5.0);
		m.normaliza(actual);
		expected.put(1, 0.166666);
		expected.put(2, 0.416666);
		expected.put(3, 0.416666);
		compare(expected, actual);
	}

	@Test
	void cincoCincoCinco() {
		actual.put(1, 5.0);
		actual.put(2, 5.0);
		actual.put(3, 5.0);
		m.normaliza(actual);
		expected.put(1, 0.333333);
		expected.put(2, 0.333333);
		expected.put(3, 0.333333);
		compare(expected, actual);
	}
}
