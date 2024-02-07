package br.edu.insper.desagil.aula2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TabuadaTest {
    private Tabuada t;

    @BeforeEach
    void setUp() {
        t = new Tabuada();
    }

    @Test
    void constroiPara1() {
        assertEquals(String.join("\n",
                "1 ",
                ""), t.constroi(1));
    }

    @Test
    void constroiPara2() {
        assertEquals(String.join("\n",
                "1 2 ",
                "2 4 ",
                ""), t.constroi(2));
    }

    @Test
    void constroiPara3() {
        assertEquals(String.join("\n",
                "1 2 3 ",
                "2 4 6 ",
                "3 6 9 ",
                ""), t.constroi(3));
    }

    @Test
    void constroiPara4() {
        assertEquals(String.join("\n",
                "1 2 3 4 ",
                "2 4 6 8 ",
                "3 6 9 12 ",
                "4 8 12 16 ",
                ""), t.constroi(4));
    }

    @Test
    void constroiPara5() {
        assertEquals(String.join("\n",
                "1 2 3 4 5 ",
                "2 4 6 8 10 ",
                "3 6 9 12 15 ",
                "4 8 12 16 20 ",
                "5 10 15 20 25 ",
                ""), t.constroi(5));
    }
}
