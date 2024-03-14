//Modele uma conta. A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes. Desenhe no papel tudo que uma Conta tem e o que ela faz. Ela deve ter o nome do titular, número, agência, data de abertura e saldo. Ela deve fazer as seguintes ações: saca, para retirar um valor do saldo; deposita, para adicionar um valor ao saldo; calculaRendimento, para devolver o rendimento mensal dessa conta.

public class conta {
    String nomeTitular;
    int numeroConta;
    String agencia;
    double saldoConta;
    String dataAbertura;


    void saca(double valor) {
        saldoConta -= valor;
    }

    void deposita(double valor) {
        saldoConta += valor;
    }

    double calculaRendimento() {
        return saldoConta * 0.1;
    }

    void recuperaDadosParaImpressao() {
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo da conta: " + saldoConta);
        System.out.println("Data de abertura: " + dataAbertura);
    }
}