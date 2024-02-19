package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoesTest {
    private static final double DELTA = 0.000001;

    private Medicoes m;

    @BeforeEach
    void setUp() {
        m = new Medicoes();
    }

    @Test
    void umUmUm() {
        Map<Integer, Double> medicoes = new HashMap<>(Map.of(1, 1.0, 2, 1.0, 3, 1.0));
        m.normaliza(medicoes);
        assertMapEquals(Map.of(1, 0.333333, 2, 0.333333, 3, 0.333333), medicoes);
    }

    @Test
    void umUmDois() {
        Map<Integer, Double> medicoes = new HashMap<>(Map.of(1, 1.0, 2, 1.0, 3, 2.0));
        m.normaliza(medicoes);
        assertMapEquals(Map.of(1, 0.25, 2, 0.25, 3, 0.5), medicoes);
    }

    @Test
    void umUmTres() {
        Map<Integer, Double> medicoes = new HashMap<>(Map.of(1, 1.0, 2, 1.0, 3, 3.0));
        m.normaliza(medicoes);
        assertMapEquals(Map.of(1, 0.2, 2, 0.2, 3, 0.6), medicoes);
    }

    @Test
    void umDoisDois() {
        Map<Integer, Double> medicoes = new HashMap<>(Map.of(1, 1.0, 2, 2.0, 3, 2.0));
        m.normaliza(medicoes);
        assertMapEquals(Map.of(1, 0.2, 2, 0.4, 3, 0.4), medicoes);
    }

    @Test
    void umDoisTres() {
        Map<Integer, Double> medicoes = new HashMap<>(Map.of(1, 1.0, 2, 2.0, 3, 3.0));
        m.normaliza(medicoes);
        assertMapEquals(Map.of(1, 0.166666, 2, 0.333333, 3, 0.5), medicoes);
    }

    @Test
    void doisDoisDois() {
        Map<Integer, Double> medicoes = new HashMap<>(Map.of(1, 2.0, 2, 2.0, 3, 2.0));
        m.normaliza(medicoes);
        assertMapEquals(Map.of(1, 0.333333, 2, 0.333333, 3, 0.333333), medicoes);
    }

    @Test
    void doisDoisTres() {
        Map<Integer, Double> medicoes = new HashMap<>(Map.of(1, 2.0, 2, 2.0, 3, 3.0));
        m.normaliza(medicoes);
        assertMapEquals(Map.of(1, 0.285714, 2, 0.285714, 3, 0.428571), medicoes);
    }

    @Test
    void doisTresTres() {
        Map<Integer, Double> medicoes = new HashMap<>(Map.of(1, 2.0, 2, 3.0, 3, 3.0));
        m.normaliza(medicoes);
        assertMapEquals(Map.of(1, 0.25, 2, 0.375, 3, 0.375), medicoes);
    }

    @Test
    void tresTresTres() {
        Map<Integer, Double> medicoes = new HashMap<>(Map.of(1, 3.0, 2, 3.0, 3, 3.0));
        m.normaliza(medicoes);
        assertMapEquals(Map.of(1, 0.333333, 2, 0.333333, 3, 0.333333), medicoes);
    }

    private void assertMapEquals(Map<Integer, Double> expected, Map<Integer, Double> actual) {
        assertEquals(expected.size(), actual.size());
        for (int key : expected.keySet()) {
            assertEquals(expected.get(key), actual.get(key), DELTA);
        }
    }
}
