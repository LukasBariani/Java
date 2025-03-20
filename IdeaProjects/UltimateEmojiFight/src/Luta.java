import java.util.Random;

public class Luta {

    private Lutador desafiado, desafiante;
    private int rounds = 3;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            setAprovada(true);
            setDesafiante(l1);
            setDesafiado(l2);
            System.out.println("Luta marcada com sucesso");
        }else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
            System.out.println("Luta nao marcada");
        }
    }

    public void lutar(){
        if (isAprovada()){
            Random random = new Random();
            desafiado.apresentar();
            desafiante.apresentar();
            int rg1 = 0;
            int rg2 = 0;
            int vencedor = 0;
            for (int i = 0; i < rounds; i++) {
                 vencedor = random.nextInt(3);
                System.out.println("---Luta---");
                switch (vencedor){
                    case 0:
                        System.out.println("round Empatado");
                        break;
                    case 1:
                        System.out.println("Lutador " + desafiante.getNome() + " ganhou um round");
                        rg1++;
                        break;
                    case 2:
                        System.out.println("Lutador " + desafiado.getNome() + " ganhou um round");
                        rg2++;
                        break;
                }
            }

            if (rg1  > rg2){
                System.out.println("O lutador " + desafiante.getNome() + " GANHOU A LUTA!" );
                desafiante.ganharLuta();
                System.out.println("---Luta---");
            } else if (rg2 > rg1 ) {
                System.out.println("O lutador " + desafiado.getNome() + " GANHOU A LUTA!" );
                desafiado.ganharLuta();
                System.out.println("---Luta---");
            }else {
                System.out.println(" A luta deu Empate");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                System.out.println("---Luta---");
            }

        }else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
