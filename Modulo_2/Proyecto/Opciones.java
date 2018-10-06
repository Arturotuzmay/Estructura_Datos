package proyecto; //Paqueteria que contiene el proyecto


public class Opciones {
    private String vector[];
     public Opciones (String vector [] ){
        this.vector = vector;
     }
     public void ordenar(){
       for ( int i =0; i<vector.length;i++){//metodo burbuja para ordenar
           for (int j=0;j<vector.length && i !=j; j++){
               if (vector[i].compareToIgnoreCase(vector[j]) < 0){
                   String aux = vector [i];
                   vector [i] = vector [j];
                   vector [j] = aux;
          }
               
       }
     }
       for (String a: vector){
             System.out.println(a);
         }
     }
     
     public void BuscarNombre(String nombre){//compara los datos ingresados por el usuario
        if(NombreBus(nombre,0)){
            System.out.println("El nombre: "+nombre+" existe en la lista");
        }
        else{ 
            System.out.println("El nombre: "+nombre+" no existe en la lista");   
        }
     }
     
     public boolean NombreBus(String nombre, int i){
      if(i == vector.length-1) {
         return false;
     }else if(vector[i].equals(nombre)) {
         return true;
     }
     return NombreBus(nombre, i+1);
     }
    
}