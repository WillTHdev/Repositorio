public class Main {
    public static void main(String[] args) {
        Pedidos p_01 = new Pedidos(1);
        p_01.addItem("Batata-Frita", 2, 5.90f);
        p_01.addItem("Coca-cola 269ml", 1, 4.90f);

        p_01.listarPedido();

        Pedidos p_02 = new Pedidos(2);
        p_02.addItem("Hamburger X-Salada", 1, 9.90f);
        p_02.addItem("Coca-cola 269ml", 1, 4.90f);
        p_02.addItem("Batata-Frita", 1, 5.90f);

        p_02.listarPedido();
    }
}