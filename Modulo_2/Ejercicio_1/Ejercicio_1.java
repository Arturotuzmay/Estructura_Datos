/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        Palindromo A = new Palindromo();// llamada a la clase
        
        String nom, a;
        System.out.println("Ingrese la palabra o frase: ");
        nom = teclado.nextLine();// frase ingresada por teclado
        a = nom.replace(" ","");//se utiliza para retirar los espacios entre palabras
        boolean Frase = A.EsPalindromo(a.toCharArray(), 0, a.length());//Se llama a la funcion recursiva
         
    if(Frase){
        System.out.println("El texto es palindromo");
    } else {
        System.out.println("El texto NO es palindromo");
    }
  }
                        }