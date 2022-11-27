/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Jeison Diaz
 */
public class Letras extends Caracteres {

    public Letras(String nombreCaracter, ImageIcon imagen) {
        super(nombreCaracter, imagen);
    }

    Letras a = new Letras("A", ImageIO.read(new File("C:\\Users\\Jeison Diaz\\OneDrive\\Documentos\\NetBeansProjects\\DiccionarioLenguajeDeSenas\\DiccionarioLenguajeDeSenas\\LetrasAbecedario//A.PNG"));

}
