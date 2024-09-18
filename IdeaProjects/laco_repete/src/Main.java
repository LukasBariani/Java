import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();

        int i = 1;

        while (i<=10){
            System.out.println(num1 + "x" + i + "=" + (i*num1));
            i++;
        }

    }
}