import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author TiagoFernandes
 */

 // Desenvolva um programa que leia 5 numeros e imprima-os na ordem em contraria das entradas. Utilizando um Stack


public class StackExemple {
    
    public static void main(String[] args) {
        Stack<Integer> listaStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero inteiro: ");
            listaStack.push(sc.nextInt());
        }
        
        System.out.println("\nLista em Stack: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(listaStack.pop());
        }
        sc.close();
    }
}
