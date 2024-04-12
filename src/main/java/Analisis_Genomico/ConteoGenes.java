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

    }
