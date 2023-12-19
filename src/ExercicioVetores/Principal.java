package ExercicioVetores;
import java.util.Locale;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    int qtdPessoas;

    System.out.println("Digite a quantidade de alturas para calcular a média:");
    qtdPessoas = sc.nextInt();

    double [] altura = new double[qtdPessoas];

    System.out.println("Você esta solicitando a média de " + qtdPessoas + " alturas");
    for(int i = 0; i<qtdPessoas; i++){
        System.out.println("Digite a " + (i+1) + "° altura");
        altura[i] = sc.nextDouble();
    }

    double soma = 0;
    for(int i = 0; i<qtdPessoas; i++){
        soma = soma + altura[i];
    }
    double media = soma/qtdPessoas;
    System.out.println("A média das alturas informadas é:" + media);


sc.close();
    }
}
