/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author PLACAFE
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una una variable llamada nombre del tipo String (cadena)
        String nombre;
        // se imprime x pantalla la frase 
        System.out.println("Escribe tu nombre");
        // se lee el Nombre 
        nombre = leer.next();
        System.out.println("Hola Mundo, soy " + nombre + " y estoy programando en java.!!!");
    }
    
}
