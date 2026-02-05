/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p05_estructuras;

import java.util.HashMap;

/**
 *
 * @author Rodolfo
 */
public class Maps {
    
    public static void main(String[] args) {
        
        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño
        System.out.println(names.size());

        // Inserción
        names.put("Fito", "fito@gmail.com");
        names.put("Rodolfo", "rodolfo@gmail.com");
        names.put("Mora", "mora@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceso
        System.out.println(names.get("Fito"));
        System.out.println(names.get("Rodolfo"));

        // Verificación
        System.out.println(names.containsKey("Fito"));
        System.out.println(names.containsKey("Rodolfo"));

        System.out.println(names.containsValue("mora@gmail.com"));

        // Eliminación
        System.out.println(names.remove("Fito"));
        System.out.println(names.remove("Rodolfo"));
        System.out.println(names);

        // Limpieza
        names.clear();
        System.out.println(names);

        // Modificación
        names.put("Fito", "mora@gmail.com");
        System.out.println(names);

        names.put("Fito", "morafito@gmail.com");
        System.out.println(names);

        names.replace("Fito", "fiv@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("Fito", "fitoo@gmail.com"); // Solo lo añade si no existe
        System.out.println(names);

        // Otras operaciones
        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
    }
}
