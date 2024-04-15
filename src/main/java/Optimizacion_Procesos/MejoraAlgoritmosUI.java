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

        ordenarButton.addActionListener(e -> {
            String[] numerosStr = numerosArea.getText().split("\\s+");
            int[] numeros = new int[numerosStr.length];
            try {
                for (int i = 0; i < numerosStr.length; i++) {
                    numeros[i] = Integer.parseInt(numerosStr[i]);
                }
                Arrays.sort(numeros);
                StringBuilder sortedNumbers = new StringBuilder();
                for (int numero : numeros) {
                    sortedNumbers.append(numero).append(" ");
                }
}
