package br.edu.insper.desagil.aula2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BissextoTest {
	private Bissexto b;

	@BeforeEach
	void setUp() {
		b = new Bissexto();
	}

	@Test
	void devolveTrueSeRecebe2000() {
		assertTrue(b.decide(2000));
	}

	@Test
	void devolveFalseSeRecebe2001() {
		assertFalse(b.decide(2001));
	}

	@Test
	void devolveFalseSeRecebe2002() {
		assertFalse(b.decide(2002));
	}

	@Test
	void devolveFalseSeRecebe2003() {
		assertFalse(b.decide(2003));
	}

	@Test
	void devolveTrueSeRecebe2004() {
		assertTrue(b.decide(2004));
	}

	@Test
	void devolveFalseSeRecebe2005() {
		assertFalse(b.decide(2005));
	}

	@Test
	void devolveFalseSeRecebe2006() {
		assertFalse(b.decide(2006));
	}

	@Test
	void devolveFalseSeRecebe2007() {
		assertFalse(b.decide(2007));
	}

	@Test
	void devolveTrueSeRecebe2008() {
		assertTrue(b.decide(2008));
	}

	@Test
	void devolveFalseSeRecebe2009() {
		assertFalse(b.decide(2009));
	}

	@Test
	void devolveFalseSeRecebe2010() {
		assertFalse(b.decide(2010));
	}

	@Test
	void devolveFalseSeRecebe2011() {
		assertFalse(b.decide(2011));
	}

	@Test
	void devolveTrueSeRecebe2012() {
		assertTrue(b.decide(2012));
	}

	@Test
	void devolveFalseSeRecebe2013() {
		assertFalse(b.decide(2013));
	}

	@Test
	void devolveFalseSeRecebe2014() {
		assertFalse(b.decide(2014));
	}

	@Test
	void devolveFalseSeRecebe2015() {
		assertFalse(b.decide(2015));
	}

	@Test
	void devolveTrueSeRecebe2016() {
		assertTrue(b.decide(2016));
	}

	@Test
	void devolveFalseSeRecebe2017() {
		assertFalse(b.decide(2017));
	}

	@Test
	void devolveFalseSeRecebe2018() {
		assertFalse(b.decide(2018));
	}

	@Test
	void devolveFalseSeRecebe2019() {
		assertFalse(b.decide(2019));
	}

	@Test
	void devolveTrueSeRecebe2020() {
		assertTrue(b.decide(2020));
	}
}
