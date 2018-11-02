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
public class Nodo {
    String Dato;
    Nodo Sig; //Puntero enlace
 
    public Nodo(String x){
        Dato = x;
        Sig = null;
    }
}
