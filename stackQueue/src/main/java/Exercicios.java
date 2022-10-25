package main.java;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author TiagoFernandes
 */

 // Desenvolva um programa que leia 5 numeros e imprima-os na ordem em contraria das entradas. Utilizando um Stack

 // Desenvolva um programa que leia 5 numeros e imprima-os na ordem das entradas. Utilize uma Queue

 // Desenvolva um programa que leia 5 nomes e imprima-os, considerando a ordem de chegada.

public class Exercicios {

    public static void main(String[] args) {
        System.out.println("Exercício 1: ");
        imprimeStack(entradasStack());

        System.out.println("Exercício 2: ");
        imprimeQueue(entradasQueue());

        System.out.println("Exercício 3: ");
        imprimeQueueNome(entradasNomesQueue());

    }



    public static Queue<Integer> entradasQueue(){
        Queue<Integer> listaQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero inteiro: ");
            listaQueue.add(sc.nextInt());
        }
        return listaQueue;
    }

    public static Queue<String> entradasNomesQueue(){
        Queue<String> listaQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        for(int i = 0; i < 5; i++){
            System.out.print("Digite um nome: ");
            listaQueue.add(sc.nextLine());
        }
        return listaQueue;
    }


    public static Stack<Integer> entradasStack(){
        Stack<Integer> listaStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero inteiro: ");
            listaStack.push(sc.nextInt());
        }
        return listaStack;
    }

    public static void imprimeStack(Stack<Integer> lista){
        for(int i = 0; i < 5; i++){
            System.out.println(lista.pop());
        }
    }

    public static void imprimeQueue(Queue<Integer> lista){
        for(int i = 0; i < 5; i++){
            System.out.println(lista.remove());
        }
    }

    public static void imprimeQueueNome(Queue<String> lista){
        for(int i = 0; i < 5; i++){
            System.out.println(lista.remove());
        }
    }
}
