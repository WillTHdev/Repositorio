public class Funcionarios {
    private String nome;
    private float salario;

    public Funcionarios(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String exibirDados(){
        return "Funcionario: " + nome +
        " | Salario: " + salario;
    }

    public float getSalario(){
        return salario;
    }

    public String getNome(){
        return nome;
    }
}