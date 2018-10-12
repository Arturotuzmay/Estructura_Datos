package bicolas_ejemplo;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Cupul
 */
public class Bicolas_Ejemplo {

    public static void main(String[] args) {
        ListaDoble lista=new ListaDoble();
        int opcion=0, elemento=0;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                  "1. Agregar un nodo al inicio\n"
                + "2. Agregar un nodo al final\n"
                + "3. Mostrar la lista de inicio a fin\n"
                + "4. Mostrar la lista de fin a inicio\n"
                + "5. Eliminar un Nodo del Inicio\n"
                + "6. Eliminar un Nodo del Final\n"
                + "7. Salir\n"
                + "¿Que operacion deseas realizar?", "Menú de opciones",
                JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo", "Agregando Nodo al Inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlInicio(elemento);
                        break;
                    case 2:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo", "Agregando Nodo al Final",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if (!lista.estVacia()){
                            lista.mostrarListaInicioFin(elemento);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay Nodos aún", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!lista.estVacia()){
                            lista.mostrarListaFinInicio(elemento);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay Nodos aún", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;    
                    case 5:
                        if (!lista.estVacia()){
                            elemento=lista.eliminarDelInicio();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento, "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay Nodos aún", "Eliminando Nodo del Inicio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!lista.estVacia()){
                            elemento=lista.eliminarDelFinal();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento, "Eliminando del final", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay Nodos aún", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción no existe", "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        }while(opcion!=7); 
}
}