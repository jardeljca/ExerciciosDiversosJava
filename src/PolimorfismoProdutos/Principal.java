package PolimorfismoProdutos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int qtdProdutos = sc.nextInt();

        List<Produtos> lista = new ArrayList<>();

        for (int i = 0; i < qtdProdutos; i++) {
            System.out.println("Dados do " + (i+1) + "° produto:");
            System.out.print("Produto é novo, usado ou importado? (n, u, i): ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            if (tipo == 'n') {
                Produtos produtos = new Produtos(nome, preco);
                lista.add(produtos);
            }
            else if (tipo == 'u') {
                System.out.print("Data de fabricação (dd/mm/aaaa): ");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                ProdutosUsados PU = new ProdutosUsados(nome, preco, data);
                lista.add(PU);
            }
            else{
                System.out.print("Qual valor do custo de importação? ");
                double custoImportacao = sc.nextDouble();
                ProdutosImportados PI = new ProdutosImportados(nome, preco, custoImportacao);
                lista.add(PI);
            }
        }

        System.out.println("Etiqueta de preços:");
        for(Produtos prod: lista){
            System.out.println(prod.precoTag());
        }

        sc.close();
    }
}
