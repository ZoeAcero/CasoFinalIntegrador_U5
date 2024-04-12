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
            AnalisisGenomico analisis = new AnalisisGenomico(secuenciaADN);
            int cantidadGenes = analisis.contarGenes();
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


