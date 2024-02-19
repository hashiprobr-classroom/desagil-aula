package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaListaTest {
    private static final double DELTA = 0.000001;

    private MediaLista m;

    @BeforeEach
    void setUp() {
        m = new MediaLista();
    }

    @Test
    void vazia() {
        assertEquals(0.0, m.calcula(List.of()), DELTA);
    }

    @Test
    void zero() {
        assertEquals(0.0, m.calcula(List.of(0)), DELTA);
    }

    @Test
    void um() {
        assertEquals(1.0, m.calcula(List.of(1)), DELTA);
    }

    @Test
    void dois() {
        assertEquals(2.0, m.calcula(List.of(2)), DELTA);
    }

    @Test
    void tres() {
        assertEquals(3.0, m.calcula(List.of(3)), DELTA);
    }

    @Test
    void quatro() {
        assertEquals(4.0, m.calcula(List.of(4)), DELTA);
    }

    @Test
    void cinco() {
        assertEquals(5.0, m.calcula(List.of(5)), DELTA);
    }

    @Test
    void zeroZero() {
        assertEquals(0.0, m.calcula(List.of(0, 0)), DELTA);
    }

    @Test
    void zeroUm() {
        assertEquals(0.5, m.calcula(List.of(0, 1)), DELTA);
    }

    @Test
    void zeroDois() {
        assertEquals(1.0, m.calcula(List.of(0, 2)), DELTA);
    }

    @Test
    void zeroTres() {
        assertEquals(1.5, m.calcula(List.of(0, 3)), DELTA);
    }

    @Test
    void zeroQuatro() {
        assertEquals(2.0, m.calcula(List.of(0, 4)), DELTA);
    }

    @Test
    void zeroCinco() {
        assertEquals(2.5, m.calcula(List.of(0, 5)), DELTA);
    }

    @Test
    void umZero() {
        assertEquals(0.5, m.calcula(List.of(1, 0)), DELTA);
    }

    @Test
    void umUm() {
        assertEquals(1.0, m.calcula(List.of(1, 1)), DELTA);
    }

    @Test
    void umDois() {
        assertEquals(1.5, m.calcula(List.of(1, 2)), DELTA);
    }

    @Test
    void umTres() {
        assertEquals(2.0, m.calcula(List.of(1, 3)), DELTA);
    }

    @Test
    void umQuatro() {
        assertEquals(2.5, m.calcula(List.of(1, 4)), DELTA);
    }

    @Test
    void umCinco() {
        assertEquals(3.0, m.calcula(List.of(1, 5)), DELTA);
    }

    @Test
    void doisZero() {
        assertEquals(1.0, m.calcula(List.of(2, 0)), DELTA);
    }

    @Test
    void doisUm() {
        assertEquals(1.5, m.calcula(List.of(2, 1)), DELTA);
    }

    @Test
    void doisDois() {
        assertEquals(2.0, m.calcula(List.of(2, 2)), DELTA);
    }

    @Test
    void doisTres() {
        assertEquals(2.5, m.calcula(List.of(2, 3)), DELTA);
    }

    @Test
    void doisQuatro() {
        assertEquals(3.0, m.calcula(List.of(2, 4)), DELTA);
    }

    @Test
    void doisCinco() {
        assertEquals(3.5, m.calcula(List.of(2, 5)), DELTA);
    }

    @Test
    void tresZero() {
        assertEquals(1.5, m.calcula(List.of(3, 0)), DELTA);
    }

    @Test
    void tresUm() {
        assertEquals(2.0, m.calcula(List.of(3, 1)), DELTA);
    }

    @Test
    void tresDois() {
        assertEquals(2.5, m.calcula(List.of(3, 2)), DELTA);
    }

    @Test
    void tresTres() {
        assertEquals(3.0, m.calcula(List.of(3, 3)), DELTA);
    }

    @Test
    void tresQuatro() {
        assertEquals(3.5, m.calcula(List.of(3, 4)), DELTA);
    }

    @Test
    void tresCinco() {
        assertEquals(4.0, m.calcula(List.of(3, 5)), DELTA);
    }

    @Test
    void quatroZero() {
        assertEquals(2.0, m.calcula(List.of(4, 0)), DELTA);
    }

    @Test
    void quatroUm() {
        assertEquals(2.5, m.calcula(List.of(4, 1)), DELTA);
    }

    @Test
    void quatroDois() {
        assertEquals(3.0, m.calcula(List.of(4, 2)), DELTA);
    }

    @Test
    void quatroTres() {
        assertEquals(3.5, m.calcula(List.of(4, 3)), DELTA);
    }

    @Test
    void quatroQuatro() {
        assertEquals(4.0, m.calcula(List.of(4, 4)), DELTA);
    }

    @Test
    void quatroCinco() {
        assertEquals(4.5, m.calcula(List.of(4, 5)), DELTA);
    }

    @Test
    void cincoZero() {
        assertEquals(2.5, m.calcula(List.of(5, 0)), DELTA);
    }

    @Test
    void cincoUm() {
        assertEquals(3.0, m.calcula(List.of(5, 1)), DELTA);
    }

    @Test
    void cincoDois() {
        assertEquals(3.5, m.calcula(List.of(5, 2)), DELTA);
    }

    @Test
    void cincoTres() {
        assertEquals(4.0, m.calcula(List.of(5, 3)), DELTA);
    }

    @Test
    void cincoQuatro() {
        assertEquals(4.5, m.calcula(List.of(5, 4)), DELTA);
    }

    @Test
    void cincoCinco() {
        assertEquals(5.0, m.calcula(List.of(5, 5)), DELTA);
    }

    @Test
    void zeroUmDois() {
        assertEquals(1.0, m.calcula(List.of(0, 1, 2)), DELTA);
    }

    @Test
    void umDoisTres() {
        assertEquals(2.0, m.calcula(List.of(1, 2, 3)), DELTA);
    }

    @Test
    void doisTresQuatro() {
        assertEquals(3.0, m.calcula(List.of(2, 3, 4)), DELTA);
    }

    @Test
    void tresQuatroCinco() {
        assertEquals(4.0, m.calcula(List.of(3, 4, 5)), DELTA);
    }

    @Test
    void zeroUmTres() {
        assertEquals(1.333333, m.calcula(List.of(0, 1, 3)), DELTA);
    }

    @Test
    void umDoisQuatro() {
        assertEquals(2.333333, m.calcula(List.of(1, 2, 4)), DELTA);
    }

    @Test
    void doisTresCinco() {
        assertEquals(3.333333, m.calcula(List.of(2, 3, 5)), DELTA);
    }

    @Test
    void zeroDoisTres() {
        assertEquals(1.666666, m.calcula(List.of(0, 2, 3)), DELTA);
    }

    @Test
    void umTresQuatro() {
        assertEquals(2.666666, m.calcula(List.of(1, 3, 4)), DELTA);
    }

    @Test
    void doisQuatroCinco() {
        assertEquals(3.666666, m.calcula(List.of(2, 4, 5)), DELTA);
    }

    @Test
    void zeroDoisQuatro() {
        assertEquals(2.0, m.calcula(List.of(0, 2, 4)), DELTA);
    }

    @Test
    void umTresCinco() {
        assertEquals(3.0, m.calcula(List.of(1, 3, 5)), DELTA);
    }

    @Test
    void cincoQuatroTres() {
        assertEquals(4.0, m.calcula(List.of(5, 4, 3)), DELTA);
    }

    @Test
    void quatroTresDois() {
        assertEquals(3.0, m.calcula(List.of(4, 3, 2)), DELTA);
    }

    @Test
    void tresDoisUm() {
        assertEquals(2.0, m.calcula(List.of(3, 2, 1)), DELTA);
    }

    @Test
    void doisUmZero() {
        assertEquals(1.0, m.calcula(List.of(2, 1, 0)), DELTA);
    }

    @Test
    void cincoQuatroDois() {
        assertEquals(3.666666, m.calcula(List.of(5, 4, 2)), DELTA);
    }

    @Test
    void quatroTresUm() {
        assertEquals(2.666666, m.calcula(List.of(4, 3, 1)), DELTA);
    }

    @Test
    void tresDoisZero() {
        assertEquals(1.666666, m.calcula(List.of(3, 2, 0)), DELTA);
    }

    @Test
    void cincoTresUm() {
        assertEquals(3.0, m.calcula(List.of(5, 3, 1)), DELTA);
    }

    @Test
    void quatroDoisZero() {
        assertEquals(2.0, m.calcula(List.of(4, 2, 0)), DELTA);
    }
}
