import javax.swing.*;
import Analisis_Genomico.*;
import Gestion_Informacion_Cientifica.*;
import Herramientas_Analisis_Numerico.*;
import Optimizacion_Procesos.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {

        // Personalización de colores para decorar :)
        Color colorMarcoPrincipal = new Color(110, 180, 250, 98); // Azul raro
        getContentPane().setBackground(colorMarcoPrincipal); // Establece el color de fondo del marco principal

        // Configurar el marco principal
        setTitle("Sistema Interactivo de Análisis Genómico y Organización de Datos (A.G.O.D.)");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear un panel para agregar componentes
        JPanel panel = new DecoPanel();
        panel.setLayout(new GridBagLayout()); // Usar GridBagLayout
        panel.setBackground(new Color(255, 255, 255, 200)); // Blanco semi-transparente
        panel.setOpaque(false); // Hacer que panelPrincipal sea
        panel.setPreferredSize(new Dimension(getWidth(), getHeight())); // Establecer el tamaño del panel igual al del marco principal
        add(panel);

        // Configurar restricciones para el diseño de cuadrícula
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 1.0; // Dar a todos los componentes el mismo espacio horizontal
        gbc.insets = new Insets(5, 5, 5, 5); // Margen entre componentes
        gbc.anchor = GridBagConstraints.CENTER; // Centrar los componentes en su celda

        // Crear un panel para los títulos y subtítulos
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setOpaque(false); // Hacer que el panel sea transparente

        // Título Principal "A.G.O.D."
        JLabel tituloPrincipal = new JLabel("<html><font color='grey'>A.</font><font color='grey'>G.</font><font color='blue'>O.</font><font color='grey'>D.</font></html>");
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.BOLD, 142));
        tituloPrincipal.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el título
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy = 0;
        panel.add(tituloPrincipal, gbc);

        // Subtítulos "Análisis Genómico" y "Organización de Datos"
        JLabel subtitulo1 = new JLabel("<html><b><font color='#252e3c'>Análisis Genómico & Organización de Datos</font></b></html>");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.ITALIC, 24));
        gbc.anchor = GridBagConstraints.CENTER;
        subtitulo1.setForeground(Color.BLACK);
        gbc.gridy = 2;
        panel.add(subtitulo1, gbc);

        JLabel subtitulo2 = new JLabel("<html><font color='#122D6B'>Universidad Alfonso </font><font color='blue'>X</font><font color='#122D6B'> el Sabio (</font><font color='blue'>UAX</font><font color='#122D6B'>)</font></html>");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.BOLD, 24));
        gbc.anchor = GridBagConstraints.CENTER;
        subtitulo2.setForeground(Color.BLUE);
        gbc.gridy = 3;
        panel.add(subtitulo2, gbc);

        // Agregar el panel de títulos al panel principal
        gbc.gridx = 1; // Posición horizontal para el panel de títulos
        gbc.gridy = 0; // Posición vertical para el panel de títulos
        gbc.gridheight = 3; // Hacer que el panel de títulos ocupe 3 celdas en la dirección vertical
        panel.add(titlePanel, gbc);

        // Agregar un panel vacío a cada lado de los botones para empujarlos hacia el centro
        JPanel emptyPanel1 = new JPanel();
        emptyPanel1.setOpaque(false); // Hacer que el panel sea transparente
        gbc.gridx = 0; // Posición horizontal para el primer panel vacío
        gbc.gridy = 4; // Posición vertical para el primer panel vacío
        gbc.gridheight = 4; // Hacer que el panel vacío ocupe 4 celdas en la dirección vertical
        panel.add(emptyPanel1, gbc);

        JPanel emptyPanel2 = new JPanel();
        emptyPanel2.setOpaque(false); // Hacer que el panel sea transparente
        gbc.gridx = 2; // Posición horizontal para el segundo panel vacío
        panel.add(emptyPanel2, gbc);

        // Tamaño para los botones
        Dimension buttonSize = new Dimension(290, 35); // Puedes ajustar estos valores a tu gusto

        // Botones del panel para interactuar con las clases
        JButton button1 = new JButton("Gestión de Fechas 📆");
        button1.setPreferredSize(buttonSize);
        button1.setMinimumSize(buttonSize);
        button1.setMaximumSize(buttonSize);

        JButton button2 = new JButton("Búsqueda Eficiente en Textos \uD83D\uDD0D");
        button2.setPreferredSize(buttonSize);
        button2.setMinimumSize(buttonSize);
        button2.setMaximumSize(buttonSize);

        JButton button3 = new JButton("Organización de Documentos \uD83D\uDCC4\u200B");
        button3.setPreferredSize(buttonSize);
        button3.setMinimumSize(buttonSize);
        button3.setMaximumSize(buttonSize);

        JButton button4 = new JButton("Conteo de Genes 🔬");
        button4.setPreferredSize(buttonSize);
        button4.setMinimumSize(buttonSize);
        button4.setMaximumSize(buttonSize);

        JButton button5 = new JButton("Cálculo de Combinaciones Genéticas 🔬🔀");
        button5.setPreferredSize(buttonSize);
        button5.setMinimumSize(buttonSize);
        button5.setMaximumSize(buttonSize);

        JButton button6 = new JButton("Mejora de Algoritmos \u200B⬆\uFE0F\u200B \uD83D\uDCBB\u200B");
        button6.setPreferredSize(buttonSize);
        button6.setMinimumSize(buttonSize);
        button6.setMaximumSize(buttonSize);

        JButton button7 = new JButton("Cálculo de Potencias y Máximos \uD83D\uDCAA\uD83C\uDFFC\u200B");
        button7.setPreferredSize(buttonSize);
        button7.setMinimumSize(buttonSize);
        button7.setMaximumSize(buttonSize);

        JButton button8 = new JButton("Sumatoria y Listado de Números \uD83D\uDCC3\u200B➕");
        button8.setPreferredSize(buttonSize);
        button8.setMinimumSize(buttonSize);
        button8.setMaximumSize(buttonSize);

        // Agregar botones al panel con las restricciones adecuadas
        gbc.gridx = (int) -0.5; // Posición horizontal para los primeros 4 botones
        gbc.gridheight = 1; // Hacer que los botones ocupen 1 celda en la dirección vertical
        gbc.gridy = 4; // Posición vertical para el botón 1
        panel.add(button1, gbc);
        gbc.gridy = 5; // Posición vertical para el botón 2
        panel.add(button2, gbc);
        gbc.gridy = 6; // Posición vertical para el botón 3
        panel.add(button3, gbc);
        gbc.gridy = 7; // Posición vertical para el botón 4
        panel.add(button4, gbc);

        gbc.gridx = 1; // Posición horizontal para los últimos 4 botones
        gbc.gridheight = 1; // Hacer que los botones ocupen 1 celda en la dirección vertical
        gbc.gridy = 4; // Posición vertical para el botón 5
        panel.add(button5, gbc);
        gbc.gridy = 5; // Posición vertical para el botón 6
        panel.add(button6, gbc);
        gbc.gridy = 6; // Posición vertical para el botón 7
        panel.add(button7, gbc);
        gbc.gridy = 7; // Posición vertical para el botón 8
        panel.add(button8, gbc);

        // Manejar eventos de los botones

        button2.addActionListener(new ActionListener() { // Búsqueda Eficiente en Textos
            @Override
            public void actionPerformed(ActionEvent e) {
                BusquedaEficienteTextosUI ventana = new BusquedaEficienteTextosUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button3.addActionListener(new ActionListener() { // Organización de Documentos
            @Override
            public void actionPerformed(ActionEvent e) {
                OrganizacionDocumentosUI ventana = new OrganizacionDocumentosUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button4.addActionListener(new ActionListener() { // Conteo de Genes
            @Override
            public void actionPerformed(ActionEvent e) {
                ConteoGenesUI ventana = new ConteoGenesUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button5.addActionListener(new ActionListener() { // Cálculo de Combinaciones Genéticas
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculoCombinacionesUI ventana = new CalculoCombinacionesUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button6.addActionListener(new ActionListener() { // Mejora de Algoritmos
            @Override
            public void actionPerformed(ActionEvent e) {
                MejoraAlgoritmosUI ventana = new MejoraAlgoritmosUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button7.addActionListener(new ActionListener() { // Cálculo de Potencias y Máximos
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculoPotenciasMaximosUI ventana = new CalculoPotenciasMaximosUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button8.addActionListener(new ActionListener() { // suma y listado de números
            @Override
            public void actionPerformed(ActionEvent e) {
                SumatoriaListadoNumerosUI ventana = new SumatoriaListadoNumerosUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        // Centrar el marco en la pantalla
        setLocationRelativeTo(null);
    }

    // Método main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

}




