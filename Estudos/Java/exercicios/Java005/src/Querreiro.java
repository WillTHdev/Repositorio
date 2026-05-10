public class Querreiro extends Personagem {
    private int forca;

    public Querreiro(String nome, int nivel, int forca){
        super(nome, nivel);
        this.forca = forca;
    }

    public String getAllInformations(){
        return getInformacoes() + " | Força: " + forca + " | Classe: Querreiro";
    }
}