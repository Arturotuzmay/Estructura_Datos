/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Manuel Arturo Tuz May 
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Decimal_a_Binario X = new Decimal_a_Binario();
        
        Scanner sc = new Scanner(System.in);
        int n;
        
            System.out.print("Introduzca un numero para su conversion: ");
            n = sc.nextInt();
        
        System.out.println();
        System.out.print("Binario: ");
        X.decBin(n);
        System.out.println();
        
    }
}
