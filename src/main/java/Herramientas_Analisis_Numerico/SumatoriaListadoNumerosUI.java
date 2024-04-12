package Herramientas_Analisis_Numerico;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SumatoriaListadoNumerosUI {
    private final JTextField rangoInicialField;
    private final JTextField rangoFinalField;
    private final JButton calcularButton;
    private final JTextArea resultadoArea;

    public SumatoriaListadoNumerosUI() {
        setTitle("Sumatoria y Listado de Números");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rangoInicialField = new JTextField(5);
        rangoFinalField = new JTextField(5);
        calcularButton = new JButton("Calcular");
        resultadoArea = new JTextArea(10, 20);
        resultadoArea.setEditable(false);
}
