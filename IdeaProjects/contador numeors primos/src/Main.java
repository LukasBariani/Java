import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int n = scanner.nextInt();

        int div = 0; // Contador de divisores

        // Percorre de 1 até n
        for (int c = 1; c <= n; c++){
            System.out.println(c);
            if (n % c == 0 ){
                div++;
            }
        }
        // Verifica se é primo com base no número de divisores
        if (div == 2) { // Divisores de um primo: 1 e ele mesmo
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}