package VetoresMaiorPosicao;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/

        System.out.print("Quantos números serão armazenados? ");
        int reais = sc.nextInt();
        double[] numeros = new double[reais];

        double maiorNumero = 0;
        int posicaoMaior = 0;
        for(int i = 0; i<reais; i++){
            numeros[i] = sc.nextDouble();
            if(numeros[i]>maiorNumero){
                maiorNumero = numeros[i];
                posicaoMaior = i;
            }
        }
        System.out.println("O maior número da sequência é o " + maiorNumero + " e estar na " + posicaoMaior + "° posição.");

        sc.close();
    }
}
