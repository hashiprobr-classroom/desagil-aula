package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaListaTest {
	private static final double DELTA = 0.000001;

	private MediaLista m;
	private List<Integer> numeros;

	@BeforeEach
	void setUp() {
		m = new MediaLista();
	}

	@Test
	void vazia() {
		numeros = List.of();
		assertEquals(0.0, m.calcula(numeros), DELTA);
	}

	@Test
	void zero() {
		numeros = List.of(0);
		assertEquals(0.0, m.calcula(numeros), DELTA);
	}

	@Test
	void um() {
		numeros = List.of(1);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void dois() {
		numeros = List.of(2);
		assertEquals(2.0, m.calcula(numeros), DELTA);
	}

	@Test
	void cinco() {
		numeros = List.of(5);
		assertEquals(5.0, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroZero() {
		numeros = List.of(0, 0);
		assertEquals(0.0, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroUm() {
		numeros = List.of(0, 1);
		assertEquals(0.5, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroDois() {
		numeros = List.of(0, 2);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroCinco() {
		numeros = List.of(0, 5);
		assertEquals(2.5, m.calcula(numeros), DELTA);
	}

	@Test
	void umZero() {
		numeros = List.of(1, 0);
		assertEquals(0.5, m.calcula(numeros), DELTA);
	}

	@Test
	void umUm() {
		numeros = List.of(1, 1);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void umDois() {
		numeros = List.of(1, 2);
		assertEquals(1.5, m.calcula(numeros), DELTA);
	}

	@Test
	void umCinco() {
		numeros = List.of(1, 5);
		assertEquals(3.0, m.calcula(numeros), DELTA);
	}

	@Test
	void doisZero() {
		numeros = List.of(2, 0);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void doisUm() {
		numeros = List.of(2, 1);
		assertEquals(1.5, m.calcula(numeros), DELTA);
	}

	@Test
	void doisDois() {
		numeros = List.of(2, 2);
		assertEquals(2.0, m.calcula(numeros), DELTA);
	}

	@Test
	void doisCinco() {
		numeros = List.of(2, 5);
		assertEquals(3.5, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoZero() {
		numeros = List.of(5, 0);
		assertEquals(2.5, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoUm() {
		numeros = List.of(5, 1);
		assertEquals(3.0, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoDois() {
		numeros = List.of(5, 2);
		assertEquals(3.5, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoCinco() {
		numeros = List.of(5, 5);
		assertEquals(5.0, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroUmDois() {
		numeros = List.of(0, 1, 2);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void doisUmZero() {
		numeros = List.of(2, 1, 0);
		assertEquals(1.0, m.calcula(numeros), DELTA);
	}

	@Test
	void umDoisCinco() {
		numeros = List.of(1, 2, 5);
		assertEquals(2.666666, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoDoisUm() {
		numeros = List.of(1, 2, 5);
		assertEquals(2.666666, m.calcula(numeros), DELTA);
	}

	@Test
	void zeroUmCinco() {
		numeros = List.of(0, 1, 5);
		assertEquals(2, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoUmZero() {
		numeros = List.of(0, 1, 5);
		assertEquals(2, m.calcula(numeros), DELTA);
	}

	@Test
	void cincoDoisZero() {
		numeros = List.of(5, 2, 0);
		assertEquals(2.333333, m.calcula(numeros), DELTA);
	}
}
