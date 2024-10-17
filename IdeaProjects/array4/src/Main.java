import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer num[] = {23, 47, 12, 36, 5, 18, 29, 7, 50, 34, 42, 3, 19, 9, 31, 21, 44, 26, 1, 30, 25, 15, 11, 40, 16, 49, 6, 32, 48, 4, 37, 8, 17, 45, 22, 41, 13, 38, 10, 27, 2, 33, 14, 35, 24, 20, 28, 39, 46, 43
        };

        // Ordenar os números em ordem decrescente
        Arrays.sort(num, Comparator.reverseOrder());

        // Exibir apenas números pares
        for (int i : num) {
            System.out.print(i + ", ");
        }
    }
}