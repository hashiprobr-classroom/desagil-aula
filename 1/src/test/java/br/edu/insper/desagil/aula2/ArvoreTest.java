package br.edu.insper.desagil.aula2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArvoreTest {
	private Arvore a;

	@BeforeEach
	void setUp() {
		a = new Arvore();
	}

	@Test
	void constroiPara1() {
		assertEquals(String.join("", "|\n"), a.constroi(1));
	}

	@Test
	void constroiPara2() {
		assertEquals(String.join("", " |\n", "/|\\\n"), a.constroi(2));
	}

	@Test
	void constroiPara3() {
		assertEquals(String.join("", "  |\n", " /|\\\n", "//|\\\\\n"), a.constroi(3));
	}

	@Test
	void constroiPara4() {
		assertEquals(String.join("", "   |\n", "  /|\\\n", " //|\\\\\n", "///|\\\\\\\n"), a.constroi(4));
	}

	@Test
	void constroiPara5() {
		assertEquals(String.join("", "    |\n", "   /|\\\n", "  //|\\\\\n", " ///|\\\\\\\n", "////|\\\\\\\\\n"), a.constroi(5));
	}
}
