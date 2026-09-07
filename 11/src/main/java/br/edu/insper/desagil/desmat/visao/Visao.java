package br.edu.insper.desagil.desmat.visao;

import br.edu.insper.desagil.desmat.modelo.Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Visao extends JPanel implements ActionListener {
    private final JComboBox<Calculadora> menu;
    private PainelCalculadora painelCalculadora;

    public Visao(LinkedList<Calculadora> model) {
        menu = new JComboBox<>();
        for (Calculadora calculator : model) {
            menu.addItem(calculator);
        }

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(menu);
        addCalculatorView(0);

        menu.addActionListener(this);
    }

    private void addCalculatorView(int index) {
        Calculadora calculator = menu.getItemAt(index);
        painelCalculadora = new PainelCalculadora(calculator);
        add(painelCalculadora);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        remove(painelCalculadora);
        int index = menu.getSelectedIndex();
        addCalculatorView(index);
        ((JFrame) SwingUtilities.getRoot(this)).pack();
    }
}
