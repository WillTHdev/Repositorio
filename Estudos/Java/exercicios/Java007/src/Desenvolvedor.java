public class Desenvolvedor extends Funcionarios {
    int bonus;
    String linguagem;

    public Desenvolvedor(String nome, float salario, int bonus, String linguagem){
        super(nome, salario);
        this.bonus = bonus;
        this.linguagem = linguagem;
    }

    @Override
    public String exibirDados(){
        return "Funcionario: " + getNome() +
        " | Salario: " + getSalario() +
        " | Bonus: " + bonus +
        " | Salario c/ bonus: " + ((getSalario() * bonus / 100) + getSalario()) +
        " | linguagem: " + linguagem;
    }
}