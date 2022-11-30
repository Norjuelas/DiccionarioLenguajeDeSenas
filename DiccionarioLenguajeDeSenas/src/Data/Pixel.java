package Data;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;

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
         
         int count = 0;
         
         for(int i=0; i<height; i++) {
         
            for(int j=0; j<width; j++) {
            
               count++;
               Color c = new Color(image.getRGB(j, i));
               System.out.println("S.No: " + count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
            }
         }

      } catch (IOException e) {}
   }
   

}