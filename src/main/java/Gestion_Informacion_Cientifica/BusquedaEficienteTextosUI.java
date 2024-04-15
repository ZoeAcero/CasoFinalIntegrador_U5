package Gestion_Informacion_Cientifica;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class BusquedaEficienteTextosUI extends JFrame{
    private JTextField palabraBuscarField;
    private JButton buscarButton;
    private JTextArea textoArea;

    public BusquedaEficienteTextosUI() {
        setTitle("Búsqueda Eficiente en Textos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
