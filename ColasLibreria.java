/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colaslibreria;

/**
 *
 * @author ESTUDIANTES
 */

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;

public class ColasLibreria {

    public static void main(String[] args) {
        System.out.println("Ejercicios Colas con libreria de Java\n");
        Colasimple();
        Colacircular();
        ColaPrioridad();
        Coladoble();
    }
    
    static void Colasimple(){
        System.out.println("Ejercicios Colas Simple: Primero en llegar, primero en salir");
        Queue<String> java = new ArrayDeque<>();
        java.offer("ANA");
        java.offer("VIVIANA");
        java.offer("LEINER");
        java.offer("KALI");
        System.out.println("Java: " + java.poll() + ", " + java.poll()+", "+java.poll()+", "+java.poll() + "\n");
    }
    static void Colacircular(){
        System.out.println("Ejercicios Colas Circular: Reutiliza los espacios del arreglo");
        Queue<String> java = new ArrayDeque<>();
        java.offer("ANA");
        java.offer("VIVIANA");
        java.offer("JACKIE");
        java.offer("KALI");
        System.out.println("SALE: " + java.poll());
        java.offer("ABIGAIL");
        System.out.println("Java: " + java.poll() + ", " + java.poll()+", "+java.poll()+", "+java.poll() + "\n");
    }
    static void ColaPrioridad(){
        System.out.println("Ejercicios Colas Prioridad: El menor numero se atiende primero");
        Queue<Integer> java = new PriorityQueue<>();
        java.offer(5);
        java.offer(2);
        java.offer(3);
        java.offer(6);
        System.out.println("SALE: " + java.poll());
        java.offer(7);
        System.out.println("Java: " + java.poll() + ", " + java.poll()+", "+java.poll()+", "+java.poll() + "\n");
    }
    static void Coladoble(){
        System.out.println("Ejercicios Colas Coble(DEQUE): Permite usar ambos extremos");
        Deque<String> java = new ArrayDeque<>();
        java.offerLast("ANA");
        java.offerLast("VIVIANA");
        java.offerFirst("JACKIE");
        java.offerFirst("KALI");
        
        System.out.println("Java:  Sale del Inicio " + java.pollFirst() + ", Sale del Final " + java.pollLast());
    }
}
