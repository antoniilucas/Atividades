package com.seubanco.model;
public abstract class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String tipo;

    public Conta(String titular, int numero, String agencia, double saldo, String tipo) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular
    ) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero
    ) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia
    ) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo
    ) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo
    ) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Conta{" + "titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + ", tipo=" + tipo +'}';
    }
}