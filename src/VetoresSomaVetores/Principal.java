package VetoresSomaVetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é
        a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.*/

        System.out.print("Digite a quantidade de elemento dos dois vetores: ");
        int qtdElementos = sc.nextInt();
        int[] vetor1 = new int[qtdElementos];
        int[] vetor2 = new int[qtdElementos];
        int[] vetor3 = new int[qtdElementos];


        System.out.print("Digite os elementos do primeiro vetor: ");
        for (int i = 0; i < qtdElementos; i++) {
            vetor1[i] = sc.nextInt();
        }
        System.out.print("Digite os elementos do segundo vetor: ");
        for (int i = 0; i < qtdElementos; i++) {
            vetor2[i] = sc.nextInt();
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.println(Arrays.toString(vetor3));


        sc.close();
    }
}