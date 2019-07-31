/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_tda_bolsa;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Tarea2_tda_bolsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bolsa nueva_bolsa = new bolsa();
        int opcion=10;
        
        while(opcion!=0){
            System.out.print("1. insertar elemento en la bolsa \n"
                    + "2. verificar si la bolsa esta vacia \n"
                    + "3. buscar elementos en la bolsa (cuantos hay) \n"
                    + "4. cuantos elementos en total hay en la bolsa \n"
                    + "0. salir \n");
            Scanner entrada_teclado = new Scanner (System.in); 
            Object entrada = entrada_teclado.nextLine(); 
            System.out.print(entrada);
            
            opcion = Integer.parseInt((String) entrada);
            
            
            switch (opcion){
            case 0:
                break;
            case 1:
                System.out.println("ingrese el elemento a insertar en la bolsa:");
                 entrada_teclado = new Scanner (System.in); 
                 entrada = entrada_teclado.nextLine(); 
                 nueva_bolsa = nueva_bolsa.insertar(entrada);
                 break;
            case 2:
                if(nueva_bolsa.bolsa_vacia(nueva_bolsa)){
                    System.out.println(" \n ----> La bolsa esta vacia \n");
                }else{
                    System.out.println("\n ----> La bolsa NO esta vacia \n");
                }
                break;
            case 3:
                System.out.println("\n  ingrese el elemento a buscar en la bolsa:");
                entrada_teclado = new Scanner (System.in); 
                entrada = entrada_teclado.nextLine(); 
                
                int cuantos = nueva_bolsa.cuantos2(nueva_bolsa, entrada);
                System.out.println("\n ----> hay "+ cuantos+" objetos de " + entrada.toString()+" en la bolsa \n");
                break;
            case 4:
                 cuantos = nueva_bolsa.cuantos(nueva_bolsa);
                System.out.println("\n ----> hay "+ cuantos + " elementos en la bolsa \n");
            }
        }
    }
    
}
