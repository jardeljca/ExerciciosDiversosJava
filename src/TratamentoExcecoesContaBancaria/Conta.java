package TratamentoExcecoesContaBancaria;

public class Conta {
    private Integer numeroConta;
    private String titular;
    private Double saldoInicial;
    private Double limiteSaque;

    public Conta(Integer numeroConta, String titular, Double saldoInicial, Double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldoInicial = saldoInicial;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double deposito) {

        saldoInicial += deposito;
    }

    public void saque(double saque) {
        if (saque > saldoInicial) {
            throw new RuntimeException("Erro de saque: Saldo insuficiente");
        }
        else if (saque > limiteSaque){
            throw new RuntimeException("Erro de saque: A quantia excede o limite de saque");
        }
        else {
            saldoInicial -= saque;
        }
    }
}