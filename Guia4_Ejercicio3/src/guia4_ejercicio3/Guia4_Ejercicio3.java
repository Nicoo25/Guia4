package guia4_ejercicio3;

import java.util.Scanner;

public class Guia4_Ejercicio3 {
      
    public static void main(String[] args) {
        int cant;
        String mone;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros...");
        cant = leer.nextInt();
        System.out.println("=== Ingrese una opcion para convertir ==== ");
        
        System.out.println("  Dolar. ");
        
        System.out.println("  Yenes. ");
        
        System.out.println("  Libras. ");
        
        mone = leer.nextLine();
        
        System.out.println("" + mone);
        convertir(cant, mone);
        
        
        
    }

    public static void convertir(int cant, String money) {
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
