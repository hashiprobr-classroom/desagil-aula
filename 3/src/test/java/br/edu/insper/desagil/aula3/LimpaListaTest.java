package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LimpaListaTest {
    private LimpaLista l;

    @BeforeEach
    void setUp() {
        l = new LimpaLista();
    }

    @Test
    void vazio() {
        List<Character> letras = new ArrayList<>(List.of());
        l.filtra(letras, 'a');
        assertEquals(List.of(), letras);
    }

    @Test
    void naoRemoveDeUm() {
        List<Character> letras = new ArrayList<>(List.of('a'));
        l.filtra(letras, 'b');
        assertEquals(List.of('a'), letras);
    }

    @Test
    void removeUmDeUm() {
        List<Character> letras = new ArrayList<>(List.of('a'));
        l.filtra(letras, 'a');
        assertEquals(List.of(), letras);
    }

    @Test
    void naoRemoveDeDois() {
        List<Character> letras = new ArrayList<>(List.of('a', 'b'));
        l.filtra(letras, 'c');
        assertEquals(List.of('a', 'b'), letras);
    }

    @Test
    void removePrimeiroDeDois() {
        List<Character> letras = new ArrayList<>(List.of('a', 'b'));
        l.filtra(letras, 'a');
        assertEquals(List.of('b'), letras);
    }

    @Test
    void removeSegundoDeDois() {
        List<Character> letras = new ArrayList<>(List.of('a', 'b'));
        l.filtra(letras, 'b');
        assertEquals(List.of('a'), letras);
    }

    @Test
    void removeDoisDeDois() {
        List<Character> letras = new ArrayList<>(List.of('a', 'a'));
        l.filtra(letras, 'a');
        assertEquals(List.of(), letras);
    }

    @Test
    void naoRemoveDeTres() {
        List<Character> letras = new ArrayList<>(List.of('a', 'b', 'c'));
        l.filtra(letras, 'd');
        assertEquals(List.of('a', 'b', 'c'), letras);
    }

    @Test
    void removePrimeiroDeTres() {
        List<Character> letras = new ArrayList<>(List.of('a', 'b', 'c'));
        l.filtra(letras, 'a');
        assertEquals(List.of('b', 'c'), letras);
    }

    @Test
    void removeSegundoDeTres() {
        List<Character> letras = new ArrayList<>(List.of('a', 'b', 'c'));
        l.filtra(letras, 'b');
        assertEquals(List.of('a', 'c'), letras);
    }

    @Test
    void removeTerceiroDeTres() {
        List<Character> letras = new ArrayList<>(List.of('a', 'b', 'c'));
        l.filtra(letras, 'c');
        assertEquals(List.of('a', 'b'), letras);
    }

    @Test
    void removePrimeiroSegundoDeTres() {
        List<Character> letras = new ArrayList<>(List.of('a', 'a', 'b'));
        l.filtra(letras, 'a');
        assertEquals(List.of('b'), letras);
    }

    @Test
    void removePrimeiroTerceiroDeTres() {
        List<Character> letras = new ArrayList<>(List.of('a', 'b', 'a'));
        l.filtra(letras, 'a');
        assertEquals(List.of('b'), letras);
    }

    @Test
    void removeSegundoTerceiroDeTres() {
        List<Character> letras = new ArrayList<>(List.of('a', 'b', 'b'));
        l.filtra(letras, 'b');
        assertEquals(List.of('a'), letras);
    }

    @Test
    void removeTresDeTres() {
        List<Character> letras = new ArrayList<>(List.of('a', 'a', 'a'));
        l.filtra(letras, 'a');
        assertEquals(List.of(), letras);
    }
}
