import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class interfaz {

    public static class FondoPanel extends JPanel {
        private BufferedImage fondo;

        public FondoPanel() {
            try {
                fondo = ImageIO.read(new File("metalpipe.jpg")); // Carga la imagen desde un archivo
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (fondo != null) {
                g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear una instancia de JFrame (ventana)
            JFrame ventana = new JFrame("Interfaz");

            // Configurar el cierre de la ventana cuando se hace clic en la 'X'
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Agregar un JPanel personalizado con fondo PNG
            FondoPanel fondoPanel = new FondoPanel();
            ventana.setContentPane(fondoPanel);

            // Crear un botón
            JButton boton = new JButton("PLONCK");

            // Agregar un ActionListener al botón
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Mostrar un mensaje emergente cuando se hace clic en el botón
                    JOptionPane.showMessageDialog(ventana, "PLONCK");
                }
            });

            // Agregar el botón al panel
            fondoPanel.add(boton);

            // Establecer el tamaño de la ventana
            ventana.setSize(800, 600);

            // Hacer que la ventana sea visible
            ventana.setVisible(true);
        });
    }
}
