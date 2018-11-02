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
public class Pila {
    private Nodo cima;
 
    public Pila(){
        cima = null;
    }
    
    public void Ingresar(String elemento){
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.Sig = cima;
        cima = nuevo;
    }
       
    public String Sacar(){                 
        String aux = cima.Dato;
        cima = cima.Sig;
        return aux;
    }
}
