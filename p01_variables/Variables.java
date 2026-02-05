

package p01_variables;

/**
 *
 * @author Rodolfo
 */
public class Variables {
    
    public static void main(String[] args) {
        // Tipos de datos primitivos
        int myInt = 37;
        System.out.println(myInt);

        double myDouble = 1.77;
        System.out.println(myDouble); // float, long, byte
        
        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);
        
        // Variables
        String name = "Fito";
        System.out.println(name);

        name = "Rodolfo";
        System.out.println(name);

        // name = 37; Error (no podemos cambiar el tipo de dato)

        int age = 37;
        System.out.println(age);

        var email = "fito@gmail.com";
        System.out.println(email);
        
        // Constantes
        final String EMAIL = "mouredev@gmail.com";
        // EMAIL = "mora@gmail.com"; Es constante
        System.out.println(EMAIL);
    }
    
}
