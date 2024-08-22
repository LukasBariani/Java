//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos copos de cerveja você tomou?");
        int copos = scanner.nextInt();

        System.out.println("Quantas doses de pinga você tomou?");
        int pingas = scanner.nextInt();

        if (pingas > copos || pingas > 10) {

            System.out.println("Parabéns, você é um bebado nato");

        }else{

            System.out.println("Você esta num bar, seu bebezinho");

        }

    }
}