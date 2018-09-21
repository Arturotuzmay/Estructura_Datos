#include <iostream>
#include <cstdlib>
#include <Palabras.h>

using namespace std;



int main ()
{
    Palabras A;

            char opcion;
                cout << "¿Desea jugar de nuevo?\n";
                    cin >> opcion;

                while (opcion == 'S'|| opcion == 's'){
            string original, Linea;
            char letra;
            int oportunidades = 7;

            bool acertado = false;
                Linea= A.cadena_de_Lineas(original);
                while(oportunidades>0 && !acertado)
                {
            system("cls");
                cout << endl << "Te quedan " << oportunidades << " oportunidades";
                cout << endl << "Palabra a adivinar: " << Linea;
                cout << endl << "Introduce la letra: ";
                cin >> letra;
                oportunidades--;
                acertado= A.palabra_acertada(original,Linea,letra);
                }
            if (acertado){
                cout << endl << " CORRECTO!!!, TU PALABRA es: " <<original<< endl;
            }else{
                cout << endl << " INCORRECTO!!!, la palabra CORRECTA era: " <<original<< endl;
                }

                cout << "¿Desea jugar de nuevo?\n";
                cin >> opcion;}
                return 0;
}

