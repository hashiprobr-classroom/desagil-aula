package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaTest {
	private static final double DELTA = 0.000001;

	private Media m;
	private List<Integer> numeros;

	@BeforeEach
	private void setUp() {
		m = new Media();
	}

	@Test
	void zero() {
		numeros = Arrays.asList(0);
		assertEquals(0.0, m.calcula(numeros), DELTA);
	}

	@Test
	void um() {
		numeros = Arrays.asList(1);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void dois() {
		numeros = Arrays.asList(2);
		assertEquals(2.0, m.calcula(numeros), DELTA);
	}

	@Test
	void cinco() {
		numeros = Arrays.asList(5);
		assertEquals(5.0, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroZero() {
		numeros = Arrays.asList(0, 0);
		assertEquals(0.0, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroUm() {
		numeros = Arrays.asList(0, 1);
		assertEquals(0.5, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroDois() {
		numeros = Arrays.asList(0, 2);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroCinco() {
		numeros = Arrays.asList(0, 5);
		assertEquals(2.5, m.calcula(numeros), DELTA);
	}

	@Test
	void umZero() {
		numeros = Arrays.asList(1, 0);
		assertEquals(0.5, m.calcula(numeros), DELTA);
	}

	@Test
	void umUm() {
		numeros = Arrays.asList(1, 1);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void umDois() {
		numeros = Arrays.asList(1, 2);
		assertEquals(1.5, m.calcula(numeros), DELTA);
	}

	@Test
	void umCinco() {
		numeros = Arrays.asList(1, 5);
		assertEquals(3.0, m.calcula(numeros), DELTA);
	}

	@Test
	void doisZero() {
		numeros = Arrays.asList(2, 0);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void doisUm() {
		numeros = Arrays.asList(2, 1);
		assertEquals(1.5, m.calcula(numeros), DELTA);
	}

	@Test
	void doisDois() {
		numeros = Arrays.asList(2, 2);
		assertEquals(2.0, m.calcula(numeros), DELTA);
	}

	@Test
	void doisCinco() {
		numeros = Arrays.asList(2, 5);
		assertEquals(3.5, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoZero() {
		numeros = Arrays.asList(5, 0);
		assertEquals(2.5, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoUm() {
		numeros = Arrays.asList(5, 1);
		assertEquals(3.0, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoDois() {
		numeros = Arrays.asList(5, 2);
		assertEquals(3.5, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoCinco() {
		numeros = Arrays.asList(5, 5);
		assertEquals(5.0, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroUmDois() {
		numeros = Arrays.asList(0, 1, 2);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void doisUmZero() {
		numeros = Arrays.asList(2, 1, 0);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void umDoisCinco() {
		numeros = Arrays.asList(1, 2, 5);
		assertEquals(2.666666, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoDoisUm() {
		numeros = Arrays.asList(1, 2, 5);
		assertEquals(2.666666, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroUmCinco() {
		numeros = Arrays.asList(0, 1, 5);
		assertEquals(2, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoUmZero() {
		numeros = Arrays.asList(0, 1, 5);
		assertEquals(2, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoDoisZero() {
		numeros = Arrays.asList(5, 2, 0);
		assertEquals(2.333333, m.calcula(numeros), DELTA);
	}
}
