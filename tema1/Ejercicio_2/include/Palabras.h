#ifndef PALABRAS_H
#define PALABRAS_H
#include <iostream>
#include <cstdlib>
#include <vector>
#include <ctime>



using namespace std;


class Palabras
{
    public:
        Palabras() {}

            string cadena_de_Lineas(string &cadena)
                    {
                    string Guion;
                    int i;
                    cadena = Palabra_alea();
                    Guion.clear();
                    for(i=0;i<cadena.size();i++)
                    Guion+= '-' ;
                    system("cls");
                    return Guion;
                    }

            bool palabra_acertada(string original, string &cad_averiguar, char letra)
                    {
                    int i;
                    for(i=0;i<original.size();i++)
                    if(original[i]==letra)
                    cad_averiguar[i]=letra;
                    return (original==cad_averiguar);
                    }

            string Palabra_alea(){
                    vector<string>Palabn;
                    Palabn.push_back("sandia");
                    Palabn.push_back("manzana");
                    Palabn.push_back("pera");
                    Palabn.push_back("uva");
                    Palabn.push_back("zanahoria");
                    Palabn.push_back("chayote");
                    Palabn.push_back("fresa");
                    Palabn.push_back("calabaza");
                    Palabn.push_back("kiwi");
                    Palabn.push_back("arandano");
                    Palabn.push_back("ajo");
                    Palabn.push_back("naranja");
                    Palabn.push_back("guayaba");
                    Palabn.push_back("ciruela");
                    Palabn.push_back("durazno");

                    return Palabn[NumeroPala()];
                    }

            int NumeroPala(){
                int numero;
                srand (time(NULL));
                numero = rand() % 15;
                return numero;
            }

    protected:

    private:
};

#endif // PALABRAS_H
