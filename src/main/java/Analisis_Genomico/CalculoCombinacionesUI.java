package Analisis_Genomico;

import javax.swing.*;
import java.awt.*;

public class CalculoCombinacionesUI extends JFrame {
    private JTextField modeloGeneticoField;
    private JButton calcularCombinacionesButton;
    private JLabel resultadoLabel;

    public CalculoCombinacionesUI() {
        setTitle("Cálculo de Combinaciones Genéticas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        modeloGeneticoField = new JTextField(20);
        calcularCombinacionesButton = new JButton("Calcular Combinaciones");
        resultadoLabel = new JLabel();

        calcularCombinacionesButton.addActionListener(e -> {
            String modeloGenetico = modeloGeneticoField.getText();
            CalculoCombinaciones calculoCombinaciones = new CalculoCombinaciones(modeloGenetico);
            // Lógica para calcular combinaciones genéticas
            resultadoLabel.setText("Combinaciones calculadas.");
        });


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(new JLabel("Modelo Genético:"));
        panel.add(modeloGeneticoField);
        panel.add(calcularCombinacionesButton);

