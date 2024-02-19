package br.edu.insper.desagil.aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FichasTest {
    private Fichas f;

    @BeforeEach
    void setUp() {
        f = new Fichas();
    }

    @Test
    void enunciado() {
        List<Map<String, String>> originais = List.of(
                Map.of("login", "mariads", "nome", "Maria", "sobrenome", "da Silva"),
                Map.of("login", "joaods", "nome", "João", "sobrenome", "de Souza", "curso", "Engenharia de Computação"),
                Map.of("login", "marianads", "nome", "Maria", "sobrenome", "de Souza", "curso", "Ciência da Computação"),
                Map.of("login", "joseds", "nome", "José", "sobrenome", "da Silva"));
        assertEquals(List.of(
                Map.of("email", "mariads@insper.edu.br", "nome", "Maria da Silva"),
                Map.of("email", "joaods@al.insper.edu.br", "nome", "João de Souza"),
                Map.of("email", "marianads@al.insper.edu.br", "nome", "Maria de Souza"),
                Map.of("email", "joseds@insper.edu.br", "nome", "José da Silva")), f.reformata(originais));
    }
}
