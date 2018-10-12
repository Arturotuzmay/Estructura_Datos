/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicolas_ejemplo;

/**
 *
 * @author Alejandro Cupul
 */
public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior;
    
    //Constructor para cuando aun no hay nodos
    public NodoDoble(int el){
        this(el, null, null);
    }
    
    //Constructor para cuando ya hay nodos
    public NodoDoble(int el, NodoDoble s, NodoDoble a){
        dato=el;
        siguiente=s;
        anterior=a;
    }
}
