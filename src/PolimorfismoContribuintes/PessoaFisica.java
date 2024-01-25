package PolimorfismoContribuintes;

public class PessoaFisica extends Contribuinte {

    private double gastoSaude;

    public PessoaFisica() {
    }
    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double taxa() {
        double taxa;
       if (getRendaAnual()<20000){
           taxa = (getRendaAnual()*0.15) - (gastoSaude*0.50);
       }
       else{
           taxa = (getRendaAnual()*0.25) - (gastoSaude*0.50);
       }
        return taxa;
    }
}
