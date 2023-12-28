package VetoresPensionatos;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int qtdQuartos = sc.nextInt();
        Estudantes[] quartos = new Estudantes[10];

        System.out.println("Informe os dados dos hospedes: (Nome, email e número do quarto: 0-9)");
        for (int i = 1; i <= qtdQuartos; i++) {
            sc.nextLine();
            System.out.printf("Nome do %d°: ", i);
            String nome = sc.nextLine();
            System.out.printf("Email do %d°: ", i);
            String email = sc.nextLine();
            System.out.printf("Quarto do %d°: ", i);
            int numQuarto = sc.nextInt();

            quartos[numQuarto] = new Estudantes(nome, email);
        }

        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null){
                System.out.println("Quarto " + i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}