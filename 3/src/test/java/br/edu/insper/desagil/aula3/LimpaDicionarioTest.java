package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LimpaDicionarioTest {
    private LimpaDicionario l;

    @BeforeEach
    void setUp() {
        l = new LimpaDicionario();
    }

    @Test
    void vazio() {
        Map<Integer, Character> presente = new HashMap<>(Map.of());
        l.filtra(presente, 'a');
        assertEquals(Map.of(), presente);
    }

    @Test
    void naoRemoveDeUm() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a'));
        l.filtra(presente, 'b');
        assertEquals(Map.of(1, 'a'), presente);
    }

    @Test
    void removeUmDeUm() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a'));
        l.filtra(presente, 'a');
        assertEquals(Map.of(), presente);
    }

    @Test
    void naoRemoveDeDois() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'b'));
        l.filtra(presente, 'c');
        assertEquals(Map.of(1, 'a', 2, 'b'), presente);
    }

    @Test
    void removePrimeiroDeDois() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'b'));
        l.filtra(presente, 'a');
        assertEquals(Map.of(2, 'b'), presente);
    }

    @Test
    void removeSegundoDeDois() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'b'));
        l.filtra(presente, 'b');
        assertEquals(Map.of(1, 'a'), presente);
    }

    @Test
    void removeDoisDeDois() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'a'));
        l.filtra(presente, 'a');
        assertEquals(Map.of(), presente);
    }

    @Test
    void naoRemoveDeTres() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'c'));
        l.filtra(presente, 'd');
        assertEquals(Map.of(1, 'a', 2, 'b', 3, 'c'), presente);
    }

    @Test
    void removePrimeiroDeTres() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'c'));
        l.filtra(presente, 'a');
        assertEquals(Map.of(2, 'b', 3, 'c'), presente);
    }

    @Test
    void removeSegundoDeTres() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'c'));
        l.filtra(presente, 'b');
        assertEquals(Map.of(1, 'a', 3, 'c'), presente);
    }

    @Test
    void removeTerceiroDeTres() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'c'));
        l.filtra(presente, 'c');
        assertEquals(Map.of(1, 'a', 2, 'b'), presente);
    }

    @Test
    void removePrimeiroSegundoDeTres() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'a', 3, 'b'));
        l.filtra(presente, 'a');
        assertEquals(Map.of(3, 'b'), presente);
    }

    @Test
    void removePrimeiroTerceiroDeTres() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'a'));
        l.filtra(presente, 'a');
        assertEquals(Map.of(2, 'b'), presente);
    }

    @Test
    void removeSegundoTerceiroDeTres() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'b', 3, 'b'));
        l.filtra(presente, 'b');
        assertEquals(Map.of(1, 'a'), presente);
    }

    @Test
    void removeTresDeTres() {
        Map<Integer, Character> presente = new HashMap<>(Map.of(1, 'a', 2, 'a', 3, 'a'));
        l.filtra(presente, 'a');
        assertEquals(Map.of(), presente);
    }
}
