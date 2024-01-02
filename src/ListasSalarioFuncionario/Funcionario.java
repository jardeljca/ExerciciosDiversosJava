package ListasSalarioFuncionario;

public class Funcionario {

    private final Integer id;
    private String nome;
    private Double salario;

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

    public void incrementarSalario (double porcentagem){
        salario += salario*porcentagem/100;
    }

    @Override
    public String toString() {
        return "id: " + id + " - nome: " + nome + " - salário: " + String.format("%.2f", salario);
    }
}
