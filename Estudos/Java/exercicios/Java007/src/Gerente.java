public class Gerente extends Funcionarios {
    int bonus;

    public Gerente(String nome, float salario, int bonus){
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public String exibirDados(){
        return "Funcionario: " + getNome() +
        " | Salario: " + getSalario() +
        " | Bonus: " + bonus +
        "| Salario c/ bonus: " + ((getSalario() * bonus / 100) + getSalario());
    }
}