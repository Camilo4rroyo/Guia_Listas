/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopilas;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTES
 */
public class EjercicioPilas {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int[]pila = new int[5];
        
        int tope =-1;
        int opcion;
        
        do{
            System.out.println("\n -- PILA CON ARREGLOS ");
            System.out.println("1. Agragar un numero a la pila ");
            System.out.println("2. Retirar un numero de la pila ");
            System.out.println("3. Mostrar la pila ");
            System.out.println("4. Mostrar el tope ");
            System.out.println("5. SALIR ");
            System.out.println("6. OPCION ");
            opcion=teclado.nextInt();
            
            switch(opcion){
                case 1:
                    if(tope == pila.length-1){
                        System.out.println("La pila esta llena");
                    }else{
                        System.out.println("Agrega un elemento a la pila");
                        int numero =teclado.nextInt();
                        tope++;
                        pila[tope]=numero;
                    }
                    break;
                case 2:
                    if(tope==-1){
                        System.out.println("La pila esta vacia");
                    }else{
                        System.out.println("Retirar "+ pila[tope]);
                        tope--;
                    }
                    break;
                case 3:
                    if(tope==-1){
                        System.out.println("La pila esta vacia");
                    }else{
                        System.out.println("Mostrar la pila de elementos " );
                        
                        for(int i=tope; i>=0; i--){
                            System.out.println("PILA "+pila[i]);
                        }
                    }
                    break;
                case 4:
                    if(tope==-1){
                        System.out.println("La pila esta vacia");
                    }else{
                        System.out.println("Tope "+ pila[tope]);
                        tope--;
                    }
                    break;                   
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opcion!=5);
        teclado.close();
    }
}
