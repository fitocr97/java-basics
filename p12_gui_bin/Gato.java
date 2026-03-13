
package p12_gui_bin;

/**
 *
 * @author Rodolfo
 */
public class Gato extends Animal{
    
    private int vidas;

    public Gato() {
    }

    public Gato(String id, String tipo, String nombre, int edad) {
        super(id, tipo, nombre,edad);
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
}
