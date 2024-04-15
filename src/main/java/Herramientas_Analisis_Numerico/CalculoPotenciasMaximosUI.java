package Herramientas_Analisis_Numerico;

import javax.swing.*;
import java.awt.*;
public class CalculoPotenciasMaximosUI extends JFrame{
    private JTextField baseField;
    private JTextField exponenteField;
    private JButton calcularButton;
    private JTextArea resultadoArea;

    public CalculoPotenciasMaximosUI() {
        setTitle("Cálculo de Potencias y Máximos");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        baseField = new JTextField(5);
        exponenteField = new JTextField(5);
        calcularButton = new JButton("Calcular");
        resultadoArea = new JTextArea(10, 20);
        resultadoArea.setEditable(false);


        calcularButton.addActionListener(e -> {
            try {
                int base = Integer.parseInt(baseField.getText());
                int exponente = Integer.parseInt(exponenteField.getText());
                CalculoPotenciasMaximos calculoPotenciasMaximos = new CalculoPotenciasMaximos();
                int potencia = calculoPotenciasMaximos.calcularPotencia(base, exponente);
                int maximo = calculoPotenciasMaximos.encontrarMaximo(base, exponente);
                resultadoArea.setText("Potencia: " + potencia + "\n");
                resultadoArea.append("Máximo: " + maximo);
            } catch (NumberFormatException ex) {
                resultadoArea.setText("Please enter valid integer values.");
            }
        });


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JLabel("Base:"));
        panel.add(baseField);
        panel.add(new JLabel("Exponente:"));
        panel.add(exponenteField);
        panel.add(new JLabel(""));
        panel.add(calcularButton);

        JScrollPane scrollPane = new JScrollPane(resultadoArea);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}
