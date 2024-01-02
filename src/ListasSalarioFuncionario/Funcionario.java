package ListasSalarioFuncionario;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(){//Construtor vazio
    }
    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void incrementarSalario (double porcentagem){
        salario += salario*porcentagem/100;
    }

    @Override
    public String toString() {
        return "id: " + id + " - nome: " + nome + " - salário: " + String.format("%.2f", salario);
    }
}
