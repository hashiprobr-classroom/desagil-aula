package br.edu.insper.desagil.aula2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversaTest {
	private Inversa i;

	@BeforeEach
	void setUp() {
		i = new Inversa();
	}

	@Test
	void vazia() {
		assertEquals("", i.constroi(""));
	}

	@Test
	void a() {
		assertEquals("a", i.constroi("a"));
	}

	@Test
	void aa() {
		assertEquals("aa", i.constroi("aa"));
	}

	@Test
	void ab() {
		assertEquals("ba", i.constroi("ab"));
	}

	@Test
	void ba() {
		assertEquals("ab", i.constroi("ba"));
	}

	@Test
	void bb() {
		assertEquals("bb", i.constroi("bb"));
	}

	@Test
	void aaa() {
		assertEquals("aaa", i.constroi("aaa"));
	}

	@Test
	void aab() {
		assertEquals("baa", i.constroi("aab"));
	}

	@Test
	void aba() {
		assertEquals("aba", i.constroi("aba"));
	}

	@Test
	void baa() {
		assertEquals("aab", i.constroi("baa"));
	}

	@Test
	void abb() {
		assertEquals("bba", i.constroi("abb"));
	}

	@Test
	void bab() {
		assertEquals("bab", i.constroi("bab"));
	}

	@Test
	void bba() {
		assertEquals("abb", i.constroi("bba"));
	}

	@Test
	void bbb() {
		assertEquals("bbb", i.constroi("bbb"));
	}

	@Test
	void banana() {
		assertEquals("ananab", i.constroi("banana"));
	}

	@Test
	void abobora() {
		assertEquals("aroboba", i.constroi("abobora"));
	}
}
