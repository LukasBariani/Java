//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class ConvertDolarReal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cot_dolar, valor_dolar, valor_real;

        System.out.println("-----Conversor de dolar em real-----\n\n");

        System.out.println("Digite a cotação do dolar");
        cot_dolar = entrada.nextDouble();

        System.out.println("Digite o valor em dolar: ");
        valor_dolar = entrada.nextDouble();

        valor_real = cot_dolar * valor_dolar;

        System.out.println("O valor de " + valor_dolar + " dolar(es) em reais é " + valor_real +" reais");

    }
}