package br.edu.insper.desagil.aula3;

import java.util.List;

public class MediaLista {
    public double calcula(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }
        double s = 0;
        for (int n : numeros) {
            s += n / numeros.size();
        }
        return s;
    }
}
