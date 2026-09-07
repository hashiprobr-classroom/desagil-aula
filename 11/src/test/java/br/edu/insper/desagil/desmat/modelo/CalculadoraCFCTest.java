package br.edu.insper.desagil.desmat.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraCFCTest {
    private static final double DELTA = 0.01;

    private CalculadoraCFC c;

    @BeforeEach
    void setUp() {
        c = new CalculadoraCFC();
    }

    @Test
    void aluminio() {
        assertEquals(2.71, c.densidade(26.98, 0.143), DELTA);
    }

    @Test
    void calcio() {
        assertEquals(1.54, c.densidade(40.08, 0.197), DELTA);
    }

    @Test
    void cobre() {
        assertEquals(8.89, c.densidade(63.55, 0.128), DELTA);
    }

    @Test
    void ouro() {
        assertEquals(19.36, c.densidade(196.97, 0.144), DELTA);
    }

    @Test
    void chumbo() {
        assertEquals(11.35, c.densidade(207.2, 0.175), DELTA);
    }

    @Test
    void niquel() {
        assertEquals(8.82, c.densidade(58.69, 0.125), DELTA);
    }

    @Test
    void platina() {
        assertEquals(21.32, c.densidade(195.08, 0.139), DELTA);
    }

    @Test
    void prata() {
        assertEquals(10.6, c.densidade(107.87, 0.144), DELTA);
    }
}
