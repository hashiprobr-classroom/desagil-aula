package br.edu.insper.desagil.aula8.alfandega;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlfandegaTest {
	private static final double DELTA = 0.01;

	private Alfandega alfandega;

	@BeforeEach
	void setUp() {
		alfandega = new Alfandega();
	}

	@Test
	void testA() {
		alfandega.declara(new Item("a", 25, 5.12));
		alfandega.declara(new Item("b", 50, 6.19));
		assertEquals(437.5, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(0, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testB() {
		alfandega.declara(new Item("a", 50, 5.12));
		alfandega.declara(new Item("b", 25, 6.19));
		assertEquals(410.75, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(0, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testC() {
		alfandega.declara(new Item("a", 25, 5.12));
		alfandega.declara(new ItemTarifado("b", 50, 6.19, 0.6));
		assertEquals(437.5, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(185.7, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testD() {
		alfandega.declara(new Item("a", 50, 5.12));
		alfandega.declara(new ItemTarifado("b", 25, 6.19, 0.6));
		assertEquals(410.75, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(92.85, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testE() {
		alfandega.declara(new ItemTarifado("a", 25, 5.12, 0.6));
		alfandega.declara(new Item("b", 50, 6.19));
		assertEquals(437.5, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(76.8, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testF() {
		alfandega.declara(new ItemTarifado("a", 50, 5.12, 0.6));
		alfandega.declara(new Item("b", 25, 6.19));
		assertEquals(410.75, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(153.6, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testG() {
		alfandega.declara(new ItemTarifado("a", 25, 5.12, 0.6));
		alfandega.declara(new ItemTarifado("b", 50, 6.19, 0.6));
		assertEquals(437.5, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(262.5, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testH() {
		alfandega.declara(new ItemTarifado("a", 50, 5.12, 0.6));
		alfandega.declara(new ItemTarifado("b", 25, 6.19, 0.6));
		assertEquals(410.75, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(246.45, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testI() {
		alfandega.declara(new ItemTarifado("a", 25, 5.12, 0.8));
		alfandega.declara(new ItemTarifado("b", 50, 6.19, 0.8));
		assertEquals(437.5, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(350, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testJ() {
		alfandega.declara(new ItemTarifado("a", 50, 5.12, 0.8));
		alfandega.declara(new ItemTarifado("b", 25, 6.19, 0.8));
		assertEquals(410.75, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(328.6, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testK() {
		alfandega.declara(new ItemTarifado("a", 25, 5.12, 0.6));
		alfandega.declara(new ItemTarifado("b", 50, 6.19, 0.8));
		assertEquals(437.5, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(324.4, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testL() {
		alfandega.declara(new ItemTarifado("a", 50, 5.12, 0.6));
		alfandega.declara(new ItemTarifado("b", 25, 6.19, 0.8));
		assertEquals(410.75, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(277.4, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testM() {
		alfandega.declara(new ItemTarifado("a", 25, 5.12, 0.8));
		alfandega.declara(new ItemTarifado("b", 50, 6.19, 0.6));
		assertEquals(437.5, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(288.1, alfandega.calculaTotalExtra(), DELTA);
	}

	@Test
	void testN() {
		alfandega.declara(new ItemTarifado("a", 50, 5.12, 0.8));
		alfandega.declara(new ItemTarifado("b", 25, 6.19, 0.6));
		assertEquals(410.75, alfandega.calculaTotalTarifado(), DELTA);
		assertEquals(297.65, alfandega.calculaTotalExtra(), DELTA);
	}
}
