package PolimorfismoContribuintes;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de contribuintes: ");
        int numContribuintes = sc.nextInt();

        List<Contribuinte> lista = new ArrayList<>();

        for (int i = 0; i < numContribuintes; i++) {
            System.out.println("Dados do " + (i+1) + "° contribuinte:");
            System.out.print("O " + (i+1) + "° contribuinte é uma pessoa física ou jurídica? (f/j) ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite a renda anual: ");
            double rendaAnual =  sc.nextDouble();
            if (tipo == 'f'){
                System.out.print("Gastos com Saúde: ");
                double gastoSaude = sc.nextDouble();
                PessoaFisica pessoaFisica = new PessoaFisica(nome, rendaAnual, gastoSaude);
                lista.add(pessoaFisica);
            }
            else{
                System.out.print("Qual a quantidade de funcionários? ");
                int numeroFuncionarios = sc.nextInt();
                PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
                lista.add(pessoaJuridica);
            }
        }


        double somaTaxa = 0;
        System.out.print("");
        System.out.println("Contribuintes:");
        for(Contribuinte cont: lista){
            somaTaxa = somaTaxa + cont.taxa();
            System.out.printf("%S: $%.2f\n",cont.getNome(), cont.taxa());
        }
        System.out.printf("Total de taxas: %.2f", somaTaxa);

        sc.close();
    }
}
