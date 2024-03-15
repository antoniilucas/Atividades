
package br.com.Caelum.contas;

public class TesteCliente {
    public static void main(String[] args) {
        // Criar um novo cliente
        Cliente cliente = new Cliente("tony", "Rua Principal");

        // Exibir informações do cliente
        cliente.exibirInformacoes();
    }
}