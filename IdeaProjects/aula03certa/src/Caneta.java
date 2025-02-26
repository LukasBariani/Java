//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Caneta {
    public String modelo;
    public String cor;
    public double ponta;
    protected int carga;
    private boolean tampada;

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("ESTA TAMPADA");
        } else {
            System.out.println("RABISCANDO");
        }

    }

    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }
    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
