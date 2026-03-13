/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p12_gui_bin;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Rodolfo
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        
        
        Principal principal = new Principal();
        principal.setLocationRelativeTo(null);
        principal.setTitle("Menu");
        principal.setVisible(true);
        
         try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("src/p12_gui_bin/animales.dat"));

            ArrayList<Animal> lista = (ArrayList<Animal>) ois.readObject();

            for (Animal a : lista) {

                System.out.println(
                        a.getId() + " " +
                        a.getTipo() + " " +
                        a.getNombre() + " " +
                        a.getEdad()
                );

            }

            ois.close();

        } catch (Exception e) {

            System.out.println("Error leyendo archivo");
        }
        
        
        
    }
}
