package br.edu.insper.desagil.desmat.visao;

import br.edu.insper.desagil.desmat.modelo.Calculadora;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.net.URL;

public class PainelCalculadora extends FixedPanel implements DocumentListener {
    private Calculadora calculadora;
    private JTextField campoPeso;
    private JTextField campoRaio;
    private JTextField campoDensidade;
    private Image imagem;

    public PainelCalculadora(Calculadora calculadora) {
        super(245, 346);

        JTextField campoPeso = new JTextField();
        JTextField campoRaio = new JTextField();
        JTextField campoDensidade = new JTextField();

        JLabel textoPeso = new JLabel("Peso:");
        JLabel textoRaio = new JLabel("Raio:");
        JLabel textoDensidade = new JLabel("Densidade:");

        String nome = calculadora.toString() + ".png";
        URL url = getClass().getClassLoader().getResource(nome);
        Image imagem = getToolkit().getImage(url);

        add(textoPeso, 10, 10, 75, 25);
        add(campoPeso, 85, 10, 150, 25);
        add(textoRaio, 10, 45, 75, 25);
        add(campoRaio, 85, 45, 150, 25);
        add(textoDensidade, 10, 311, 75, 25);
        add(campoDensidade, 85, 311, 150, 25);

        campoPeso.getDocument().addDocumentListener(this);
        campoRaio.getDocument().addDocumentListener(this);

        campoDensidade.setEnabled(false);

        this.calculadora = calculadora;
        this.campoPeso = campoPeso;
        this.campoRaio = campoRaio;
        this.campoDensidade = campoDensidade;
        this.imagem = imagem;

        atualiza();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagem, 10, 80, 221, 221, this);
        getToolkit().sync();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        atualiza();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        atualiza();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        atualiza();
    }

    private void atualiza() {
        double peso;
        double raio;

        try {
            peso = Double.parseDouble(campoPeso.getText());
            raio = Double.parseDouble(campoRaio.getText());
        } catch (NumberFormatException exception) {
            campoDensidade.setText("???");
            return;
        }

        double densidade = calculadora.densidade(peso, raio);
        densidade = Math.round(100 * densidade) / 100.0;

        campoDensidade.setText(Double.toString(densidade));
    }
}
