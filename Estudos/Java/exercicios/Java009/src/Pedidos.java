import java.util.ArrayList;
import java.util.List;

public class Pedidos{
    private int ID;
    private List<Item> itens;

    public Pedidos(int ID){
        this.ID = ID;
        this.itens = new ArrayList<>();
    }

    public void addItem(String nomeItem, int qtdItem, float precoItem){
        itens.add(new Item(nomeItem, qtdItem, precoItem));
    }

    public float totalPedido(){
        float total = 0;
        for(Item item : itens){
            total += item.getSubtotal();
        }

        return total;
    }

    public void listarPedido(){
        System.out.println("Pedido #" + ID);
        for(Item p : itens){
            p.infoItens();
        }
        System.out.printf("Total: R$ %.2f \n\n", totalPedido());
    }
}