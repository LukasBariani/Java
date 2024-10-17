import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String nomes[] = {"Joao","Julio", "Lukas", "Daniel", "Jorge", "Gael", "Gustavo", "John", "Pedro", "Enzo", "Zenit", "Zoro", "Zenitsu", "Levi", "Eren", "Robinho", "Giuliano", "Sova", "Cassio", "Pericles"};

        // Ordenar os nomes em ordem decrescente
        Arrays.sort(nomes, Comparator.reverseOrder());

        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
    }
}
