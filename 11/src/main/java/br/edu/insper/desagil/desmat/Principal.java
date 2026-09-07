package br.edu.insper.desagil.desmat;

import br.edu.insper.desagil.desmat.modelo.Calculadora;
import br.edu.insper.desagil.desmat.modelo.CalculadoraCCC;
import br.edu.insper.desagil.desmat.modelo.CalculadoraCFC;
import br.edu.insper.desagil.desmat.visao.Visao;

import javax.swing.*;
import java.util.LinkedList;

public class Principal {
    void main() {
        LinkedList<Calculadora> modelo = new LinkedList<>();
        modelo.add(new CalculadoraCCC());
        modelo.add(new CalculadoraCFC());

        Visao visao = new Visao(modelo);

        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setContentPane(visao);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
