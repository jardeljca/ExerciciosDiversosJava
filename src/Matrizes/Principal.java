package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*/
        /*/

        System.out.print("Informe o tamanho da matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Digite os elementeos da matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal principal da metrix:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        int numNegativo = 0;
        System.out.println("Elemento negativos da matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix [i][j] < 0) {
                    System.out.print(matrix[i][j] + " ");
                    numNegativo++;
                }
            }
        }
        System.out.println();
        System.out.print("Qtd de números negativos: " + numNegativo);

    }
}
