/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejercico3.pkg2;

import java.util.Scanner;

/**
 *
 * @author PLACAFE
 */
public class Guia4_Ejercico32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cant;
        String mone;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros...");
        cant = leer.nextDouble();
        System.out.println("=== Ingrese una opcion para convertir ==== ");
        
        System.out.println("  Dolar. ");
        
        System.out.println("  Yenes. ");
        
        System.out.println("  Libras. ");
        
        mone = leer.nextLine();
        
        System.out.println(mone);
        
        convertir(cant, mone);
        
    }

    public static void convertir(Double cant, String money) {
        switch (money) {
            case "dolar":
                System.out.println("La cantidad es U$s " + (cant * 1.28611) + ".");
                break;
            case "yenes":
                System.out.println("La cantidad es Yenes " + (cant * 129.852) + ".");
                break;
            case "libras":
                System.out.println("La cantidad es Libras " + (cant * 0.86) + ".");
                break;
        }
    }
    
}
