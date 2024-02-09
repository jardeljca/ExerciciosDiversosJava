package TratamentoExcecoesContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite os dados da conta bancária:");
        System.out.print("Número da conta: ");
        Integer numeroConta = sc.nextInt();
        System.out.print("Nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        Double saldoInicial = sc.nextDouble();
        System.out.print("Limite de saque: ");
        Double limiteSaque = sc.nextDouble();

        Conta conta = new Conta(numeroConta, titular, saldoInicial, limiteSaque);

        System.out.println();
        System.out.print("Qual valor do saque? ");
        Double saque = sc.nextDouble();

        try{
            conta.saque(saque);
            System.out.print("Saldo: " + conta.getSaldoInicial());
        }
        catch (Excessao e){
            System.out.print(e.getMessage());
        }

        sc.close();
    }
}