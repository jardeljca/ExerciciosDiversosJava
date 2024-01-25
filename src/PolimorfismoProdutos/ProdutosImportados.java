package PolimorfismoProdutos;

public class ProdutosImportados extends Produtos{
    private double custosImportacao;

    public ProdutosImportados(String nome, double preco, double custosImportacao) {
        super(nome, preco);
        this.custosImportacao = custosImportacao;
    }

    public double getCustosImportacao() {
        return custosImportacao;
    }

    public void setCustosImportacao(double custosImportacao) {
        this.custosImportacao = custosImportacao;
    }

    public double precoTotal(){
        return getPreco() + custosImportacao;
    }
    @Override
    public String precoTag(){
        return getNome()
                + " $ "
                + String.format("%.2f", precoTotal())
                + "- Custos de importação: "
                + String.format("%.2f", custosImportacao);
    }
}
