// NÃO É NECESSÁRIO ENTENDER OU MODIFICAR ESTE ARQUIVO

package br.edu.insper.desagil.aula4;

import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Panel panel = new Panel();

            JFrame frame = new JFrame("Aula 4");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.addKeyListener(panel);

            Container container = frame.getContentPane();
            container.add(panel);

            frame.pack();
            frame.setVisible(true);
        });
    }
}
