/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p08_poo;

/**
 *
 * @author Rodolfo
 */
public class abstraccion {
    
     public static void main(String[] args) {

        // Abstracción

        // - Clase abstracta

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

    }

    // - Clase abstracta

    public static abstract class Animal {

        public abstract void sound();

        public void sleep() {
            System.out.println("El animal está durmiendo");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }

        @Override
        public void sleep() {
            System.out.println("El perro está durmiendo");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Miau");
        }
    }

    // - Interface

    public interface Flying {

        void fly();
    }

    public static class Bird extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Pio pio");
        }

        @Override
        public void fly() {
            System.out.println("El pájaro vuela");
        }
    }

    public static class Bat extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Soy batman!");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago vuela");
        }
    }
}
