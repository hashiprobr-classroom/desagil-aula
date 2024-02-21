package br.edu.insper.desagil.aula4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;

public class Panel extends JPanel implements KeyListener {
    private static final int CELL_SIZE = 50;
    private static final int WIDTH = 7;
    private static final int HEIGHT = 5;

    private final int width;
    private final int height;
    private final Image background;
    private final Image sprite;
    //private final Ship ship;

    public Panel() {
        int width = WIDTH * CELL_SIZE;
        int height = HEIGHT * CELL_SIZE;

        Dimension dimension = new Dimension(width, height);
        setPreferredSize(dimension);

        this.width = width;
        this.height = height;
        this.background = readImage("/background.png");
        this.sprite = readImage("/sprite.png");
        //this.ship = new Ship(3, 2);
    }

    private Image readImage(String path) {
        Image image;
        try {
            Class<?> type = getClass();
            InputStream stream = type.getResourceAsStream(path);
            if (stream == null) {
                throw new FileNotFoundException(path);
            }
            image = ImageIO.read(stream);
        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }
        return image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, width, height, null);

        //int x = ship.getX() * CELL_SIZE;
        //int y = ship.getY() * CELL_SIZE;
        //g.drawImage(sprite, x, y, CELL_SIZE, CELL_SIZE, null);
    }

    @Override
    public void keyPressed(KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                //ship.move(-1, 0);
                break;
            case KeyEvent.VK_RIGHT:
                //ship.move(1, 0);
                break;
            case KeyEvent.VK_UP:
                //ship.move(0, -1);
                break;
            case KeyEvent.VK_DOWN:
                //ship.move(0, 1);
                break;
            default:
                System.err.println("Key not supported");
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent event) {
    }

    @Override
    public void keyTyped(KeyEvent event) {
    }
}
