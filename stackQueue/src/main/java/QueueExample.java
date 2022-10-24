import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author TiagoFernandes
 */
// Desenvolva um programa que leia 5 numeros e imprima-os na ordem das entradas. Utilize uma Queue

// Desenvolva um programa que leia 5 nomes e imprima-os, considerando a ordem de chegada.


public class QueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> lista = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero inteiro: ");
            lista.add(sc.nextInt());
        }
        System.out.println("");
        System.out.println("Lista em Queue: ");

        for (int i = 0; i < 5; i++) {
            System.out.println(lista.remove());
        }
        sc.close();
    }
}
