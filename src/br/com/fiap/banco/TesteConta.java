package br.com.fiap.banco;

public class TesteConta {
    // Usar o método main para realizar testes;
    public static void main(String[] args) {
        // Usando a instância normal, sem a utilização do construtor de classe;
        Conta contaCorrente = new Conta();
        // Atribuindo valores aos atributos necessários para o uso dos métodos e processos da classe Conta;
        System.out.println("Conta Corrente\n");
        contaCorrente.getSaldo();
        contaCorrente.depositar(50.0);
        contaCorrente.setAgencia(124);
        contaCorrente.setNumero(234567);
        // Testando os métodos e operações disponíveis na classe;
        contaCorrente.depositar(5);
        contaCorrente.getSaldo();
        contaCorrente.retirar(2);
        contaCorrente.getSaldo();

        // Usando construtor de classe
        Conta contaPoupanca = new Conta(345, 657483, 90.0);
        // Testando os métodos e operações disponíveis na classe;
        System.out.println("\nConta Poupança\n");
        contaPoupanca.getSaldo();
        contaPoupanca.depositar(70);
        contaPoupanca.retirar(10);
        contaPoupanca.getSaldo();
        contaPoupanca.depositar(5);
        contaPoupanca.getSaldo();
    }
}
