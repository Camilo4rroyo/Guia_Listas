/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopilas2;

import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author ESTUDIANTES
 */
public class EjercicioPilas2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //int[]pila = new int[5];
        LinkedList<String> pila = new LinkedList<>();
        
        //int tope =-1;
        int opcion;
        
        do{
            System.out.println("\n -- PILA CON ARREGLOS ");
            System.out.println("1. Agregar un numero a la pila ");
            System.out.println("2. Retirar un numero de la pila ");
            System.out.println("3. Mostrar la pila ");
            System.out.println("4. Mostrar el tope ");
            System.out.println("5. SALIR ");
            System.out.println("6. OPCION ");
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("\nAgrega un elemento: ");
                    String palabras = teclado.nextLine();
                    pila.push(palabras);
                    break;
                case 2:
                    if(pila.isEmpty()){
                        System.out.println("La pila esta vacia");
                    }else{
                        System.out.println("Retirar: " + pila.pop());
                    }
                    break;
                case 3:
                    if(pila.isEmpty()){
                        System.out.println("La pila esta vacia");
                    }else{
                        System.out.println("Mostrar la pila de elementos: " );
                        
                        for(String elemento : pila){
                            System.out.println("PILA: " + elemento);
                        }
                    }
                    break;
                case 4:
                    if(pila.isEmpty()){
                        System.out.println("La pila esta vacia");
                    }else{
                        System.out.println("Tope: " + pila.peek());
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
