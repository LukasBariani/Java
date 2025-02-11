//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double somanum = 0, dpf = 0, iaz = 0, pares = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print("Digite o "+ i + " valor: ");
            int num = scanner.nextInt();
            somanum = somanum + num;
            if ( num % 5 == 0){
                dpf++;
            }
            if (num == 0){
                iaz++;
            }
            if (num % 2 == 0){
                pares = pares + num;
            }
        }

        double media = somanum / 5;
        System.out.println("A soma dos numero é igual a "+ somanum);
        System.out.println("A media dos numeros é igual a " + media);
        System.out.println("Valores divisiveis por 5: " + dpf );
        System.out.println("Valores nulos: " + iaz);
        System.out.println("Soma dos valores pares é " + pares);
    }
}