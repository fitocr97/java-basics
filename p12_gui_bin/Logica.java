
package p12_gui_bin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Logica {
    
    private ArrayList<Animal> animales = new ArrayList<>();
    private String archivo = "src/p12_gui_bin/animales.dat";

    public Logica() {
        cargarArchivo();
    }

    public void agregar(Gato g) {
        
        animales.add(g);
        guardarArchivo();
    }

    public ArrayList<Animal> listar() {
        return animales;
    }

    public Animal buscar(String id) {

        for (Animal g : animales) {

            if (g.getId().equalsIgnoreCase(id)) {
                return g;
            }
        }

        return null;
    }

    public void eliminar(String ID) {

        Animal g = buscar(ID);

        if (g != null) {
            animales.remove(g);
            guardarArchivo();
        }
    }

    public void actualizar(Animal nuevo) {

        for (int i = 0; i < animales.size(); i++) {

            if (animales.get(i).getId().equalsIgnoreCase(nuevo.getId())) {

                animales.set(i, nuevo);
                guardarArchivo();
                break;
            }
        }
    }

    private void guardarArchivo() {
     
        try {

            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(archivo));

            oos.writeObject(animales); //guarda el array
            
            oos.close();

        } catch (Exception e) {

            System.out.println("Error guardando archivo");
        }
    }

    private void cargarArchivo() {

        try {

            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(archivo));

            animales = (ArrayList<Animal>) ois.readObject();

            ois.close();

        } catch (Exception e) {

            animales = new ArrayList<>();
        }
    }
    
}
