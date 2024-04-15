package Gestion_Informacion_Cientifica;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class OrganizacionDocumentosUI extends JFrame{
        private JButton cargarArchivoButton;
        private JButton ordenarButton;
        private JTextArea documentoArea;

        public OrganizacionDocumentosUI() {
            setTitle("Organización de Documentos");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            cargarArchivoButton = new JButton("Cargar Archivo");
            ordenarButton = new JButton("Ordenar");
            documentoArea = new JTextArea();

            cargarArchivoButton.addActionListener(e -> {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    Scanner scanner = null;
                    try {
                        File selectedFile = fileChooser.getSelectedFile();
                        scanner = new Scanner(selectedFile);
                        StringBuilder text = new StringBuilder();
                        while (scanner.hasNextLine()) {
                            text.append(scanner.nextLine()).append("\n");
                        }
                        documentoArea.setText(text.toString());
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(this, "File not found", "Error", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        if (scanner != null) {
                            scanner.close();
                        }
                    }
                }
            });

            ordenarButton.addActionListener(e -> {
                String[] lines = documentoArea.getText().split("\n");
                List<String> lineList = Arrays.asList(lines);
                Collections.sort(lineList);
                StringBuilder sortedText = new StringBuilder();
                for (String line : lineList) {
                    sortedText.append(line).append("\n");
                }
                documentoArea.setText(sortedText.toString());
            });

        }
