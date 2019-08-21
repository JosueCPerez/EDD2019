#ifndef NODO_ACTIVIDAD_H
#define NODO_ACTIVIDAD_H
#include <iostream>
#include<stdlib.h>
#include <string>
using namespace std;

class nodo_actividad
{
    public:
        string actividad;
        nodo_actividad * sig;
        nodo_actividad * ant;
        nodo_actividad(string act);

    protected:

    private:
};

#endif // NODO_ACTIVIDAD_H
