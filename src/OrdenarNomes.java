import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNomes {

    public static void main(String[] args) {
        // Cria um scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria uma lista para armazenar os nomes
        ArrayList<String> nomes = new ArrayList<>();

        // Solicita ao usuário que insira os nomes
        System.out.println("Digite os nomes que deseja ordenar (digite 'fim' para terminar):");

        // Loop para adicionar nomes na lista até o usuário digitar "fim"
        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            nomes.add(nome);
        }

        // Ordena a lista de nomes em ordem alfabética
        Collections.sort(nomes);

        // Exibe os nomes ordenados
        System.out.println("\nNomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Fecha o scanner
        scanner.close();
    }
}
