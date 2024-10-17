import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer num[] = {37, 94, 8, 26, 52, 73, 19, 5, 83, 48, 12, 99, 63, 14, 27, 32, 76, 92, 61, 23, 57, 11, 4, 42, 33, 39, 55, 85, 72, 29, 38, 68, 17, 88, 78, 66, 70, 97, 60, 1, 24, 45, 10, 30, 91, 13, 79, 50, 74, 65, 41, 36, 9, 80, 100, 86, 7, 25, 2, 3, 53, 18, 54, 75, 49, 82, 16, 46, 15, 34, 20, 64, 59, 35, 95, 69, 87, 44, 72, 43, 81, 71, 96, 77, 40, 62, 84, 58, 65
        };

        // Ordenar os números em ordem decrescente
        Arrays.sort(num, Comparator.reverseOrder());

        // Exibir apenas números pares
        for (int i : num) {
            if (i % 2 == 0) {  // Verifica se o número é par
                System.out.print(i + " ");
            }
        }
    }
}