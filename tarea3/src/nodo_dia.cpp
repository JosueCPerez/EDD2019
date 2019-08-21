#include "nodo_dia.h"
#include<iostream>
#include<string>
using namespace std;

nodo_dia::nodo_dia(string dato)
{
    dia= dato;
    sig= NULL;
    primero = NULL;

  if(dato=="lunes"){
    indice_dia=1;
  }else if(dato=="martes"){
    indice_dia=2;
  }else if(dato==("miercoles")){
    indice_dia=3;
  }else if(dato==("jueves")){
    indice_dia=4;
  }else if(dato==("viernes")){
    indice_dia=5;
  }else if(dato==("sabado")){
    indice_dia=6;
  }else if(dato==("domingo")){
    indice_dia=7;
  }

}

void nodo_dia::insertar_actividad(string actividad){
    nodo_actividad * nuevo = new nodo_actividad(actividad);

    nodo_actividad * pivote = primero;

    if(pivote == NULL){
        primero = nuevo;
    }else if(primero->sig == NULL){
        primero->sig = nuevo;
        nuevo->ant = primero;
    }else{
        while(pivote != NULL){
            if(pivote->sig == NULL){
                pivote->sig = nuevo;
                nuevo->ant = pivote;
                break;
            }
            pivote = pivote->sig;
        }
    }
}
