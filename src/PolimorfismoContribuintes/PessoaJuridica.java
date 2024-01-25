package PolimorfismoContribuintes;

public class PessoaJuridica extends Contribuinte{
    private int numeroFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double taxa() {
        double taxa;
        if (numeroFuncionarios<10){
            taxa = getRendaAnual()*0.16;
        }
        else{
            taxa = getRendaAnual()*0.14;
        }
        return taxa;
    }
}
