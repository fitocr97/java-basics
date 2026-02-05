/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p05_estructuras;

import java.util.HashSet;

/**
 *
 * @author Rodolfo
 */
public class Sets {
    
    public static void main(String[] args) {
        
        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.add("Rodolfo");
        names.add("Mora");
        names.add("Fito");
        names.add("fito@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminación

        names.remove("Rodolfo");
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("Rodolfo"));
        System.out.println(names.contains("fito@gmail.com"));

        System.out.println(names);
        names.add("Rodolfo");
        names.add("Rodolfo");
        names.add("Rodolfo");
        System.out.println(names);

        // Conjuntos
        // names.addAll(numbers); Error

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Argentina");
        countries.add("MoureDev");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);
    }
}
