#include "lista_simple.h"

lista_simple::lista_simple()
{
    primero= NULL;
}
void lista_simple::insertar(string dia , string actividad){
nodo_dia * nuevo = new nodo_dia(dia);

    if(primero== NULL){
        primero = nuevo;
        nuevo->insertar_actividad(actividad);
    }else{
        nodo_dia * pivote = primero;
        nodo_dia * pivote_ant = primero;

       while(pivote != NULL){
           if(pivote->indice_dia == nuevo->indice_dia){
                pivote->insertar_actividad(actividad);
                break;
           }else if( nuevo->indice_dia < pivote->indice_dia){
                if(pivote == primero){
                    nuevo->sig = primero;
                    primero= nuevo;
                    nuevo->insertar_actividad(actividad);
                    break;
                }else{
                    pivote_ant->sig = nuevo;
                    nuevo->sig = pivote;
                    nuevo->insertar_actividad(actividad);
                    break;
                }
           }else if( nuevo->indice_dia > pivote->indice_dia){
               if(pivote->sig == NULL){
                    pivote->sig = nuevo;
                     nuevo->insertar_actividad(actividad);
                     break;
               }
               
           }
           pivote_ant = pivote;
           pivote = pivote->sig;
       }
    }
}

void lista_simple::imprimir_valores(){
    if(primero == NULL){
         cout << "la lista esta vacia" << endl;
    }else{
        nodo_dia * pivote = primero;
        while(pivote != NULL){
            cout << "->dia: "<<pivote->dia << endl;
                
                cout << "   Actividades: " << endl;
                nodo_actividad * pivote_actividad = pivote->primero;
                while(pivote_actividad != NULL){
                         cout << "     - " <<pivote_actividad->actividad << endl;
                         pivote_actividad= pivote_actividad->sig;
                }
            pivote = pivote->sig;
        }
    }
}
