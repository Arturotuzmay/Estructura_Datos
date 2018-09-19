#ifndef PROGRAMADOR_H
#define PROGRAMADOR_H

#include <Empleado.h>


class Programador : public Empleado
{
    public:
        Programador();

        void asignarPrecioProyect(float precio){PrecioProyect = precio;}
        void asignarCantidadProyec(float cantidad){CantidadProyec = cantidad;}

        float SueldoQuincenal();

    protected:

        float PrecioProyect;
        int CantidadProyec;

    private:
};

#endif // PROGRAMADOR_H
