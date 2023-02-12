package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProgressaoAritmeticaTest {
	private ProgressaoAritmetica p;

	@BeforeEach
	void setUp() {
		p = new ProgressaoAritmetica();
	}

	@Test
	void geraPara0e0e0() {
		assertEquals(List.of(), p.gera(0, 0, 0));
	}

	@Test
	void geraPara0e0e1() {
		assertEquals(List.of(0), p.gera(0, 0, 1));
	}

	@Test
	void geraPara0e0e2() {
		assertEquals(List.of(0, 0), p.gera(0, 0, 2));
	}

	@Test
	void geraPara0e0e3() {
		assertEquals(List.of(0, 0, 0), p.gera(0, 0, 3));
	}

	@Test
	void geraPara0e1e0() {
		assertEquals(List.of(), p.gera(0, 1, 0));
	}

	@Test
	void geraPara0e1e1() {
		assertEquals(List.of(0), p.gera(0, 1, 1));
	}

	@Test
	void geraPara0e1e2() {
		assertEquals(List.of(0, 1), p.gera(0, 1, 2));
	}

	@Test
	void geraPara0e1e3() {
		assertEquals(List.of(0, 1, 2), p.gera(0, 1, 3));
	}

	@Test
	void geraPara0e2e0() {
		assertEquals(List.of(), p.gera(0, 2, 0));
	}

	@Test
	void geraPara0e2e1() {
		assertEquals(List.of(0), p.gera(0, 2, 1));
	}

	@Test
	void geraPara0e2e2() {
		assertEquals(List.of(0, 2), p.gera(0, 2, 2));
	}

	@Test
	void geraPara0e2e3() {
		assertEquals(List.of(0, 2, 4), p.gera(0, 2, 3));
	}

	@Test
	void geraPara0e3e0() {
		assertEquals(List.of(), p.gera(0, 3, 0));
	}

	@Test
	void geraPara0e3e1() {
		assertEquals(List.of(0), p.gera(0, 3, 1));
	}

	@Test
	void geraPara0e3e2() {
		assertEquals(List.of(0, 3), p.gera(0, 3, 2));
	}

	@Test
	void geraPara0e3e3() {
		assertEquals(List.of(0, 3, 6), p.gera(0, 3, 3));
	}

	@Test
	void geraPara1e0e0() {
		assertEquals(List.of(), p.gera(1, 0, 0));
	}

	@Test
	void geraPara1e0e1() {
		assertEquals(List.of(1), p.gera(1, 0, 1));
	}

	@Test
	void geraPara1e0e2() {
		assertEquals(List.of(1, 1), p.gera(1, 0, 2));
	}

	@Test
	void geraPara1e0e3() {
		assertEquals(List.of(1, 1, 1), p.gera(1, 0, 3));
	}

	@Test
	void geraPara1e1e0() {
		assertEquals(List.of(), p.gera(1, 1, 0));
	}

	@Test
	void geraPara1e1e1() {
		assertEquals(List.of(1), p.gera(1, 1, 1));
	}

	@Test
	void geraPara1e1e2() {
		assertEquals(List.of(1, 2), p.gera(1, 1, 2));
	}

	@Test
	void geraPara1e1e3() {
		assertEquals(List.of(1, 2, 3), p.gera(1, 1, 3));
	}

	@Test
	void geraPara1e2e0() {
		assertEquals(List.of(), p.gera(1, 2, 0));
	}

	@Test
	void geraPara1e2e1() {
		assertEquals(List.of(1), p.gera(1, 2, 1));
	}

	@Test
	void geraPara1e2e2() {
		assertEquals(List.of(1, 3), p.gera(1, 2, 2));
	}

	@Test
	void geraPara1e2e3() {
		assertEquals(List.of(1, 3, 5), p.gera(1, 2, 3));
	}

	@Test
	void geraPara1e3e0() {
		assertEquals(List.of(), p.gera(1, 3, 0));
	}

	@Test
	void geraPara1e3e1() {
		assertEquals(List.of(1), p.gera(1, 3, 1));
	}

	@Test
	void geraPara1e3e2() {
		assertEquals(List.of(1, 4), p.gera(1, 3, 2));
	}

	@Test
	void geraPara1e3e3() {
		assertEquals(List.of(1, 4, 7), p.gera(1, 3, 3));
	}

	@Test
	void geraPara2e0e0() {
		assertEquals(List.of(), p.gera(2, 0, 0));
	}

	@Test
	void geraPara2e0e1() {
		assertEquals(List.of(2), p.gera(2, 0, 1));
	}

	@Test
	void geraPara2e0e2() {
		assertEquals(List.of(2, 2), p.gera(2, 0, 2));
	}

	@Test
	void geraPara2e0e3() {
		assertEquals(List.of(2, 2, 2), p.gera(2, 0, 3));
	}

	@Test
	void geraPara2e1e0() {
		assertEquals(List.of(), p.gera(2, 1, 0));
	}

	@Test
	void geraPara2e1e1() {
		assertEquals(List.of(2), p.gera(2, 1, 1));
	}

	@Test
	void geraPara2e1e2() {
		assertEquals(List.of(2, 3), p.gera(2, 1, 2));
	}

	@Test
	void geraPara2e1e3() {
		assertEquals(List.of(2, 3, 4), p.gera(2, 1, 3));
	}

	@Test
	void geraPara2e2e0() {
		assertEquals(List.of(), p.gera(2, 2, 0));
	}

	@Test
	void geraPara2e2e1() {
		assertEquals(List.of(2), p.gera(2, 2, 1));
	}

	@Test
	void geraPara2e2e2() {
		assertEquals(List.of(2, 4), p.gera(2, 2, 2));
	}

	@Test
	void geraPara2e2e3() {
		assertEquals(List.of(2, 4, 6), p.gera(2, 2, 3));
	}

	@Test
	void geraPara2e3e0() {
		assertEquals(List.of(), p.gera(2, 3, 0));
	}

	@Test
	void geraPara2e3e1() {
		assertEquals(List.of(2), p.gera(2, 3, 1));
	}

	@Test
	void geraPara2e3e2() {
		assertEquals(List.of(2, 5), p.gera(2, 3, 2));
	}

	@Test
	void geraPara2e3e3() {
		assertEquals(List.of(2, 5, 8), p.gera(2, 3, 3));
	}

	@Test
	void geraPara3e0e0() {
		assertEquals(List.of(), p.gera(3, 0, 0));
	}

	@Test
	void geraPara3e0e1() {
		assertEquals(List.of(3), p.gera(3, 0, 1));
	}

	@Test
	void geraPara3e0e2() {
		assertEquals(List.of(3, 3), p.gera(3, 0, 2));
	}

	@Test
	void geraPara3e0e3() {
		assertEquals(List.of(3, 3, 3), p.gera(3, 0, 3));
	}

	@Test
	void geraPara3e1e0() {
		assertEquals(List.of(), p.gera(3, 1, 0));
	}

	@Test
	void geraPara3e1e1() {
		assertEquals(List.of(3), p.gera(3, 1, 1));
	}

	@Test
	void geraPara3e1e2() {
		assertEquals(List.of(3, 4), p.gera(3, 1, 2));
	}

	@Test
	void geraPara3e1e3() {
		assertEquals(List.of(3, 4, 5), p.gera(3, 1, 3));
	}

	@Test
	void geraPara3e2e0() {
		assertEquals(List.of(), p.gera(3, 2, 0));
	}

	@Test
	void geraPara3e2e1() {
		assertEquals(List.of(3), p.gera(3, 2, 1));
	}

	@Test
	void geraPara3e2e2() {
		assertEquals(List.of(3, 5), p.gera(3, 2, 2));
	}

	@Test
	void geraPara3e2e3() {
		assertEquals(List.of(3, 5, 7), p.gera(3, 2, 3));
	}

	@Test
	void geraPara3e3e0() {
		assertEquals(List.of(), p.gera(3, 3, 0));
	}

	@Test
	void geraPara3e3e1() {
		assertEquals(List.of(3), p.gera(3, 3, 1));
	}

	@Test
	void geraPara3e3e2() {
		assertEquals(List.of(3, 6), p.gera(3, 3, 2));
	}

	@Test
	void geraPara3e3e3() {
		assertEquals(List.of(3, 6, 9), p.gera(3, 3, 3));
	}
}
