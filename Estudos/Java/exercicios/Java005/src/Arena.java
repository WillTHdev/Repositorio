public class Arena {
    public static void main(String[] args) {
        Querreiro querreiro = new Querreiro("Will", 10, 100);
        Mago mago = new Mago("Livia", 10, 100);

        System.out.println(querreiro.getAllInformations());
        System.out.println(mago.getAllInformations());
    }
}
