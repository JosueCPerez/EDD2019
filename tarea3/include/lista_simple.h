#ifndef LISTA_SIMPLE_H
#define LISTA_SIMPLE_H
#include "nodo_dia.h"

class lista_simple
{
    nodo_dia * primero;

    public:
        lista_simple();
        void insertar(string dia , string actividad);
        void imprimir_valores();


};

#endif // LISTA_SIMPLE_H
