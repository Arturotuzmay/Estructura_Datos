/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String nom;
      int a=0, b=0, opcion;
      try {
      FileReader fr = new FileReader("Datos.txt");
      BufferedReader br = new BufferedReader(fr);

      String linea;
      while((linea = br.readLine()) != null)
      {
         a++;
        //System.out.println(linea);
      }
      fr.close();
    }
    catch(Exception e) {
      //
    }
    String [] vector= new String[a];
    try {
      FileReader fr = new FileReader("Datos.txt");
      BufferedReader br = new BufferedReader(fr);

      String linea;
      while((linea = br.readLine()) != null)
      {
         vector[b]=linea;
         b++;
        //System.out.println(linea);
      }
      fr.close();
    }
    catch(IOException e) {
      //
    }
     Opciones o = new Opciones(vector);//lo que puede ver el usuario
      do{
          System.out.println("Bienvenido al programa");
          System.out.println("MENU");
          System.out.println("");
          System.out.println("1.-Nombres alfabeticamente");
          System.out.println("2.-Buscar Nombre en la lista");
          System.out.println("3.-Salir del programa");
          System.out.println("¿Cual es su Opcion?");
          opcion=teclado.nextInt();//Lectura por teclado
          
          if(opcion==1){//compara el numero ingresado por el usuario
             o.ordenar();//
           System.out.println("");
          }
          else if (opcion==2){
        System.out.println("Ingrese un nombre ");
        nom=teclado.next();
        o.BuscarNombre(nom);
         System.out.println("");
       }
      }while(opcion!=3);
    
    
    
        
    }
}
    
    
   
