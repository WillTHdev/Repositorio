public class Main {
    public static void main(String[] args) {
        Funcionarios func001 = new Funcionarios("Paulo", 1500);
        Funcionarios func002 = new Gerente("Livia", 1500, 50);
        Funcionarios func003 = new Desenvolvedor("Will", 1500, 25, "Java");

        System.out.println(func001.exibirDados());
        System.out.println(func002.exibirDados());
        System.out.println(func003.exibirDados());
    }
}