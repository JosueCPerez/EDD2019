#include "nodo_actividad.h"

nodo_actividad::nodo_actividad(string act)
{
    actividad = act;
    sig = NULL;
    ant = NULL;
}
