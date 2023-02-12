package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NomesTest {
	private Nomes n;
	private Map<String, List<String>> sobrenomes;
	private Map<String, List<String>> nomes;

	@BeforeEach
	void setUp() {
		n = new Nomes();
		sobrenomes = new HashMap<>();
		nomes = new HashMap<>();
	}

	@Test
	void testUmNomeUmSobrenome() {
		sobrenomes.put("joao", Arrays.asList("silva"));
		nomes.put("silva", Arrays.asList("joao"));
		assertEquals(nomes, n.inverte(sobrenomes));
	}

	@Test
	void testUmNomeDoisSobrenomes() {
		sobrenomes.put("joao", Arrays.asList("silva", "souza"));
		nomes.put("silva", Arrays.asList("joao"));
		nomes.put("souza", Arrays.asList("joao"));
		assertEquals(nomes, n.inverte(sobrenomes));
	}

	@Test
	void testDoisNomesUmSobrenome() {
		sobrenomes.put("joao", Arrays.asList("silva"));
		sobrenomes.put("jose", Arrays.asList("silva"));
		nomes.put("silva", Arrays.asList("joao", "jose"));
		assertEquals(nomes, n.inverte(sobrenomes));
	}

	@Test
	void testDoisNomesDoisSobrenomes() {
		sobrenomes.put("joao", Arrays.asList("silva", "souza"));
		sobrenomes.put("jose", Arrays.asList("silva", "souza"));
		nomes.put("silva", Arrays.asList("joao", "jose"));
		nomes.put("souza", Arrays.asList("joao", "jose"));
		assertEquals(nomes, n.inverte(sobrenomes));
	}

	@Test
	void exemploEnunciado() {
		sobrenomes.put("joao", Arrays.asList("silva", "souza"));
		sobrenomes.put("maria", Arrays.asList("silva"));
		sobrenomes.put("mariana", Arrays.asList("souza"));
		nomes.put("silva", Arrays.asList("joao", "maria"));
		nomes.put("souza", Arrays.asList("joao", "mariana"));
		assertEquals(nomes, n.inverte(sobrenomes));
	}
}
