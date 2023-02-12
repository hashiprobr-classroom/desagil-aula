package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CentroTest {
	private static final double DELTA = 0.000001;

	private Centro c;
	private Map<String, Double> notas;

	@BeforeEach
	void setUp() {
		c = new Centro();
		notas = new HashMap<>();
	}

	@Test
	void zero() {
		notas.put("a", 0.0);
		assertEquals(0.0, c.calcula(notas), DELTA);
	}

	@Test
	void um() {
		notas.put("a", 1.0);
		assertEquals(1.0, c.calcula(notas), DELTA);
	}

	@Test
	void dois() {
		notas.put("a", 2.0);
		assertEquals(2.0, c.calcula(notas), DELTA);
	}

	@Test
	void cinco() {
		notas.put("a", 5.0);
		assertEquals(5.0, c.calcula(notas), DELTA);
	}

	@Test
	void zeroZero() {
		notas.put("a", 0.0);
		notas.put("b", 0.0);
		assertEquals(0.0, c.calcula(notas), DELTA);
	}

	@Test
	void zeroUm() {
		notas.put("a", 0.0);
		notas.put("b", 1.0);
		assertEquals(0.5, c.calcula(notas), DELTA);
	}

	@Test
	void zeroDois() {
		notas.put("a", 0.0);
		notas.put("b", 2.0);
		assertEquals(1.0, c.calcula(notas), DELTA);
	}

	@Test
	void zeroCinco() {
		notas.put("a", 0.0);
		notas.put("b", 5.0);
		assertEquals(2.5, c.calcula(notas), DELTA);
	}

	@Test
	void umZero() {
		notas.put("a", 1.0);
		notas.put("b", 0.0);
		assertEquals(0.5, c.calcula(notas), DELTA);
	}

	@Test
	void umUm() {
		notas.put("a", 1.0);
		notas.put("b", 1.0);
		assertEquals(1.0, c.calcula(notas), DELTA);
	}

	@Test
	void umDois() {
		notas.put("a", 1.0);
		notas.put("b", 2.0);
		assertEquals(1.5, c.calcula(notas), DELTA);
	}

	@Test
	void umCinco() {
		notas.put("a", 1.0);
		notas.put("b", 5.0);
		assertEquals(3.0, c.calcula(notas), DELTA);
	}

	@Test
	void doisZero() {
		notas.put("a", 2.0);
		notas.put("b", 0.0);
		assertEquals(1.0, c.calcula(notas), DELTA);
	}

	@Test
	void doisUm() {
		notas.put("a", 2.0);
		notas.put("b", 1.0);
		assertEquals(1.5, c.calcula(notas), DELTA);
	}

	@Test
	void doisDois() {
		notas.put("a", 2.0);
		notas.put("b", 2.0);
		assertEquals(2.0, c.calcula(notas), DELTA);
	}

	@Test
	void doisCinco() {
		notas.put("a", 2.0);
		notas.put("b", 5.0);
		assertEquals(3.5, c.calcula(notas), DELTA);
	}

	@Test
	void cincoZero() {
		notas.put("a", 5.0);
		notas.put("b", 0.0);
		assertEquals(2.5, c.calcula(notas), DELTA);
	}

	@Test
	void cincoUm() {
		notas.put("a", 5.0);
		notas.put("b", 1.0);
		assertEquals(3.0, c.calcula(notas), DELTA);
	}

	@Test
	void cincoDois() {
		notas.put("a", 5.0);
		notas.put("b", 2.0);
		assertEquals(3.5, c.calcula(notas), DELTA);
	}

	@Test
	void cincoCinco() {
		notas.put("a", 5.0);
		notas.put("b", 5.0);
		assertEquals(5.0, c.calcula(notas), DELTA);
	}

	@Test
	void zeroUmDois() {
		notas.put("a", 0.0);
		notas.put("b", 1.0);
		notas.put("c", 2.0);
		assertEquals(1.0, c.calcula(notas), DELTA);
	}

	@Test
	void doisUmZero() {
		notas.put("a", 2.0);
		notas.put("b", 1.0);
		notas.put("c", 0.0);
		assertEquals(1.0, c.calcula(notas), DELTA);
	}

	@Test
	void umDoisCinco() {
		notas.put("a", 1.0);
		notas.put("b", 2.0);
		notas.put("c", 5.0);
		assertEquals(3.0, c.calcula(notas), DELTA);
	}

	@Test
	void cincoDoisUm() {
		notas.put("a", 5.0);
		notas.put("b", 2.0);
		notas.put("c", 1.0);
		assertEquals(3.0, c.calcula(notas), DELTA);
	}

	@Test
	void zeroUmCinco() {
		notas.put("a", 0.0);
		notas.put("b", 1.0);
		notas.put("c", 5.0);
		assertEquals(2.5, c.calcula(notas), DELTA);
	}

	@Test
	void cincoUmZero() {
		notas.put("a", 5.0);
		notas.put("b", 1.0);
		notas.put("c", 0.0);
		assertEquals(2.5, c.calcula(notas), DELTA);
	}

	@Test
	void cincoDoisZero() {
		notas.put("a", 5.0);
		notas.put("b", 2.0);
		notas.put("c", 0.0);
		assertEquals(2.5, c.calcula(notas), DELTA);
	}
}
