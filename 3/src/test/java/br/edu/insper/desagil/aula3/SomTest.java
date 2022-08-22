package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SomTest {
	private Som s;
	private List<Integer> actual;
	private List<Integer> expected;

	@BeforeEach
	private void setUp() {
		s = new Som();
	}

	@Test
	void MenosUmDoisMenosTresComUm() {
		actual = Arrays.asList(-1, 2, -3);
		s.clip(actual, 1);
		expected = Arrays.asList(-1, 1, -1);
		assertEquals(expected, actual);
	}

	@Test
	void TresMenosDoisUmComUm() {
		actual = Arrays.asList(3, -2, 1);
		s.clip(actual, 1);
		expected = Arrays.asList(1, -1, 1);
		assertEquals(expected, actual);
	}

	@Test
	void MenosUmDoisMenosTresComZero() {
		actual = Arrays.asList(-1, 2, -3);
		s.clip(actual, 0);
		expected = Arrays.asList(0, 0, 0);
		assertEquals(expected, actual);
	}

	@Test
	void TresMenosDoisUmComZero() {
		actual = Arrays.asList(3, -2, 1);
		s.clip(actual, 0);
		expected = Arrays.asList(0, 0, 0);
		assertEquals(expected, actual);
	}

	@Test
	void MenosUmDoisMenosTresComDois() {
		actual = Arrays.asList(-1, 2, -3);
		s.clip(actual, 2);
		expected = Arrays.asList(-1, 2, -2);
		assertEquals(expected, actual);
	}

	@Test
	void TresMenosDoisUmComDois() {
		actual = Arrays.asList(3, -2, 1);
		s.clip(actual, 2);
		expected = Arrays.asList(2, -2, 1);
		assertEquals(expected, actual);
	}
}
