package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AudioTest {
    private Audio s;

    @BeforeEach
    void setUp() {
        s = new Audio();
    }

    @Test
    void menosUmDoisMenosTresComUm() {
        List<Integer> onda = new ArrayList<>(List.of(-1, 2, -3));
        s.clip(onda, 1);
        assertEquals(List.of(-1, 1, -1), onda);
    }

    @Test
    void tresMenosDoisUmComUm() {
        List<Integer> onda = new ArrayList<>(List.of(3, -2, 1));
        s.clip(onda, 1);
        assertEquals(List.of(1, -1, 1), onda);
    }

    @Test
    void menosUmDoisMenosTresComZero() {
        List<Integer> onda = new ArrayList<>(List.of(-1, 2, -3));
        s.clip(onda, 0);
        assertEquals(List.of(0, 0, 0), onda);
    }

    @Test
    void tresMenosDoisUmComZero() {
        List<Integer> onda = new ArrayList<>(List.of(3, -2, 1));
        s.clip(onda, 0);
        assertEquals(List.of(0, 0, 0), onda);
    }

    @Test
    void menosUmDoisMenosTresComDois() {
        List<Integer> onda = new ArrayList<>(List.of(-1, 2, -3));
        s.clip(onda, 2);
        assertEquals(List.of(-1, 2, -2), onda);
    }

    @Test
    void tresMenosDoisUmComDois() {
        List<Integer> onda = new ArrayList<>(List.of(3, -2, 1));
        s.clip(onda, 2);
        assertEquals(List.of(2, -2, 1), onda);
    }
}
