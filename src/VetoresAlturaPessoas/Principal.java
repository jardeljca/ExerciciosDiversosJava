package VetoresAlturaPessoas;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    /*/Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens./*/

        System.out.print("Digite a quantidade de pessoas: ");
        int pessoas = sc.nextInt();

        double[] altura = new double[pessoas];
        char[] genero = new char[pessoas];

        for (int i = 0; i < pessoas; i++) {
            System.out.printf("Digite o sexo da %d° pessoa(M/F): ", i+1 );
            genero[i] = sc.next().charAt(0);
            System.out.printf("Digite a altura da %d° pessoa: ", i+1 );
            altura[i] = sc.nextDouble();
        }

        double maiorAltura = 0;
        double menorAltura;
        double mediaAlturaF;
        double somaAlturaF = 0;
        int qtdmulheres = 0;
        int qtdHomens = 0;

        for (int i = 0; i < pessoas; i++) {
            if (altura[i]>maiorAltura){
                maiorAltura = altura[i];
            }
        }

        menorAltura = maiorAltura;
        for (int i = 0; i < pessoas; i++) {
            if(altura[i]<menorAltura){
                menorAltura = altura[i];
            }
        }

        for (int i = 0; i < pessoas; i++) {
            if (genero[i] == 'm' || genero[i] == 'M'){
                qtdHomens++;
            }
            else{
                qtdmulheres++;
                somaAlturaF = somaAlturaF + altura[i];
            }
        }

        mediaAlturaF = somaAlturaF/qtdmulheres;


        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A menor altura é: " + menorAltura);
        System.out.println("A quantidade de homens é: " + qtdHomens);
        System.out.printf("A média da altura das mulheres é: %.2f", mediaAlturaF);



        sc.close();
    }
}
