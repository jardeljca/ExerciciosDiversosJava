package VetoresPrintNegativos;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

        System.out.println("Quantos números deve ter o vetor?");
        int tamVetor = sc.nextInt();

        int numeroInicial;
        do{
            System.out.print("Digite um número inteiro positivo: ");
            numeroInicial = sc.nextInt();
        }while(numeroInicial<0 || numeroInicial>10);

        int numeros[] = new int[tamVetor];
        numeros[0] = numeroInicial;

        for(int i = 1; i<tamVetor; i++){
            System.out.printf("Digite o %d° número do vetor\n", i+1);
            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i<tamVetor; i++){
            System.out.println(numeros[i]);
        }

        System.out.println("O números negativos são:");
        for(int i = 0; i<tamVetor; i++){
            if(numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}