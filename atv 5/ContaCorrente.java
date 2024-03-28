public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, int numero, String agencia, double saldo, double limiteChequeEspecial) {
        super(titular, numero, agencia, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + limiteChequeEspecial) {
            setSaldo(getSaldo() - valor); // Assumindo que setSaldo ajusta o saldo
            return true;
        }
        return false;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "titular='" + getTitular() + '\'' +
                ", numero=" + getNumero() +
                ", agencia='" + getAgencia() + '\'' +
                ", saldo=" + getSaldo() +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }

}
