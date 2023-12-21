package VetoresSomaMediaReais;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    /* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor */

    System.out.print("Informe a quantidade de números que você deseja calcular a soma e média: ");
    int n = sc.nextInt();
    double [] reais = new double[n];

    for(int i = 0; i < n; i++){
        System.out.printf("Informe o %d° número do vetor:\n", i+1);
        reais[i] = sc.nextDouble();
    }

    for(int i = 0; i < n; i++){
        System.out.printf("%.2f\n", reais[i]);
    }

    double soma = 0;
    for(int i = 0; i < n; i++){
        soma = soma + reais[i];
    }

    System.out.printf("\nA soma de todos os números do vetor é %.2f\n", soma);
    double media = soma/n;
    System.out.printf("A média de todos os números do vetor é %.2f\n", media);

    }
}