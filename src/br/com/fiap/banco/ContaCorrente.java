package br.com.fiap.banco;

public class ContaCorrente extends Conta {
    private String tipo;
    private double chequeEspecial;

    public ContaCorrente() {

    }

    // Construtor de Classe
    public ContaCorrente(String tipo, double chequeEspecial) {
        this.tipo = tipo;
        this.chequeEspecial = chequeEspecial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double saldoContaCorrente() {
        return super.getSaldo() + chequeEspecial;
    }

    public void exibeSaldoCorrente() {
        System.out.println("Saldo em conta corrente: R$ " + saldoContaCorrente());
    }

    // Utilizando conceito de polimorfismo induzido pelo uso de sobrescrição de método;
    /*
    * Necessário usar como artifício para indicação de que há uma sobrescrição '@override' uma anotação,
    * assim indicando que na conta corrente o uso do método da superclass deve ser substituido pelo método
    * de sobrescrição;
    * */
    @Override
    public void retirar(double valor) {
        // Circunstância da utilização do método da superclass
        valor += 10;
        // Acessando om método base da herdado da class Conta
        super.retirar(valor);
    }
}
