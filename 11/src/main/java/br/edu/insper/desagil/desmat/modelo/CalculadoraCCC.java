package br.edu.insper.desagil.desmat.modelo;

public class CalculadoraCCC extends Calculadora {
    public CalculadoraCCC() {
        super("CCC");
    }

    @Override
    public double densidade(double peso, double raio) {
        double m = 2 * peso;
        double v = 602.3 * Math.pow(4 * raio / Math.sqrt(3), 3);
        return m / v;
    }
}
