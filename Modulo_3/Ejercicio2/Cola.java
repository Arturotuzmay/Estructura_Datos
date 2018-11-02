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
public class Cola {
    protected Nodo frente;
    protected Nodo fin;
    
    public Cola(){
        frente = fin = null;
    }
    
    public void Ingresar(String elemento){
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()){
            frente = a;
        } else {
            fin.Sig = a;
        }
            fin = a;
    }
    
    public String Sacar(){
        String aux;
        if (!colaVacia())
        {
            aux = frente.Dato;
            frente = frente.Sig;
        } else {
            return "";
        }
            return aux;
    }
    
    public boolean colaVacia(){
        if(frente==null){
            return true;                   
        }else {
            return false;
        }
    }
}
