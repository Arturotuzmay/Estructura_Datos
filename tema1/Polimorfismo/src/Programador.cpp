#include "Programador.h"

Programador::Programador()
{
    //ctor
}

float Programador::SueldoQuincenal(){
    float sueldo;
    sueldo = (PrecioProyect * CantidadProyec * 0.15) + (85 * 15);

return sueldo;
}
