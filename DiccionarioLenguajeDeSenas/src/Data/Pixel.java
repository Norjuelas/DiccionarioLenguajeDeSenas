package Data;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nicolas Orjuela
 */
/**
 * esta sera la clase abstracta con nivel superior de herenciacon respecto a
 * letras, numeros y signos especiales que seran otras clases hijas de esta
 * clase.
 *
 * La idea es que cree esas clases e instancie el abecedario, mientras yo hago
 * lo mismo con las palabras basicas.
 *
 * el siguiente paso sera construir la intergas grafica que permita imprimir el
 * atributo imagen de cada palabra cuando esta sea solicitada al programa
 */
public class Pixel {

    BufferedImage image;
    int width;
    int height;

    public Pixel() {

        try {
            File input = new File("A.PNG");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            JLabel picLabel = new JLabel(new ImageIcon(image));
            JPanel jPanel = new JPanel();
            jPanel.add(picLabel);
            JFrame f = new JFrame();
            f.setSize(new Dimension(image.getWidth(), image.getHeight()));
            f.add(jPanel);
            f.setVisible(true);
        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
    }
}
