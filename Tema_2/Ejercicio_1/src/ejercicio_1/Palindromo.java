/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author Usuario
 */
public class Palindromo {
    
    public boolean EsPalindromo(char [] nomChars, int a, int b ){
      
        if (a == b || a == b -1){//compara los terminos primero y ultimo del string
            return true;
        }else{
            return nomChars[a] == nomChars[b-1] && EsPalindromo(nomChars,a + 1, b -1);//realiza las comparaciones entre letras
                                                                                      // de forma recursiva      
        }
 }
}
