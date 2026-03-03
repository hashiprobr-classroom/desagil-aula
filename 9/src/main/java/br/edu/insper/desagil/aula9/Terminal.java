package br.edu.insper.desagil.aula9;

import javax.swing.*;

public class Terminal {
    void main() {
        javax.swing.SwingUtilities.invokeLater(() -> {
            View view = new View();

            JFrame window = new JFrame("Terminal");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setContentPane(view);
            window.setResizable(false);
            window.setVisible(true);
            window.pack();
        });
    }
}
