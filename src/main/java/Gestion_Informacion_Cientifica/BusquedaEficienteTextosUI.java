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


        palabraBuscarField = new JTextField(20);
        buscarButton = new JButton("Buscar");
        textoArea = new JTextArea();

        buscarButton.addActionListener(e -> {
            String palabraBuscar = palabraBuscarField.getText();
            String texto = textoArea.getText();
            List<Integer> indices = buscarPalabra(texto, palabraBuscar);
            StringBuilder resultado = new StringBuilder("La palabra '" + palabraBuscar + "' se encuentra en las posiciones: ");
            for (int indice : indices) {
                resultado.append(indice).append(", ");
            }

    }
