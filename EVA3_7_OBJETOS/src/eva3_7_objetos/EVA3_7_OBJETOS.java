/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_objetos;

/**
 *
 * @author invitado
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Jorge";
        perso1.apellido = "Hernandez";
        perso1.edad = 17;
                imprimirPersonas(perso1);


        Persona perso2 = new Persona();
        System.out.println(perso2);
        perso2.nombre = "Adrian";
        perso2.apellido = "Bancouber";
        perso2.edad = 18;
        
        imprimirPersonas(perso2);
    }

    public static void imprimirPersonas(Persona perso) {
        System.out.println("Direccion: " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " "+  perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }

}

class Persona {

    String nombre;
    String apellido;
    int edad;
}
