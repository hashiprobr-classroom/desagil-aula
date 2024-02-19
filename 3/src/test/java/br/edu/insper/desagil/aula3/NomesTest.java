package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NomesTest {
    private Nomes n;

    @BeforeEach
    void setUp() {
        n = new Nomes();
    }

    @Test
    void testUmNomeUmSobrenome() {
        Map<String, List<String>> sobrenomes = Map.of(
                "joao", List.of("silva"));
        assertMapEquals(Map.of(
                "silva", List.of("joao")), n.inverte(sobrenomes));
    }

    @Test
    void testUmNomeDoisSobrenomes() {
        Map<String, List<String>> sobrenomes = Map.of(
                "joao", List.of("silva", "souza"));
        assertMapEquals(Map.of(
                "silva", List.of("joao"),
                "souza", List.of("joao")), n.inverte(sobrenomes));
    }

    @Test
    void testDoisNomesUmSobrenome() {
        Map<String, List<String>> sobrenomes = Map.of(
                "joao", List.of("silva"),
                "jose", List.of("silva"));
        assertMapEquals(Map.of(
                "silva", List.of("joao", "jose")), n.inverte(sobrenomes));
    }

    @Test
    void testDoisNomesDoisSobrenomes() {
        Map<String, List<String>> sobrenomes = Map.of(
                "joao", List.of("silva", "souza"),
                "jose", List.of("silva", "souza"));
        assertMapEquals(Map.of(
                "silva", List.of("joao", "jose"),
                "souza", List.of("joao", "jose")), n.inverte(sobrenomes));
    }

    @Test
    void enunciado() {
        Map<String, List<String>> sobrenomes = Map.of("joao", List.of("silva", "souza"),
                "maria", List.of("silva"),
                "mariana", List.of("souza"));
        assertMapEquals(Map.of(
                "silva", List.of("joao", "maria"),
                "souza", List.of("joao", "mariana")), n.inverte(sobrenomes));
    }

    private void assertMapEquals(Map<String, List<String>> expected, Map<String, List<String>> actual) {
        assertEquals(expected.size(), actual.size());
        for (String key : expected.keySet()) {
            assertEquals(new HashSet<>(expected.get(key)), new HashSet<>(actual.get(key)));
        }
    }
}
