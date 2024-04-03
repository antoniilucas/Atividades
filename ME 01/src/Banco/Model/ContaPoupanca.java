package com.seubanco.model;
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, int numero, String agencia, double saldo, String tipo, double taxaRendimento) {
        super(titular, numero, agencia, saldo, tipo);
        this.taxaRendimento = taxaRendimento;
    }

    public void render() {
        depositar(getSaldo() * taxaRendimento);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "titular='" + getTitular() + '\'' +
                ", numero=" + getNumero() +
                ", agencia='" + getAgencia() + '\'' +
                ", saldo=" + getSaldo() +
                ", tipo='" + getTipo() + '\'' +
                ", taxaRendimento=" + taxaRendimento +
                '}';
    }
    
}