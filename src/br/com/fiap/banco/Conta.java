package br.com.fiap.banco;
import java.io.Serializable;

/**
 * @author Jaqueline Uchôa
 * @version 1.0
 * */
public class Conta implements Serializable {
    private int agencia;
    private int numero;
    private double saldo;

    // Getters e Setters das variáveis;
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Construtor Padrão;
    public Conta() {
        // Sem nada dentro do bloco;
    }

    // Construtor de Classe;
    public Conta(int agencia, int numero, double saldo) {
        // Atribuindo às variáveis do escopo global os valores passados como argumentos;
        // Para fazer a atribuição é necessário fazer o uso da palavra 'this' que faz referência ao contexto global;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    // Métodos;
    /**
     * Atualiza saldo caso seja feita uma operação de deposito, somando o valor e saldo atual.
     * @param valor Valor em reais a ser adicionado ao saldo na conta.
     */
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito efetuado!\nValor do deposito: R$ " + valor);
    }

    /**
     * Atualiza saldo caso seja feita uma operação de retirada, subtraindo o valor e saldo atual.
     * @param valor Valor em reais a ser subtraido ao saldo na conta.
     */
    public void retirar(double valor) {
        this.saldo -= valor;
        System.out.println("Retirada efetuada!\nValor da retirada: R$ " + valor);
    }

    /**
     * Exibe o saldo presente na conta e retorna o mesmo.
     * @return Saldo presente na conta em reais.
     */
    public double getSaldo() {
        return this.saldo;
    }

    public void exibeSaldo() {
        System.out.println("Saldo em conta: R$ " + this.saldo);
    }
}
