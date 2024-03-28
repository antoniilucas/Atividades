public class ContaInvestimento extends Conta {
    private double carteiraInvestimentos;

    public ContaInvestimento(String titular, int numero, String agencia, double saldo, double carteiraInvestimentos) {
        super(titular, numero, agencia, saldo);
        this.carteiraInvestimentos = carteiraInvestimentos;
    }

    public void investir(double valor) {
        // Implementação do método de investir
    }

    public void desinvestir(double valor) {

    }

    public double getCarteiraInvestimentos() {
        return carteiraInvestimentos;
    }

    public void setCarteiraInvestimentos(double carteiraInvestimentos) {
        this.carteiraInvestimentos = carteiraInvestimentos;
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "titular='" + getTitular() + '\'' +
                ", numero=" + getNumero() +
                ", agencia='" + getAgencia() + '\'' +
                ", saldo=" + getSaldo() +
                ", carteiraInvestimentos=" + carteiraInvestimentos +
                '}';
    }

}
