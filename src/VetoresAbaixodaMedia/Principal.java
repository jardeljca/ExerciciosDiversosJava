package VetoresAbaixodaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

        System.out.print("Quantos números terão no vetor? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        double somalementos = 0;
        System.out.print("Digite os elemetos do vetor ");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextDouble();
            somalementos = somalementos + numeros[i];
        }

        double media = somalementos / n;
        System.out.printf("A média de todos os elementos é %.3f\n\n", media);

        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] < media) {
                System.out.printf("%.1f\n", numeros[i]);
            }

            sc.close();
        }
    }

}
