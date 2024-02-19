package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentroTest {
    private static final double DELTA = 0.000001;

    private Centro c;

    @BeforeEach
    void setUp() {
        c = new Centro();
    }

    @Test
    void zero() {
        assertEquals(0.0, c.calcula(Map.of("a", 0.0)), DELTA);
    }

    @Test
    void um() {
        assertEquals(1.0, c.calcula(Map.of("a", 1.0)), DELTA);
    }

    @Test
    void dois() {
        assertEquals(2.0, c.calcula(Map.of("a", 2.0)), DELTA);
    }

    @Test
    void tres() {
        assertEquals(3.0, c.calcula(Map.of("a", 3.0)), DELTA);
    }

    @Test
    void quatro() {
        assertEquals(4.0, c.calcula(Map.of("a", 4.0)), DELTA);
    }

    @Test
    void cinco() {
        assertEquals(5.0, c.calcula(Map.of("a", 5.0)), DELTA);
    }

    @Test
    void zeroZero() {
        assertEquals(0.0, c.calcula(Map.of("a", 0.0, "b", 0.0)), DELTA);
    }

    @Test
    void zeroUm() {
        assertEquals(0.5, c.calcula(Map.of("a", 0.0, "b", 1.0)), DELTA);
    }

    @Test
    void zeroDois() {
        assertEquals(1.0, c.calcula(Map.of("a", 0.0, "b", 2.0)), DELTA);
    }

    @Test
    void zeroTres() {
        assertEquals(1.5, c.calcula(Map.of("a", 0.0, "b", 3.0)), DELTA);
    }

    @Test
    void zeroQuatro() {
        assertEquals(2.0, c.calcula(Map.of("a", 0.0, "b", 4.0)), DELTA);
    }

    @Test
    void zeroCinco() {
        assertEquals(2.5, c.calcula(Map.of("a", 0.0, "b", 5.0)), DELTA);
    }

    @Test
    void umZero() {
        assertEquals(0.5, c.calcula(Map.of("a", 1.0, "b", 0.0)), DELTA);
    }

    @Test
    void umUm() {
        assertEquals(1.0, c.calcula(Map.of("a", 1.0, "b", 1.0)), DELTA);
    }

    @Test
    void umDois() {
        assertEquals(1.5, c.calcula(Map.of("a", 1.0, "b", 2.0)), DELTA);
    }

    @Test
    void umTres() {
        assertEquals(2.0, c.calcula(Map.of("a", 1.0, "b", 3.0)), DELTA);
    }

    @Test
    void umQuatro() {
        assertEquals(2.5, c.calcula(Map.of("a", 1.0, "b", 4.0)), DELTA);
    }

    @Test
    void umCinco() {
        assertEquals(3.0, c.calcula(Map.of("a", 1.0, "b", 5.0)), DELTA);
    }

    @Test
    void doisZero() {
        assertEquals(1.0, c.calcula(Map.of("a", 2.0, "b", 0.0)), DELTA);
    }

    @Test
    void doisUm() {
        assertEquals(1.5, c.calcula(Map.of("a", 2.0, "b", 1.0)), DELTA);
    }

    @Test
    void doisDois() {
        assertEquals(2.0, c.calcula(Map.of("a", 2.0, "b", 2.0)), DELTA);
    }

    @Test
    void doisTres() {
        assertEquals(2.5, c.calcula(Map.of("a", 2.0, "b", 3.0)), DELTA);
    }

    @Test
    void doisQuatro() {
        assertEquals(3.0, c.calcula(Map.of("a", 2.0, "b", 4.0)), DELTA);
    }

    @Test
    void doisCinco() {
        assertEquals(3.5, c.calcula(Map.of("a", 2.0, "b", 5.0)), DELTA);
    }

    @Test
    void tresZero() {
        assertEquals(1.5, c.calcula(Map.of("a", 3.0, "b", 0.0)), DELTA);
    }

    @Test
    void tresUm() {
        assertEquals(2.0, c.calcula(Map.of("a", 3.0, "b", 1.0)), DELTA);
    }

    @Test
    void tresDois() {
        assertEquals(2.5, c.calcula(Map.of("a", 3.0, "b", 2.0)), DELTA);
    }

    @Test
    void tresTres() {
        assertEquals(3.0, c.calcula(Map.of("a", 3.0, "b", 3.0)), DELTA);
    }

    @Test
    void tresQuatro() {
        assertEquals(3.5, c.calcula(Map.of("a", 3.0, "b", 4.0)), DELTA);
    }

    @Test
    void tresCinco() {
        assertEquals(4.0, c.calcula(Map.of("a", 3.0, "b", 5.0)), DELTA);
    }

    @Test
    void quatroZero() {
        assertEquals(2.0, c.calcula(Map.of("a", 4.0, "b", 0.0)), DELTA);
    }

    @Test
    void quatroUm() {
        assertEquals(2.5, c.calcula(Map.of("a", 4.0, "b", 1.0)), DELTA);
    }

    @Test
    void quatroDois() {
        assertEquals(3.0, c.calcula(Map.of("a", 4.0, "b", 2.0)), DELTA);
    }

    @Test
    void quatroTres() {
        assertEquals(3.5, c.calcula(Map.of("a", 4.0, "b", 3.0)), DELTA);
    }

    @Test
    void quatroQuatro() {
        assertEquals(4.0, c.calcula(Map.of("a", 4.0, "b", 4.0)), DELTA);
    }

    @Test
    void quatroCinco() {
        assertEquals(4.5, c.calcula(Map.of("a", 4.0, "b", 5.0)), DELTA);
    }

    @Test
    void cincoZero() {
        assertEquals(2.5, c.calcula(Map.of("a", 5.0, "b", 0.0)), DELTA);
    }

    @Test
    void cincoUm() {
        assertEquals(3.0, c.calcula(Map.of("a", 5.0, "b", 1.0)), DELTA);
    }

    @Test
    void cincoDois() {
        assertEquals(3.5, c.calcula(Map.of("a", 5.0, "b", 2.0)), DELTA);
    }

    @Test
    void cincoTres() {
        assertEquals(4.0, c.calcula(Map.of("a", 5.0, "b", 3.0)), DELTA);
    }

    @Test
    void cincoQuatro() {
        assertEquals(4.5, c.calcula(Map.of("a", 5.0, "b", 4.0)), DELTA);
    }

    @Test
    void cincoCinco() {
        assertEquals(5.0, c.calcula(Map.of("a", 5.0, "b", 5.0)), DELTA);
    }

    @Test
    void zeroUmDois() {
        assertEquals(1.0, c.calcula(Map.of("a", 0.0, "b", 1.0, "c", 2.0)), DELTA);
    }

    @Test
    void umDoisTres() {
        assertEquals(2.0, c.calcula(Map.of("a", 1.0, "b", 2.0, "c", 3.0)), DELTA);
    }

    @Test
    void doisTresQuatro() {
        assertEquals(3.0, c.calcula(Map.of("a", 2.0, "b", 3.0, "c", 4.0)), DELTA);
    }

    @Test
    void tresQuatroCinco() {
        assertEquals(4.0, c.calcula(Map.of("a", 3.0, "b", 4.0, "c", 5.0)), DELTA);
    }

    @Test
    void zeroUmTres() {
        assertEquals(1.5, c.calcula(Map.of("a", 0.0, "b", 1.0, "c", 3.0)), DELTA);
    }

    @Test
    void umDoisQuatro() {
        assertEquals(2.5, c.calcula(Map.of("a", 1.0, "b", 2.0, "c", 4.0)), DELTA);
    }

    @Test
    void doisTresCinco() {
        assertEquals(3.5, c.calcula(Map.of("a", 2.0, "b", 3.0, "c", 5.0)), DELTA);
    }

    @Test
    void zeroDoisTres() {
        assertEquals(1.5, c.calcula(Map.of("a", 0.0, "b", 2.0, "c", 3.0)), DELTA);
    }

    @Test
    void umTresQuatro() {
        assertEquals(2.5, c.calcula(Map.of("a", 1.0, "b", 3.0, "c", 4.0)), DELTA);
    }

    @Test
    void doisQuatroCinco() {
        assertEquals(3.5, c.calcula(Map.of("a", 2.0, "b", 4.0, "c", 5.0)), DELTA);
    }

    @Test
    void zeroDoisQuatro() {
        assertEquals(2.0, c.calcula(Map.of("a", 0.0, "b", 2.0, "c", 4.0)), DELTA);
    }

    @Test
    void umTresCinco() {
        assertEquals(3.0, c.calcula(Map.of("a", 1.0, "b", 3.0, "c", 5.0)), DELTA);
    }

    @Test
    void cincoQuatroTres() {
        assertEquals(4.0, c.calcula(Map.of("a", 5.0, "b", 4.0, "c", 3.0)), DELTA);
    }

    @Test
    void quatroTresDois() {
        assertEquals(3.0, c.calcula(Map.of("a", 4.0, "b", 3.0, "c", 2.0)), DELTA);
    }

    @Test
    void tresDoisUm() {
        assertEquals(2.0, c.calcula(Map.of("a", 3.0, "b", 2.0, "c", 1.0)), DELTA);
    }

    @Test
    void doisUmZero() {
        assertEquals(1.0, c.calcula(Map.of("a", 2.0, "b", 1.0, "c", 0.0)), DELTA);
    }

    @Test
    void cincoQuatroDois() {
        assertEquals(3.5, c.calcula(Map.of("a", 5.0, "b", 4.0, "c", 2.0)), DELTA);
    }

    @Test
    void quatroTresUm() {
        assertEquals(2.5, c.calcula(Map.of("a", 4.0, "b", 3.0, "c", 1.0)), DELTA);
    }

    @Test
    void tresDoisZero() {
        assertEquals(1.5, c.calcula(Map.of("a", 3.0, "b", 2.0, "c", 0.0)), DELTA);
    }

    @Test
    void cincoTresUm() {
        assertEquals(3.0, c.calcula(Map.of("a", 5.0, "b", 3.0, "c", 1.0)), DELTA);
    }

    @Test
    void quatroDoisZero() {
        assertEquals(2.0, c.calcula(Map.of("a", 4.0, "b", 2.0, "c", 0.0)), DELTA);
    }
}
