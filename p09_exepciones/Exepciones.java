/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p09_exepciones;

/**
 *
 * @author Rodolfo
 */
public class Exepciones {
     public static void main(String[] args) {

        // Manejo de excepciones

        // try catch
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

        // try con múltiples catch
        try {
            var result = 10 / 5;
            System.out.println(result);

            var name = "Rodolfo";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("Cuidado con dividir algo que no puedes: " + e);
        } catch (NullPointerException e) {
            System.out.println("Ha ocurrido un null pointer mítico!");
        } catch (Exception e) {
            System.out.println("Se ha producido un error no esperado");
        }

        // finally
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Fin del bloque try-catch");
        }

        
    }
}
