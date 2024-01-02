package ListasSalarioFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*/Fazer um programa para ler um número inteiro N e depois ler os dados (id, nome e salário) de N
        funcionários, não deve haver repetições de id´s. Em seguida perguntar uma porcentagem X de aumento
        para o salário de determinado funcionário pelo ID do mesmo, se o ID não existir, abortar a operação.
        O salário não pode ser aumentado livremente, apenas pelo acrescimo de uma porcentagem./*/

    System.out.print("Digite a quantidade de funcionários que serão digitados: ");
    int n = sc.nextInt();

    List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while(existeId(list, id)){
                System.out.print("Esse id já existe, digite outro id:");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            Funcionario func = new Funcionario(id, nome, salario);

            list.add(func);
        }

        for(Funcionario x: list){
            System.out.println(x);
        }


        System.out.print("Qual funcionário terá o salário aumentado? ");
        int idsalario = sc.nextInt();

        Funcionario func = list.stream().filter(x->x.getId() == idsalario).findFirst().orElse(null);

        if(func == null){
            System.out.println("Esse id não existe");
        }
        else{
            System.out.print("Digite a porcentagem do aumento:" );
            double porcentagem = sc.nextDouble();
            func.incrementarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários");
        for (Funcionario y: list){
            System.out.println(y);
        }

        sc.close();
    }

    public static boolean existeId(List<Funcionario> list, int id){
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }

}
