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

public class ClasePila{
    
    char Pila[];
    int top;
    
//constructor de pila
public ClasePila (int tam)
    {
     Pila = new char [tam];
     top = 0;
    }

    //Metodo Para agregar datos a la pila
public void Poner(char x){
     Pila[top] = x;
     top++;
    }

public void Salida(){
     while (top > 0)
        {
            top --;
System.out.print(Pila[top]);
        }
    }
}
