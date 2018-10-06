/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Manuel Arturo Tuz May
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caambio_Compra N = new Caambio_Compra();
        Scanner sc = new Scanner(System.in);

    int a, b, z;
    
    System.out.println("Total de la compra: ");
    a = sc.nextInt();
    
    System.out.println("Con cuanto se pago: ");
    b = sc.nextInt();
    
    z = b - a;
    
        System.out.println("Su Cambio se divide en: ");
        
        if(N.Cam200(z)>=1){System.out.println(N.Cam200(z)+ " Billete de $200");
        }
        if(N.Cam100(z)>=1){System.out.println(N.Cam100(z)+ " Billete de $100");    
        }    
        if(N.Cam50(z)>=1){System.out.println(N.Cam50(z)+ " Billete de $50");
        }
        if(N.Cam20(z)>=1){System.out.println(N.Cam20(z)+ " Billete de $20");
        }
        if(N.Cam10(z)>=1){System.out.println(N.Cam10(z)+ " Moneda de $10");
        }
        if(N.Cam5(z)>=1){System.out.println(N.Cam5(z)+ " Moneda de $5");
        }
        if(N.Cam2(z)>=1){System.out.println(N.Cam2(z)+ " Moneda de $2");
        }
        if(N.Cam1(z)>=1){System.out.println(N.Cam1(z)+ " Moneda de $1");
    }
       
    }
    }
