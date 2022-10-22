
import java.util.ArrayList;
import java.util.Scanner;

public class StacQueuekExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero inteiro: ");
            lista.add(sc.nextInt());
        }

        ArrayList<Integer> lista1 = new ArrayList<>(lista);
        ArrayList<Integer> lista2 = new ArrayList<>(lista);

        System.out.println("");
        System.out.println("Lista Stack: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(stackInt(lista1));
        }

        System.out.println("");
        System.out.println("Lista em Queue: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(queueInt(lista2));
        }
    }

    public static int stackInt(ArrayList<Integer> lista) {
        return lista.remove(lista.size() - 1);
    }

    public static int queueInt(ArrayList<Integer> lista) {
        if (lista.size() >= 1) {
            return lista.remove(0);
        }
        return -1;
    }
}
