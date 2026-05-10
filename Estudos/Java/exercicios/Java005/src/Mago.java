public class Mago extends Personagem {
    private int inteligencia;

    public Mago(String nome, int nivel, int inteligencia){
        super(nome, nivel);
        this.inteligencia = inteligencia;
    }

    public String getAllInformations(){
        return getInformacoes() + " | Inteligência: " + inteligencia + " | Classe: Mago";
    }
}