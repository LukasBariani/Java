public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade,float altura,float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public void apresentar(){
        System.out.println("-----Apresentação-----");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println("Pesando " + getPeso() + " kg");
        System.out.println("Ganhou " + getVitorias() + " lutas");
        System.out.println("Perdeu " + getDerrotas() + " lutas");
        System.out.println("Empatou " + getEmpates() + " lutas");
        System.out.println("-----Apresentação-----");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(this.categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {

        if (peso < 52.2f){
            categoria = "Inválido";
        } else if (peso <= 70.3f) {
            categoria = "Leve";
        }else if (peso <= 83.9f) {
            categoria = "Médio";
        } else if (peso <= 120.2) {
            categoria = "Pesado";
        }else {
            categoria = "Inválido";
        }
        this.categoria = categoria;
    }

    public void status(){
        System.out.println("---statusLutador---");
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println("---statusLutador---");
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
