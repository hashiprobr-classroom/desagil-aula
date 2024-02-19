package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisoresTest {
    private Divisores d;

    @BeforeEach
    void setUp() {
        d = new Divisores();
    }

    @Test
    void um() {
        assertEquals(List.of(1), d.extrai(1));
    }

    @Test
    void dois() {
        assertEquals(List.of(1, 2), d.extrai(2));
    }

    @Test
    void tres() {
        assertEquals(List.of(1, 3), d.extrai(3));
    }

    @Test
    void quatro() {
        assertEquals(List.of(1, 2, 4), d.extrai(4));
    }

    @Test
    void cinco() {
        assertEquals(List.of(1, 5), d.extrai(5));
    }

    @Test
    void seis() {
        assertEquals(List.of(1, 2, 3, 6), d.extrai(6));
    }

    @Test
    void sete() {
        assertEquals(List.of(1, 7), d.extrai(7));
    }

    @Test
    void oito() {
        assertEquals(List.of(1, 2, 4, 8), d.extrai(8));
    }

    @Test
    void nove() {
        assertEquals(List.of(1, 3, 9), d.extrai(9));
    }
}
