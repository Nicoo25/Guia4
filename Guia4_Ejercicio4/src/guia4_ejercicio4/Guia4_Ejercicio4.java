
package guia4_ejercicio4;

import java.util.Scanner;


public class Guia4_Ejercicio4 {

    /**
     Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos 
     indique si es o no un número primo, debe devolver true si es primo, sino false. Un número primo es aquel que solo
     puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
     17 si es primo.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num;
        System.out.println("Ingrese un nro por teclado para saber si es primo ");
        num = leer.nextDouble();
        System.out.println("Numero primo: " + primo(num));
    }
    
    public static boolean primo(double nro){
        Boolean resp=true;
        //double aux;
        //int cont=0;
        for (double i=2; i < nro; i++) {
           // aux=nro%i;
            if(nro%i==0){
                //cont++;
                resp=false;
            }
        }
    return (resp); 
    }
    
}
