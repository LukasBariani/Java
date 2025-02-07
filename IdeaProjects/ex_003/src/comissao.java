//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class comissao {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para pagamento de comissãoc de vendedores de peças.\n\n");

        int idvender,idpeca;
        float precoPeca,qnt,valorComissao, porsComissao=0.05f;

        System.out.println("Digite a identificação do vendedor: ");
        idvender = entrada.nextInt();

        System.out.println("DIgite a indentificação da peça: ");
        idpeca = entrada.nextInt();

        System.out.println("Digite o preço unitário da peça: ");
        precoPeca = entrada.nextInt();

        System.out.println("Digite a quantidade de peças");
        qnt = entrada.nextFloat();

        valorComissao = (precoPeca * qnt) * porsComissao;

        System.out.println("O valor da comissao é de " + valorComissao);
    }
}