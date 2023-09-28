import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HolaMundo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear una instancia de JFrame (ventana)
            JFrame ventana = new JFrame("Hola Mundo");

            // Configurar el cierre de la ventana cuando se hace clic en la 'X'
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Crear un JLabel con el texto "Hola Mundo"
            JLabel etiqueta = new JLabel("Hola Mundo");

            // Agregar la etiqueta al contenido de la ventana
            ventana.add(etiqueta);

            // Establecer el tamaño de la ventana
            ventana.setSize(200, 100); // Tamaño personalizado (ancho x alto)

            // Hacer que la ventana sea visible
            ventana.setVisible(true);
        });
    }
}