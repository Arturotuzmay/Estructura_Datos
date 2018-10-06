/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author Usuario
 */
public class Decimal_a_Binario {

   
        
        public static void decBin(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
        } }
   
}
