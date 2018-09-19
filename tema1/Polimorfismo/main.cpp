#include <iostream>
#include <string>
#include "Soporte.h"
#include "Redes.h"
#include "Programador.h"
using namespace std;

int main()
{
    Soporte A;
    A.asignarSueldoMensual(5000);
    A.asignarNombre("Juan");
    A.asignarEdad(30);
    A.asignarCURP("12345876TEBF322");
    A.asignarDepto("Soporte");
    A.asignarRFC("asfdvsbfs345647");
    A.asignarPuesto("Trabajdor");

    Programador B;
    B.asignarPrecioProyect(10000);
    B.asignarCantidadProyec(10);
    B.asignarNombre("Pedro");
    B.asignarEdad(32);
    B.asignarCURP("12363768GHSH322");
    B.asignarDepto("Programacion");
    B.asignarRFC("abhdjfs343147");
    B.asignarPuesto("Trabajdor");

    Redes C;
    C.asignarCantidadTrabaj(10);
    C.asignarPrecioTrabajo(1000);
    C.asignarNombre("Pablo");
    C.asignarEdad(30);
    C.asignarCURP("12345HDJ6322");
    C.asignarDepto("Redes");
    C.asignarRFC("hahsa32345647");
    C.asignarPuesto("Trabajdor");

    cout << "Sueldo De Trabajadores" ;

    cout << "\n\nNombre:    Edad:   Departamento:   Curp:   RFC:    Puesto: Sueldo: ";
    cout << "\n" <<A.obtenerNombre() << A.obtenerEdad() << A.obtenerDepto() << A.obtenerCURP() << A.obtenerRFC() << A.obtenerPuesto() << A.SueldoQuincenal();
    cout << B.SueldoQuincenal();
    cout << C.SueldoQuincenal();

    return 0;
}
