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

    }

