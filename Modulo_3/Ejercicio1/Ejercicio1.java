/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Manuel Arturo Tuz May
 */
import java.util.Scanner; 
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
   public static void main(String[] args) 
   {
       String x;
   Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la palabra o frase: ");
            x = sc.nextLine();
   
            ClasePila A= new ClasePila(x.length());
        for (int i=0;i<x.length();i++){
        A.Poner(x.charAt(i));
    }
            System.out.println("");
            System.out.print("Palabra invertida : ");
                    A.Salida();
            System.out.println("");
}
    }
