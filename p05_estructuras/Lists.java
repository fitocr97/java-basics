/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p05_estructuras;

import java.util.ArrayList;

/**
 *
 * @author Rodolfo
 */
public class Lists {
    
    public static void main(String[] args) {
        
         // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño
        System.out.println(names.size());

        // Inserción
        names.add("Rodolfo");
        names.add("Mora");
        names.add("Fito");
        System.out.println(names.size());

        // Acceso
        System.out.println(names.get(1));

        // Modificación
        names.set(2, "fito@gmail.com");
        // Eliminación

        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("Rodolfo"));
        System.out.println(names.contains("fito@gmail.com"));

        // Limpieza
        names.add("Fito");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());
        
    }
}
