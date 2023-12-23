package VetoresNumerosPares;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.*/

        System.out.print("Quantos números serão armazenados? ");
        int numero = sc.nextInt();
        int[] numeros = new int[numero];

        System.out.println("Digite os números");
        for(int i = 0; i<numero; i++){
            numeros[i] = sc.nextInt();
        }

        int numeroPar = 0;
        ArrayList<Integer> pares = new ArrayList<>();
        for(int i = 0; i<numero; i++){
            if(numeros[i]%2 == 0){
                numeroPar = numeroPar +1;
                pares.add(numeros[i]);
            }
        }

        if(numeroPar>1){
            System.out.println("Tem " + numeroPar + " números pares");
        }
        else{
            System.out.println("Tem " + numeroPar + " número par");
        }

        System.out.print("Os números pares são: " + pares);


        sc.close();
    }
}
