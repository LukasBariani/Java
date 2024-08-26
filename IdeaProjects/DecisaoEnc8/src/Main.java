import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos lados A, B e C
        System.out.print("Digite o valor do lado A (em cm): ");
        double A = scanner.nextDouble();
        System.out.print("Digite o valor do lado B (em cm): ");
        double B = scanner.nextDouble();
        System.out.print("Digite o valor do lado C (em cm): ");
        double C = scanner.nextDouble();

        // Verificação se os valores formam um triângulo
        if (A + B > C && A + C > B && B + C > A) {
            // Determinação do tipo de triângulo
            if (A == B && B == C) {
                System.out.println("Os lados compõem um triângulo equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("Os lados compõem um triângulo isósceles.");
            } else {
                System.out.println("Os lados compõem um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não compõem um triângulo.");
        }


    }
}