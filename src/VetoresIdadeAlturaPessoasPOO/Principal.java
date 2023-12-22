package VetoresIdadeAlturaPessoasPOO;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = sc.nextInt();

        Pessoas [] vetor = new Pessoas[qtdPessoas];
        for(int i = 0; i<qtdPessoas; i++){
            sc.nextLine();
            System.out.printf("Digite o nome da %d° pessoa: ", i+1);
            String nome = sc.nextLine();
            System.out.printf("Digite a idade da %d° pessoa: ", i+1);
            int idade = sc.nextInt();
            System.out.printf("Digite altura da %d° pessoa: ", i+1);
            double altura = sc.nextDouble();
            vetor[i] = new Pessoas(nome, idade, altura);
        }
        double somaAltura = 0;
        for(int i = 0; i<qtdPessoas; i++){
            somaAltura = somaAltura + vetor[i].getAltura();
        }
        double mediaAltura = somaAltura/qtdPessoas;
        System.out.printf("Altura média: %.0f", mediaAltura);

        int pessoasMenores = 0;
        for(int i = 0; i<qtdPessoas; i++){
            if(vetor[i].getIdade()<16){
                pessoasMenores = pessoasMenores + 1;
            }
        }

        double porcentagemIdade = ((double)pessoasMenores/qtdPessoas) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%", porcentagemIdade);

        ArrayList<String> nomesMenoresDe16 = new ArrayList<>();
        for (int i = 0; i < qtdPessoas; i++) {
            if (vetor[i].getIdade() < 16) {
                nomesMenoresDe16.add(vetor[i].getNome());
            }
        }

        if (nomesMenoresDe16.size() != 0) {
            System.out.println("As pessoas menores de 16 anos são:");
            for (int i = 0; i < nomesMenoresDe16.size(); i++) {
                System.out.println(nomesMenoresDe16.get(i));
            }
        } else {
            System.out.println("Não existem pessoas menores de 16 anos nesta lista");
        }

    }
}

