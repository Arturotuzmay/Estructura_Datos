/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicolas_ejemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Cupul
 */
public class ListaDoble {
    private NodoDoble inicio, fin;
    public ListaDoble(){
        inicio=fin=null;
    }
    
    //Metodo para saber cuando la lista está vacía
    public boolean estVacia(){
        return inicio==null;
    }
    
    //Método para agregar nodos al final
    public void agregarAlFinal(int el){
        if(!estVacia()){
            fin=new NodoDoble(el, null, fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(el);
        }
    }
    
    //Método para agregar al inicio
    public void agregarAlInicio(int el){
        if(!estVacia()){
            inicio=new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoDoble(el);
        }
    }
    
    //Método para mostrar la lista de Inicio a Fin
    public void mostrarListaInicioFin(int el){
        if(!estVacia()){
            String datos="<=>";
            NodoDoble auxiliar=inicio;
            while(auxiliar!=null){
                datos=datos+"["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Método para mostrar la lista de Fin a Inicio
    public void mostrarListaFinInicio(int el){
        if(!estVacia()){
            String datos="<=>";
            NodoDoble auxiliar=fin;
            while(auxiliar!=null){
                datos=datos+"["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando Lista de Fin a Inicio", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Método para eliminar del Inicio
    public int eliminarDelInicio(){
        int elemento=inicio.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
            inicio.anterior=null;
        }
        return elemento;
    }
    
    //Método para eliminar del Final
    public int eliminarDelFinal(){
        int elemento=fin.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            fin=fin.anterior;
            fin.siguiente=null;
        }
        return elemento;
    }
    
}
