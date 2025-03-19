public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public boolean abrirConta(String t){
     setTipo(t);
     setStatus(true);
     if (t == "CC" || t == "cc"){
         setSaldo(50);
     } else if (t == "CP" || t == "cp") {
         setSaldo(150);
     }
        return true;
    }
    public boolean fecharConta(){
        if(saldo > 0){
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta em débito");
        }else{
            setStatus(false);
        }
        return false;
    }
    public float depositar(float v){
        if (isStatus()){
        setSaldo(getSaldo() + v);
        }else{
            System.out.println("Impossivel depositar");
        }
        return 1f;
    }
    public float sacar(float v){
        if (isStatus()){
            if (v <= getSaldo()){
                setSaldo(getSaldo() - v);
            }else{
                System.out.println("Saldo Insuficiente");
            }
        }else {
            System.out.println("Conta Inválida");
        }
        return 1f;
    }
    public float pagarMensal(){
        float v = 0;
        if (getTipo() == "CC" || getTipo() == "cc"){
            v = 12;
        } else if (getTipo() == "CP" || getTipo() == "cp") {
            v = 20;
        }
        if (isStatus()){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }
        return 1f;
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getDono() {
        return dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isStatus() {
        return status;
    }
}
