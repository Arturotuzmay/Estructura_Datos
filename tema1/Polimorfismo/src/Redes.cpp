#include "Redes.h"

Redes::Redes()
{
    //ctor
}

float Redes::SueldoQuincenal(){
    float sueldo;
    sueldo = (PrecioTrabajo * CantidadTrabaj) * 0.1;
    return sueldo;

}
