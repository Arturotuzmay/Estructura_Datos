/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;



/**
 *
 * @author Manuel Arturo Tuz May
 */
public class Caambio_Compra {

    public int Cam200(int x){
       if(x / 200 == 0){
           return 0;
       }else{
            if(x / 200 == 1){
                return 1;
            }else{
                return (1) + Cam200(x - 200);
            }
        } 
    }  
    public int Cam100(int x){
        x = x - (Cam200(x) * 200);
        if(x / 100 == 0){
            return 0;
        }else{
            if(x / 100 == 1){
                return 1;
            }else{
                return (1) + Cam100( x - 100);
            }
        }
    }
    public int Cam50(int x){
        x = x - (Cam200(x)*200)-(Cam100(x)*100);
        if(x / 50 == 0){
            return 0;
        }else{
            if(x / 50 == 1){
                return 1;
            }else{
                return (1) + Cam50(x-50);
            }
        }
    }
    public int Cam20(int x){
        x = x - (Cam200(x)*200)-(Cam100(x)*100)-(Cam50(x)*50);
        if(x / 20==0){
            return 0;
        }else{
            if(x / 20 == 1){
                return 1;
            }else{
                return (1) + Cam20(x-20);
            }
        }
    }
    public int Cam10(int x){
        x = x -(Cam200(x)*200)-(Cam100(x)*100)-(Cam50(x)*50)-(Cam20(x)*20);
        if(x/10==0){
            return 0;
        }else{
            if(x/10 == 1){
                return 1;
            }
            return 0;
        }
    }
    public int Cam5(int x){
        x = x - (Cam200(x)*200)-(Cam100(x)*100)-(Cam50(x)*50)-(Cam20(x)*20)-(Cam10(x)*10);
        if(x/5==0){
            return 0;
        }else{
            if(x/5 == 1){
                return 1;
            }
            return 0;
        }
    }
    public int Cam2(int x){
        x = x - (Cam200(x)*200)-(Cam100(x)*100)-(Cam50(x)*50)-(Cam20(x)*20)-(Cam10(x)*10)-(Cam5(x)*5);
        if(x/2==0){
            return 0;
        }else{
            if(x/2 == 1){
                return 1;
            }else{
                return (1) + Cam2(x-2);
            }
        }
    }    
    public int Cam1(int x){
        x = x -(Cam200(x)*200)-(Cam100(x)*100)-(Cam50(x)*50)-(Cam20(x)*20)-(Cam10(x)*10)-(Cam5(x)*5)-(Cam2(x)*2);
        if(x==0){
            return 0;
        }else{
            return 1;
        }
    } 
    
    
}

