/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author Manuel Arturo Tuz May 
 */
public class Decimal_a_Binario {

   
        
        public static void decBin(int n) {
        if (n < 2) {//Si el numero ingresado es menor a 2 simplemente imprime
            System.out.print(n);
        } else {//en caso contrario se ejecuta la otra parte 
            decBin(n / 2);//divide al numero y retorna la funcion
            System.out.print(n % 2);//imprime el resultado hasta que el if se cumpla
        } }
   
}
