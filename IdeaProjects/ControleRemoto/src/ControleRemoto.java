public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("----------menu---------");
            System.out.println("Esta ligado: " + this.isLigado());
            System.out.println("Esta tocando: " + this.isTocando());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i < this.getVolume(); i += 10) {
                System.out.print("<>");
            }
        }else {
            System.out.println("TV DESLIGADA");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Fechando menu");
        }else {
            System.out.println("TV DESLIGADA");
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            setVolume(getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            setVolume(getVolume() - 10);
        }else{
            System.out.println("TV DESLIGADA");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() || this.getVolume() > 0){
            this.setVolume(0);
        }else {
            System.out.println("IMPOSSIVEL DEIXAR MUDO");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() || this.getVolume() == 0){
            setVolume(50);
        }else{
            System.out.println("IMPOSSIVEL DEIXAR MUDO");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }else{
            System.out.println("IMPOSSIVEL DAR PLAY");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else {
            System.out.println("IMPOSSIVEL PAUSAR");
        }
    }
}
