// ColaCircular.java

// Este programa utiliza arreglos para la representacion de Colas Circulares
// y se ejecuta en modo texto

// Compilar: javac ColaCircular.java
// Ejecutar: java ColaCircular
// ========================================================

import java.io.*;

// Declaracion del objeto ColaCircular

// Funcion principal
public class ColaCircular {
public static void main(String args[]) throws IOException {

    ColaCircul A = new ColaCircul();
    int op=0;
    do {
System.out.println("\n\n<<< COLAS CIRCULARES >>>");
System.out.println("1.- Insertar");
System.out.println("2.- Eliminar");
System.out.println("3.- Mostrar");
System.out.println("0.- Salir");

System.out.print("Opcion? ---> ");
op=A.getInt();
switch(op) {
case 1 : A.Altas(); break;
case 2 : A.Eliminar(); break;
case 3 : A.Mostrar(); break;
}
}while(op!=0);
}





 
}