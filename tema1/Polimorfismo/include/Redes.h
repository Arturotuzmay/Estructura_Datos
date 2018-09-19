#ifndef REDES_H
#define REDES_H

#include <Empleado.h>


class Redes : public Empleado
{
    public:
        Redes();


        void asignarPrecioTrabajo(float Precio){PrecioTrabajo = Precio;}
        void asignarCantidadTrabaj(int Cantidad){CantidadTrabaj = Cantidad;}

        float SueldoQuincenal();

    protected:

        float PrecioTrabajo;
        int CantidadTrabaj;

    private:
};

#endif // REDES_H
