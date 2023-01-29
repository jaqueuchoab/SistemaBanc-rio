package br.com.fiap.banco;

public class TesteContaCorrente {
    public static void main(String[] args) {
        // Definindo de inicio alguns atributos usando o construtor de classe presente na classe ContaCorrente
        ContaCorrente ContaCorrente = new ContaCorrente("FF", 200);
        // Usando métodos herdados pela classe ContaCorrente da classe Conta
        ContaCorrente.setNumero(124);
        ContaCorrente.setAgencia(345678);
        ContaCorrente.depositar(100);
        // Exibindo valor do Saldo em ContaCorrente
        ContaCorrente.exibeSaldo();
        ContaCorrente.exibeSaldoCorrente();
    }
}
