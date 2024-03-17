package br.edu.insper.desagil.aula2;

public class Calculadora {
    public double executa(int a, int b, char op) {
        if (op == '+') {
            return a + b;
        }
        if (op == '-') {
            return a - b;
        }
        if (op == '*') {
            return a * b;
        }
        if (op == '/') {
            try {
                return a / b;
            } catch (ArithmeticException exception) {
                return 0;
            }
        }
        return 0;
    }
}
