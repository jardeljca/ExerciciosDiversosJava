package VetoresMaisVelho;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/

        System.out.print("Quantas pessoas serão cadastradas? ");
        int pessoas = sc.nextInt();
        String[] vetorNome = new String[pessoas];
        int[] vetorIdade = new int[pessoas];

        for(int i = 0; i<pessoas; i++){
            sc.nextLine();
            System.out.printf("Digite o nome da %d pessoa: ", i+1);
            vetorNome[i] = sc.nextLine();
            System.out.printf("Digite A idade da %d pessoa: ", i+1);
            vetorIdade[i] = sc.nextInt();
        }

        int idadeMaior = 0;
        for (int i = 0; i < pessoas; i++) {
            if(vetorIdade[i]>idadeMaior){
                idadeMaior = vetorIdade[i];
            }
            if(idadeMaior == vetorIdade[i]){
                System.out.println("A pessoa mais velha é " + vetorNome[i]);
            }
        }

        sc.close();
    }
}