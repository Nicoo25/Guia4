/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author PLACAFE
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num1, num2, sum;  
    Scanner leer = new Scanner (System.in); 
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        sum = num1 + num2; 
        System.out.println("Los Nros son " + num1 + " y " + num2 + " y la suma es " +sum);
        
    }
    
}
