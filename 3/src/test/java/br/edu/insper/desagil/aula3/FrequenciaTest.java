package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequenciaTest {
    private Frequencia f;

    @BeforeEach
    void setUp() {
        f = new Frequencia();
    }

    @Test
    void banana() {
        assertEquals(Map.of(
                'b', 1,
                'a', 3,
                'n', 2), f.conta("banana"));
    }

    @Test
    void abobora() {
        assertEquals(Map.of(
                'a', 2,
                'b', 2,
                'o', 2,
                'r', 1), f.conta("abobora"));
    }

    @Test
    void insper() {
        assertEquals(Map.of(
                'i', 1,
                'n', 1,
                's', 1,
                'p', 1,
                'e', 1,
                'r', 1), f.conta("insper"));
    }
}
