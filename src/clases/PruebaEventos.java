package clases;

import java.awt.Color;
import javax.swing.*;

import java.awt.event.*;
import java.util.Random;

public class PruebaEventos {

    public static void main(String[] args) {
        MarcoBotones mimarco = new MarcoBotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoBotones extends JFrame {

    public MarcoBotones() {
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotones milamina = new LaminaBotones();
        add(milamina);
    }
}

class LaminaBotones extends JPanel implements ActionListener {

    JButton botonColores = new JButton("Colores");

    public LaminaBotones() {
        add(botonColores);
        botonColores.addActionListener(this);
    }

    public int generarAle() {
        Random ran = new Random();
        int x = ran.nextInt(255);
        return x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(new Color(generarAle(), generarAle(), generarAle()));
    }
}
