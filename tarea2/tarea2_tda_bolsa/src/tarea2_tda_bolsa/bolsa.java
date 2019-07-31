/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_tda_bolsa;

/**
 *
 * @author Josue
 */

class Nodo_bolsa{
    Object val;
    Nodo_bolsa siguiente;
    
    Nodo_bolsa(Object valor){
        this.val = valor;
        this.siguiente = null;
    }
}

public class bolsa {
    Nodo_bolsa primero;
    Nodo_bolsa ultimo;

    bolsa(){
        this.primero = null;
        this.ultimo = null;
    }

    bolsa insertar(Object new_objeto){
        Nodo_bolsa nuevo = new Nodo_bolsa(new_objeto);
        if(bolsa_vacia(this)){
            this.primero = nuevo;
            this.ultimo = nuevo;
            this.ultimo.siguiente = nuevo;
        }else{
            if(this.primero == this.ultimo){ // solo hay un elemento en la bolsa
                this.primero.siguiente = nuevo;
                this.ultimo = nuevo;
                this.ultimo.siguiente= primero;
            }else{ // ya hay mas de 1 elemento en la bolsa
                this.ultimo.siguiente = nuevo;
                this.ultimo = nuevo;
                this.ultimo.siguiente= primero;
            }
        }
        return this;
    }

    boolean bolsa_vacia(bolsa bolsa_verificar){
        if(bolsa_verificar.primero == null){
            return true;
        }else{
            return false;
        }
    }

    int cuantos2(bolsa bolsa_buscar , Object elemento){ // busca los elementos que el usuario ingresa
        Nodo_bolsa temp = bolsa_buscar.primero;
        int contador=0;
        
        if(bolsa_buscar.primero != null){
            do{
                if(temp.val.equals(elemento)){
                     contador++;
                }
                temp = temp.siguiente;
            }while(temp != bolsa_buscar.primero);
        }
        
        return contador;
    }
    
    int cuantos(bolsa bolsa_buscar){
        Nodo_bolsa temp = bolsa_buscar.primero;
        int contador =0;
        if(bolsa_buscar.primero != null){
            do{
                contador++;
                temp = temp.siguiente;
            }while(temp != bolsa_buscar.primero);
        }
        return contador;
    }
}
