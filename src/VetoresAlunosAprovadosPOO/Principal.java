package VetoresAlunosAprovadosPOO;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    /*/Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
    no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
    os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
    igual a 6.0 (seis)./*/

        System.out.print("Informe a quantidade de alunos: ");
        int qtdaluno = sc.nextInt();
        Alunos[] aluno = new Alunos[qtdaluno];
        double[] media = new double[qtdaluno];

        for (int i = 0; i < qtdaluno; i++) {
            sc.nextLine();
            System.out.printf("Informe o nome do %d° aluno: ", i+1);
            String nome = sc.nextLine();
            System.out.printf("Informe a nota do primeiro semestre do %d° aluno: ", i+1);
            double nota1 = sc.nextDouble();
            System.out.printf("Informe a nota do segundo semestre do %d° aluno: ", i+1);
            double nota2 = sc.nextDouble();
            aluno[i] = new Alunos(nome, nota1, nota2);
            media[i] = (aluno[i].getNota1() + aluno[i].getNota2())/2;
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < qtdaluno; i++) {
            if (media[i] >= 6) {
                System.out.println(aluno[i].getNome());
            }
        }


        sc.close();
    }
}
