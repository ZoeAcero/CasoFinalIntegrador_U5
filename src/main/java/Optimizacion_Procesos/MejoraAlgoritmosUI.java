package Optimizacion_Procesos;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class MejoraAlgoritmosUI extends JFrame {
    private JButton ordenarButton;
    private JTextArea numerosArea;

    public MejoraAlgoritmosUI() {
        setTitle("Mejora de Algoritmos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ordenarButton = new JButton("Ordenar");
        numerosArea = new JTextArea();
}
