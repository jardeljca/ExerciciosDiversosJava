package MediaPares;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        System.out.println("Digite os números do vetor:");
        int somaPares = 0;
        int pares = 0;
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares = somaPares + numeros[i];
                pares++;
            }
        }

        if (pares > 0) {
            double media = (double)somaPares / pares;
            System.out.printf("A média dos números pares é %.1f", media);
        } else {
            System.out.println("Não tem nenhum número par");
        }

        sc.close();
    }
}
