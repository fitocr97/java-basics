/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p08_poo;

/**
 *
 * @author Rodolfo
 */
public class Persona {
    
    
    // Encapsulamiento

    // - Modificadores de acceso
    // public
    // private
    // protected
    // (default)

    // getters
    // setters
    
    // Atributos
    protected String name;
    private int age;
    final private String id;

    // Constructor
    public Persona(String name, int age, String id) {
        this.name = name;
        this.setAge(age);
        this.id = id;
    }

    // Métodos
    public void sayHello() {
        System.out.println("Hola, soy " + name + ", tengo " + age + " años, y mi id es " + id + ".");
    }

    // Getter
    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
