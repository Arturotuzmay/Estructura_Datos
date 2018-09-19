#ifndef SOPORTE_H
#define SOPORTE_H

#include <Empleado.h>


class Soporte : public Empleado
{
    public:
        Soporte();

        float obtenerSueldoMensual(){return SueldoMensual;}
        void asignarSueldoMensual(float sueldoMes){SueldoMensual = sueldoMes;}

        float SueldoQuincenal();
    protected:

    private:

        float SueldoMensual;

};

#endif // SOPORTE_H
