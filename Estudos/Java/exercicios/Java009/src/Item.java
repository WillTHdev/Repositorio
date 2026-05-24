public class Item {
    private String nomeItem;
    private int qtdItem;
    private float precoItem;

    public Item(String nomeItem, int qtdItem, float precoItem){
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
    }

    public float getSubtotal(){
        return qtdItem * precoItem;
    }

    public void infoItens(){
        System.out.println("Item: " + nomeItem + " | Quantidade: " + qtdItem + " | Preço unitário: R$" + precoItem);
    }
}