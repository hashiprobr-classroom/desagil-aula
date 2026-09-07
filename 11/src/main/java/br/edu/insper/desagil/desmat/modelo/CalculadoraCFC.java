package br.edu.insper.desagil.desmat.modelo;

public class CalculadoraCFC extends Calculadora {
    public CalculadoraCFC() {
        super("CFC");
    }

    @Override
    public double densidade(double peso, double raio) {
        double m = 4 * peso;
        double v = 602.3 * Math.pow(2 * raio * Math.sqrt(2), 3);
        return m / v;
    }
}
