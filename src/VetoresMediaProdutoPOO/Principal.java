package VetoresMediaProdutoPOO;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos:");
        int n = sc.nextInt();

        Produto[] vect = new Produto[n];

        for(int i=0; i<n; i++){
            System.out.printf("Digite o nome do %d° produto: ", (i+1));
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.printf("Digite o preço do %d° produto: ", (i+1));
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double soma = 0;
        for(int i = 0; i<n; i++){
            soma = soma + vect[i].getPreco();
        }
        double media = soma/n;

        for(int i=0; i<n; i++){
            System.out.println(vect[i]);
        }
        System.out.printf("Média de preço dos %d produtos é $2%.2f\n", n, media);


        sc.close();
    }
}
