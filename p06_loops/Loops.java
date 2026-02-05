/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Rodolfo
 */
public class Loops {
    
    public static void main(String[] args) {
        
        // - for controlado por contador
        for (int index = 0; index < 5; index++) {
            System.out.println("Hola");
        }

        String[] names = {"Fito", "Mora", "Rodolfo"};
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

  
        // - for-each
        for (String name: names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Fito", "fito@gmail.com");
        emails.put("Mora", "mora@gmail.com");
        emails.put("Rodolfo", "rodolfo@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }


        // - while
        int index = 0;
        while (index < 5) {
            System.out.println("Hola");
            index++;
        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Moure")) {
                find = true;
            }
            index++;
        }

        
        // - do-while
        index = 0;
        do {
            System.out.println("Hola");
            index++;
        } while (index < 0);

        // Control de bucles
        // - break
        for (String name: names) {
            if (name.equals("Moure")) {
                break;
            }
            System.out.println(name);
        }

        // - continue
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
