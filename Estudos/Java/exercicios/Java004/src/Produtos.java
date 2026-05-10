public class Produtos {
    private String nomeProduto;
    private double preco;
    private int quantidade;

    public Produtos(String nomeProduto, double preco, int quantidade){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return "Produto: " + nomeProduto + " preco: " + preco + " quantidade: " + quantidade;
    }
