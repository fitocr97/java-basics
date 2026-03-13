/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p12_gui_bin;

import java.io.Serializable;

/**
 *
 * @author Rodolfo
 */
public abstract class Animal implements Serializable { //serializable para guardar en Binario
    
    private String id;
    private String tipo;
     private String Nombre;
    private int edad;
   

    public Animal() {
    }

    public Animal(String id, String tipo, String Nombre, int edad) {
        this.id = id;
        this.tipo = tipo;
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    
}
