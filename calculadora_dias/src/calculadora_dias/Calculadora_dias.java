/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_dias;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Calculadora_dias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-----------Calcular dia de la fecha-----------");
        System.out.println(" ingrese la fecha desde el año 1700, con el siguiente formato dd/mm/aaaa");
         String entrada = "";

        Scanner entrada_teclado = new Scanner (System.in); //leer la fecha desde el teclado
        entrada = entrada_teclado.nextLine (); 
        
        
        
        System.out.println(calcular_dia(entrada));
    }
    
    public static String calcular_dia(String fecha_entrada){ // implementacion del algoritmo de doomsday
        String resultado="";
        String[] fecha = fecha_entrada.split("/"); // separar los datos de la fecha por dia, mes y año
        String dia = fecha[0];
        String mes = fecha[1];
        String year = fecha[2];
        //Variables del algoritmo
        int S=0;
        int A =0;
        int B=0;
        int M=0;
        int D=0;
        int R =0;
        
        // valor para siglo S
            if(Integer.parseInt(year)< 1800 && Integer.parseInt(year) >= 1700){
                S=5;
            }else if(Integer.parseInt(year)>= 1800 && Integer.parseInt(year) < 1900){
                S = 3;
            }else if(Integer.parseInt(year)>= 1900 && Integer.parseInt(year) < 2000){
                S= 1;
            }else if(Integer.parseInt(year)>= 2000 && Integer.parseInt(year) < 2100){
                S=0;
            }else if(Integer.parseInt(year)>= 2100 && Integer.parseInt(year) < 2200){
                S= -2;
            }else{
                S = -4;
            }
            
        // valor para el año A
            String ultimos = year.substring(2, 4);
            int ult = Integer.parseInt(ultimos);
            A = ult + (ult/4);
        
        //verificar si el año es bisiesto
        int anio = Integer.parseInt(year);
        boolean bisiesto = false;
            if(ult !=0){
                if(anio%4 == 0){
                    bisiesto = true;
                }
            }else{
                if(anio%400 == 0){
                    bisiesto = true;
                }
            }
           
           if(bisiesto == true){
               if(Integer.parseInt(mes)==1 || Integer.parseInt(mes)==2){
                   B=1;
               }
           }
    // verificar el mes 
        M = verificar_mes(Integer.parseInt(mes));
        
    // verificar dia
        D = Integer.parseInt(dia);
        
    // resultado en numeros 
    
    R= S+A+B+M+D;
    
    while( R>6){// se resta 7 que es el numero de dias en la semana
        R = R-7;
    }   
        return Respuesta_dia(R);
    }
    
    public static String Respuesta_dia(int dia){
        switch (dia){
            case 0:
                return "Domingo";
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "sabado";
            default:
                return "error";
        }
    }
    
    public static int verificar_mes(int mes){
        int M=0;
        switch (mes){
            case 1:
                M = 6;
                break;
            case 2:
                M = 2;
                break;
            case 3:
                M = 2;
                break;
            case 4:
                M = 5;
                break;
            case 5:
                M = 0;
                break;
            case 6:
                M = 3;
                break;
            case 7:
                M = 5;
                break;
            case 8:
                M = 1;
                break;
            case 9:
                M = 4;
                break;
            case 10:
                M = 6;
                break;
            case 11:
                M = 2;
                break;
            case 12:
                M = 4;
                break;
        }
        return M;
    }
}
