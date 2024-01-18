package composicaoEnumDadosCliente;

public class Produto {
    private String nomeProduto;
    private double preco;

    //Construtores:
    public Produto() {
    }

    public Produto(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    //Geters e Seters:
    public String getProduto() {
        return nomeProduto;
    }

    public void setProduto(String produto) {
        this.nomeProduto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
