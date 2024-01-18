package composicaoEnumDadosCliente;

import java.awt.desktop.SystemEventListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date dataNascimento = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println("Entre com os dados do pedido:");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.print("Quantos itens para esse pedido? ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println("Digite os dados do " + (i+1) + "° pedido:");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            Produto produto = new Produto(nomeProduto, preco);
            ItemPedido ip = new ItemPedido(quantidade, preco, produto);

            pedido.adicionarItens(ip);
        }

        System.out.println(pedido);

        sc.close();
    }
}
