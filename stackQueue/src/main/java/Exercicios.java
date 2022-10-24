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

public class Exercicios {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }



    public static void entradasQueue(){
        Queue<Integer> listaQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero inteiro: ");
            listaQueue.add(sc.nextInt());
        }

        sc.close();
    }

    public static void entradasNomesQueue(){
        Queue<String> listaQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um nome: ");
            listaQueue.add(sc.nextLine());
        }

        sc.close();
    }


    public static void entradasStack(){
        Stack<Integer> listaStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero inteiro: ");
            listaStack.push(sc.nextInt());
        }
    }

    public static void imprimeStack(Stack<Integer> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.pop());
        }
    }

    public static void imprimeQueue(Queue<Integer> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.remove());
        }
    }
}
