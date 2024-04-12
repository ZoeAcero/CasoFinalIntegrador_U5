package Analisis_Genomico;

import javax.swing.*;
import java.awt.*;

public class ConteoGenes extends JFrame {

    private JTextField secuenciaADNField;
    private JButton contarGenesButton;
    private JLabel resultadoLabel;

    public ConteoGenesUI() {
        setTitle("Conteo de Genes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
