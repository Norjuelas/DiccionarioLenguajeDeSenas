
package Data;

import javax.swing.ImageIcon;

/**
 *
 * @author Nicolas Orjuela
 */


/**esta sera la clase abstracta con nivel superior 
* de herenciacon respecto a letras, numeros y signos especiales
* que seran otras clases hijas de esta clase.
* 
* La idea es que cree esas clases e instancie el abecedario, mientras
* yo hago lo mismo con las palabras basicas.
* 
* el siguiente paso sera construir la intergas grafica que permita imprimir 
* el atributo imagen de cada palabra cuando esta sea solicitada al programa
*/
public class Caracteres {
    
    private String nombreCaracter;
    
    private ImageIcon imagen;

    public String getNombreCaracter() {
        return nombreCaracter;
    }

    public void setNombreCaracter(String nombreCaracter) {
        this.nombreCaracter = nombreCaracter;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public Caracteres(String nombreCaracter, ImageIcon imagen) {
        this.nombreCaracter = nombreCaracter;
        this.imagen = imagen;
    }
    
}
