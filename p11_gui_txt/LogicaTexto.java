
package p11_gui_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class LogicaTexto {
    
    public static void main(String[] args) throws IOException {
        
        File archivo = new File("src/p11_gui_txt/Animales.txt");
        BufferedWriter bw;

        if(!archivo.exists()){
            bw = new BufferedWriter(new FileWriter("src/p11_gui_txt/Animales.txt"));
            System.out.println("archivo creado");
        }
        
        System.out.println("entro");
        
        Ventana ventana = new Ventana();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
    
    public void guardarAnimal(String nombre, String tipo, String id){
        
        try{
            FileWriter fw = new FileWriter("src/p11_gui_txt/Animales.txt", true); //indica que va agregar texto
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nombre+ "," +tipo + "," + id +"\n" );
            bw.close();
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public String mostrarAnimales(){

        File archivo = new File("src/p11_gui_txt/Animales.txt");
        String texto = "";

        try{

            Scanner sc = new Scanner(archivo);

            while(sc.hasNextLine()){

                String linea = sc.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter(",");

                Animal animal = new Animal();

                animal.setNombre(delimitar.next());
                animal.setTipo(delimitar.next());
                animal.setId(delimitar.next());

                texto = texto + animal.getNombre() + " | "
                        + animal.getTipo() + " | "
                        + animal.getId() + "\n";
            }

            sc.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return texto;
    }
    
    
}
