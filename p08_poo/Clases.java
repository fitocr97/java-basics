/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p08_poo;

/**
 *
 * @author Rodolfo
 */
public class Clases {
    
    public static void main(String[] args) {
        
        var person = new Persona("Rodolfo", -38, "123456789A");

//        person.name = "Rodolfo";
//        person.age = 28;

        person.sayHello();

        person.name = "Rodolf Mora";
        System.out.println(person.name);

//        person.id = "123456789A";

        System.out.println(person.getId());

        person.setAge(38);
        System.out.println(person.getAge());

        var person2 = new Persona("Fito", 18, "123456789B");
        person2.sayHello();
    }
    
    
}
