package PolimorfismoProdutos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ProdutosUsados extends Produtos {
    private LocalDate dataFabricacao;

    public ProdutosUsados(String nome, double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String precoTag(){
        return getNome()
                + " (usado) $ "
                + String.format("%.2f", getPreco())
                + "- fabricado em: "
                + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
