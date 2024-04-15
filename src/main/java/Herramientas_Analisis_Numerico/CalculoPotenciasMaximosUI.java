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
}
