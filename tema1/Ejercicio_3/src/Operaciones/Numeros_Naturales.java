/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Manuel Arturo Tuz May
 */
public class Numeros_Naturales {
//ATRIBUTOS DEL LA CLASE
    Scanner teclado=new Scanner(System.in);
    int num1, num2;
    int suc, suc1, ant, ant2, s, m, r, x, y;
    

//METODOS QUE OFRESERA LA CLASE
    

//INGRESO DE DATOS     
 public void Ingresar(){
   System.out.println("Ingrese el primer numero: ");
   num1 =teclado.nextInt();//Lectura por teclado
   System.out.println("Ingrese el segundo numero: ");
   num2 =teclado.nextInt();
 }
 
 //OPERACION QUE DETERMINA AL SUCESOR
 public void Sucesor(){
 suc = num1 + 1; 
 suc1 = num2 + 1;
 }
 //OPERACION QUE DERTERMINA AL ANTECESOR
 public void Antecesor(){
 ant = num1 - 1; 
 ant2 = num2 - 1;
 }
 //OPERACION QUE DETERMINA LA IGUALDAD A "0"
 public void Escero(){
     if (num1 == 0){
        System.out.println("El primer numero es cero");                  
    } else{
    System.out.println ("El primer numero no es cero");
     }
 }
 
  public void Escero2(){
     if (num2 == 0){
        System.out.println("El segundo numero es cero");                  
    } else{
    System.out.println ("El segundo numero no es cero");
     }
 }
 //OPERACION SUMA DE NUMEROS
 public void Suma(){
     s = num1 + num2;    
 }
 //OPERACION RESTA PARA DETERMNINAR LA DIFERENCIA
 public void Resta(){
     r = num1 - num2;
 }
 //OPERACION QUE DETERMINA LA IGUALDAD DE NUMEROS
 public void Igual(){
     if (num1 == num2){
         System.out.println("Los numeros son iguales");
     }else{
         System.out.println("Los numeros no son iguales");   
     }     
 }
 //OPERACION NUMERO MENOR
 public void Menor(){
     if (num1 <= num2){
      System.out.println("El numero menor es: "+num1);
     }else{
      System.out.println("El numero menor es: "+num2);
    }
 }

 public void Cero(){
     x = num1 - num1;
     y = num2 -num2;
 }
 
//IMPRESION DE LOS RESULTADOS         
 public void MostrarResultado(){   
     System.out.println("El sucesor del primer numero es: "+suc);
     System.out.println("El antecesor del primer numero es: "+ant);
     System.out.println("El sucesor del segundo numero es: "+suc1);
     System.out.println("El antecesor del segundo numero es: "+ant2);
     System.out.println("Igualacion a cero: "+x +" Segundo numero: "+y);
     System.out.println("La suma es: "+s);
     System.out.println("La diferencia es: "+r);
 }
         
    
}
