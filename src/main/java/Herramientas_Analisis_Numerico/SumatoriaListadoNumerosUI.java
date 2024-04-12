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

        calcularButton.addActionListener(e -> {
            int rangoInicial = Integer.parseInt(rangoInicialField.getText());
            int rangoFinal = Integer.parseInt(rangoFinalField.getText());
            SumatoriaListadoNumeros sumatoriaListadoNumeros = new SumatoriaListadoNumeros();
            List<Integer> listaNumeros = sumatoriaListadoNumeros.listarNumerosEnRango(rangoInicial, rangoFinal);
            int sumatoria = sumatoriaListadoNumeros.calcularSumatoria(listaNumeros);
            resultadoArea.setText("Números en el rango: " + listaNumeros.toString() + "\n");
            resultadoArea.append("Sumatoria: " + sumatoria);
        });


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JLabel("Rango Inicial:"));
        panel.add(rangoInicialField);
        panel.add(new JLabel("Rango Final:"));
        panel.add(rangoFinalField);
        panel.add(new JLabel(""));
        panel.add(calcularButton);

        JScrollPane scrollPane = new JScrollPane(resultadoArea);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SumatoriaListadoNumerosUI ui = new SumatoriaListadoNumerosUI();
            ui.setVisible(true);
        });
    }
}

