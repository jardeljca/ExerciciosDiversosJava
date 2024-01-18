package composicaoEnumDadosCliente;

public class ItemPedido {
    private int quantidade;
    private double preco;
    private Produto produto;

    //  Constructors:
    public ItemPedido() {
    }
    public ItemPedido(int quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    //Geters e Seters:
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    //metodo subtotal:
    public double subTotal(){
        return preco*quantidade;
    }
    @Override
    public String toString() {
        return getProduto().getProduto()
                + ", $"
                + String.format("%.2f", preco)
                + ", quantidade: "
                + quantidade
                + ", subtotal: $"
                + String.format("%.2f", subTotal())
                ;
    }
}
