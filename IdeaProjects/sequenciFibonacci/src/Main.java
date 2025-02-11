//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int t1 = 0, t2 = 1;

        for (int i = 0; i <= 15; i++){
        int prox = t1 + t2;
        System.out.println(prox + " ");
        t1 = t2;
        t2 = prox;
        }
    }
}