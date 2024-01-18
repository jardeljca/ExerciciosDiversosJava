package composicaoEnumDadosCliente;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date momentoPedido;
    private StatusPedido status;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<ItemPedido>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //construtores:

    public Pedido() {
    }

    public Pedido(Date momentoPedido, StatusPedido status, Cliente cliente) {
        this.momentoPedido = momentoPedido;
        this.status = status;
        this.cliente = cliente;
    }

    //Geters e Seters:
    public Date getMomentoPedido() {
        return momentoPedido;
    }

    public void setMomentoPedido(Date momentoPedido) {
        this.momentoPedido = momentoPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItens(ItemPedido item) {
        itens.add(item);
    }

    public void removerItens(ItemPedido item) {
        itens.remove(item);
    }

    public double total() {
        double soma = 0;
        for (ItemPedido ip : itens) {
            soma = soma + ip.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momentoPedido) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens do pedido:\n");
        for (ItemPedido item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}