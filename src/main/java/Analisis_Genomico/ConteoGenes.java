package Analisis_Genomico;

import javax.swing.*;
import java.awt.*;

public class ConteoGenes extends JFrame {

    private JTextField secuenciaADNField;
    private JButton contarGenesButton;
    private JLabel resultadoLabel;

    public ConteoGenes() {
        setTitle("Conteo de Genes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        secuenciaADNField = new JTextField(20);
        contarGenesButton = new JButton("Contar Genes");
        resultadoLabel = new JLabel();

        contarGenesButton.addActionListener(e -> {
            String secuenciaADN = secuenciaADNField.getText();
            int cantidadGenes = contarGenes(secuenciaADN);
            resultadoLabel.setText("Cantidad de genes: " + cantidadGenes);
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(new JLabel("Secuencia de ADN:"));
        panel.add(secuenciaADNField);
        panel.add(contarGenesButton);

        JPanel resultadoPanel = new JPanel();
        resultadoPanel.add(resultadoLabel);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(resultadoPanel, BorderLayout.SOUTH);
        pack();
    }

    private int contarGenes(String secuenciaADN) {
        return contarGenesRecursivo(secuenciaADN);
    }

    private int contarGenesRecursivo(String subsecuenciaADN) {
        int count = 0;
        int startCodonIndex = subsecuenciaADN.indexOf("ATG");
        if (startCodonIndex != -1) {
            count++;
            String nextSubsequence = subsecuenciaADN.substring(startCodonIndex + 3); // Skip the start codon
            count += contarGenesRecursivo(nextSubsequence);
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(() -> {
                ConteoGenes ui = new ConteoGenes();
                ui.setVisible(true);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


