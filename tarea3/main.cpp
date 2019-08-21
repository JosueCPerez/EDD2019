#include <iostream>
#include<stdlib.h>
#include "lista_simple.h"
using namespace std;

int main()
{
    lista_simple * lista = new lista_simple();
    int opciones =0;
    string dia="";
    string actividad="";
    cout << "AGENDA DE ACTIVIDADES" << endl;
    while(opciones !=3){
            cout << "  " << endl;
        cout << "1. insertar actividad" << endl;
        cout << "2. ver agenda" << endl;
        cout << "3. salir" << endl;
        cin >> opciones;

        if(opciones == 1){
            dia="";
            actividad="";
            cout << "  " << endl;
            cout << " -ingrese el dia" << endl;
            cin >> dia;
            cout << "  -ingrese la actividad (sin espacios en blanco)" << endl;
            cin >> actividad;
            lista->insertar(dia,actividad);
            dia="";
            actividad="";
        }else if(opciones == 2){
            cout << "  " << endl;
            lista->imprimir_valores();
        }else{
            break;
        }
    }
cout << "  " << endl;
    return 0;
}
