package ExercicioVetores2;

public class Produto {

    //Atributos da classe produto:
    private String nome;
    private double preco;

    //construtores:
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Geters e seters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //ToString:
    public String toString() {
        String s = "Preço da "
                + nome
                + ": "
                + String.format("$%.2f", preco);
        ;
        return s;
    }
}