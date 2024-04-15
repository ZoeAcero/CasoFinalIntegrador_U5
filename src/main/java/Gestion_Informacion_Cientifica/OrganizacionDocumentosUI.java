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

        }
