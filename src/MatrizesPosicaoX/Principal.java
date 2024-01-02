package MatrizesPosicaoX;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*/ Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M
        linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida,
        ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo./*/

        System.out.print("Informe a quantidade de linhas e colunas da matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        System.out.println("Digite os elementeos da matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número a ser procurado na matrix: ");
        int x = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (x == matrix[i][j]){
                    System.out.println("Posição: " + "[" + i + "]" + "[" + j + "]");
                    if (j>0){
                        System.out.println("Elemento da esquerda: " + matrix[i][j-1]);
                    }
                    if (j<matrix[i].length-1){
                        System.out.println("Elemento da direita: " + matrix[i][j+1]);
                    }
                    if (i>0){
                        System.out.println("Elemento acima : " + matrix[i-1][j]);
                    }
                    if (i<matrix.length-1){
                        System.out.println("Elemento abaixo : " + matrix[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
