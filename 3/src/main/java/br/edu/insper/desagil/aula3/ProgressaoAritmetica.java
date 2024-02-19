package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class ProgressaoAritmetica {
    public List<Integer> gera(int a0, int r, int n) {
        List<Integer> pa = new ArrayList<>();
        int a = a0;
        for (int i = 0; i < n; i++) {
            pa.add(i);
            a += r;
        }
        return pa;
    }
}
