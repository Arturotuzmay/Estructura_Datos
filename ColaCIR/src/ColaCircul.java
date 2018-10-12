
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ColaCircul {
int max=5; // Tamano maximo de la Cola Circular
int colacirc[]=new int[max]; // Declaracion del arreglo para almacenar la Cola Circular
int frente, fin; // Inidicadores del inicio y final de la Cola Circular

public void ClaseColaCircular() { // Constructor que inicializa el frente y el final de la Cola Circular
frente=-1; fin=-1;
System.out.println("Cola circular inicializada !!!");
}

public void Mostrar() {
    int i=0;
System.out.println("\n\n<<< MOSTRAR COLA CIRCULAR >>>");
if(frente==-1) {
System.out.println("\nCola Circular vacia !!!");
}
else {
i=frente;
do {
System.out.println("colacirc["+i+"]="+colacirc[i]);
i++;
if(i==max && frente>fin) i=0; // Reiniciar en cero (dar la vuelta)
}while(i!=fin+1);
}

System.out.println("frente="+frente);
System.out.println("fin="+fin);
System.out.println("max="+max);
}

public void Insertar(int dato) {
if((fin==max-1 && frente==0) || (fin+1==frente)) {
System.out.println("\nCola Circular llena !!!");
return;
}
if(fin==max-1 && frente!=0) fin=0; else fin++;
colacirc[fin]=dato;
if(frente==-1) frente=0;
}
    
    public void Eliminar() {
System.out.println("\n\n<<< ELIMINAR DATO >>>");
if(frente==-1) {
System.out.println("Cola Circular vacia !!!");
return;
}
System.out.println("Dato eliminado = "+colacirc[frente]);
if(frente==fin) {
frente=-1; fin=-1;
return;
}
if(frente==max) frente=0; else frente++;
}
    
public void Altas() throws IOException {
    
    
int dato;
System.out.println("\n\n<<< ALTAS >>>");
System.out.print("Dato a insertar? ---> ");
dato=getInt();
Insertar(dato); //Invocar el metodo Insertar del objeto ColaCircular
}    
    
// Funcion para capturar un entero desde el teclado
public int getInt() throws IOException {
String s = getString();
return Integer.parseInt(s);
}

// Funcion para capturar una cadena desde el teclado
public String getString() throws IOException {
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String s = br.readLine();
return s;
} 

}
