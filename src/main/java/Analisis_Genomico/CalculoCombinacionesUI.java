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

