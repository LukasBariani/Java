import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inicio = 4000;
        int fim = 6000;
        int cnt = 0;

        while (inicio<fim){
            cnt++;
            inicio++;
        }
        System.out.println(cnt);
    }
}