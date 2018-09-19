#ifndef EMPLEADO_H
#define EMPLEADO_H
#include <string>
#include <iostream>

using namespace std;
class Empleado
{
    public:
        Empleado();

        string obtenerCURP(){return CURP; }
        void asignarCURP(string xCURP){CURP = xCURP;}
        string obtenerRFC(){return RFC; }
        void asignarRFC(string xRFC){RFC = xRFC;}
        string obtenerNombre(){return Nombre; }
        void asignarNombre(string Name){Nombre = Name;}
        string obtenerDepto(){return Depto; }
        void asignarDepto(string queDepto){Depto= queDepto;}
        string obtenerPuesto(){return Puesto; }
        void asignarPuesto(string quePuesto){Puesto = quePuesto;}
        int obtenerEdad(){return Edad; }
        void asignarEdad(int xEdad){Edad = xEdad;}


        float SueldoQuincenal();


    protected:

    private:

        string CURP;
        string RFC;
        string Nombre;
        string Depto;
        string Puesto;
        int Edad;

};

#endif // EMPLEADO_H
