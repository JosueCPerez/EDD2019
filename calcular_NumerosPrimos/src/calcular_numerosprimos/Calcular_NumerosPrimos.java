/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular_numerosprimos;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Calcular_NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
         System.out.println("-----------Calcular Números Primos-----------");
        System.out.println("->ingrese un entero positivo para calcular todos los numeros primos hasta ese numero");
         String entrada = "";
        Scanner entrada_teclado = new Scanner (System.in); 
        entrada = entrada_teclado.nextLine (); 
        
        
        if(Integer.parseInt(entrada)>0){
            System.out.println("-- Números Primos --");
            System.out.println(1);
            imprimir_primos(Integer.parseInt(entrada));
        }else{
            System.out.println("no se pudo calcular los numeros primos, ingrese un numero mayo a 0");
        }
        
        
    }
    
    static void imprimir_primos(int limite){
        for(int i =0; i<=limite; i++){ // se recorren todos los numeros apartir del cero hasta el limite 
            int cont=0;
            for(int j = i; j > 0; j--){ // se recorren los numeros desde el numero actual hasta cero y se divide
                if(i % j == 0 ){        // si es divicion exacta se le suma 1 al contador de divisores
                    cont++;
                }
            }
            if(cont == 2){ // si el contador es 2, significa que solo fue dividido entre 1 y el mismo, por lo tanto es primo
                System.out.println(i);
            }
        }
    }
}
