//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class estoque_medio {
    public static void main(String[] args) {
    Scanner entrada =  new Scanner(System.in);
    double qnt_minima, qnt_max, estoque_medio;

        System.out.println("Calculadora estoque Médio\n\n");

        System.out.println("Digite a quantidade mínima: ");
        qnt_minima = entrada.nextDouble();

        System.out.println("Digite a quantidade máxima: ");
        qnt_max = entrada.nextDouble();

        estoque_medio = (qnt_max + qnt_minima) / 2;
        System.out.println("O estoque médio é igual a: " + estoque_medio + "\n");

    }
}