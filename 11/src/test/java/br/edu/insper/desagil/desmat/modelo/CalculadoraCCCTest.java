package br.edu.insper.desagil.desmat.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraCCCTest {
    private static final double DELTA = 0.01;

    private CalculadoraCCC c;

    @BeforeEach
    void setUp() {
        c = new CalculadoraCCC();
    }

    @Test
    void bario() {
        assertEquals(3.62, c.densidade(137.33, 0.217), DELTA);
    }

    @Test
    void cesio() {
        assertEquals(1.93, c.densidade(132.91, 0.265), DELTA);
    }

    @Test
    void cromio() {
        assertEquals(7.18, c.densidade(52, 0.125), DELTA);
    }

    @Test
    void ferro() {
        assertEquals(7.9, c.densidade(55.85, 0.124), DELTA);
    }

    @Test
    void litio() {
        assertEquals(0.53, c.densidade(6.94, 0.152), DELTA);
    }

    @Test
    void molibdenio() {
        assertEquals(10.28, c.densidade(95.94, 0.136), DELTA);
    }

    @Test
    void niobio() {
        assertEquals(8.57, c.densidade(92.91, 0.143), DELTA);
    }

    @Test
    void potassio() {
        assertEquals(0.86, c.densidade(39.1, 0.231), DELTA);
    }

    @Test
    void sodio() {
        assertEquals(0.96, c.densidade(22.99, 0.186), DELTA);
    }

    @Test
    void tungstenio() {
        assertEquals(19.28, c.densidade(183.84, 0.137), DELTA);
    }

    @Test
    void vanadio() {
        assertEquals(5.97, c.densidade(50.94, 0.132), DELTA);
    }
}
