/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Manuel Arturo Tuz May
 */
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Pila A = new Pila();
        Cola B = new Cola();
        int x;
        String e;
        System.out.print ("Cuantos elementos desea ingresar: ");
            x = sc.nextInt();
        System.out.println ("Introduce los elementos de la pila: ");
        
        for (int i=1; i<=x; i++){
            System.out.print ("Ingresar dato: " );
                e = sc.next();
                    A.Ingresar(e);
        }
        System.out.println ("Datos introducidos a la cola: ");
        
        System.out.println ("           Cola: ");        
        for (int i=1; i<=x; i++){
            B.Ingresar(A.Sacar());
                System.out.println ("Dato " + i + ": " + B.Sacar());
         }
    }}
