
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class StackExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero inteiro: ");
            lista.add(sc.nextInt());
        }

        System.out.println("");

        System.out.println("Lista Stack: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(stackInt(lista));
        }

        System.out.println("");

        System.out.println("Lista em Queue: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(queueInt(lista));
            

        }

    }

    public static int stackInt(ArrayList<Integer> lista) {
        return lista.get(lista.size() - 1);
    }

    public static int queueInt(ArrayList<Integer> lista) {
        if (lista.size() >= 1) {
            return lista.get(0);
        }
        return -1;
    }
}
