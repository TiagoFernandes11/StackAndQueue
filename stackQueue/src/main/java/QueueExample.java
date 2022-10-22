
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TiagoFernandes
 */
public class QueueExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero inteiro: ");
            lista.add(sc.nextInt());
        }

        System.out.println("");
        System.out.println("Lista em Queue: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(queueInt(lista));
        }
    }

    public static int queueInt(ArrayList<Integer> lista) {
        if (lista.size() >= 1) {
            return lista.remove(0);
        }
        return 0;
    }

}
