package br.edu.insper.desagil.desmat.modelo;

public abstract class Calculadora {
    private String nome;

    public Calculadora(String name) {
        this.nome = name;
    }

    @Override
    public String toString() {
        return nome;
    }

    public abstract double densidade(double peso, double raio);
}
