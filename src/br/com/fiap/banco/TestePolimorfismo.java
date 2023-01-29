package br.com.fiap.banco;

public class TestePolimorfismo {
    public static void main(String[] args) {
        // Utiliza apenas métodos/atributos da class Conta
        Conta contaOne = new Conta();
        contaOne.depositar(1000);
        contaOne.retirar(100);

        // Utiliza apenas métodos/atributos da class ContaCorrente
        ContaCorrente contaTwo = new ContaCorrente();
        contaTwo.depositar(1000);
        contaTwo.retirar(100);

        /* Utiliza métodos/atributos das classes Conta(SuperClass) e ContaCorrente(SubClass)
        *  mas definido por anotação '@Override' que o método retirar()
        *  será usado o que está presente na ContaCorrente;
        * */
        Conta contaThree = new ContaCorrente();
        contaThree.depositar(1000);
        contaThree.retirar(100);

        System.out.println("Conta 1: " + contaOne.getSaldo());
        System.out.println("Conta 2: " + contaTwo.getSaldo());
        System.out.println("Conta 3: " + contaThree.getSaldo());

        /*
        * Quando a instância criada pela palavra reservada 'new' for uma subclass
        * e houver nela algum método de sobrescrição anotado pela '@Override'
        * independentemente de qual tipo foi atribuindo em sua criação o método da superclass será
        * substituido pelo da subclass;
        * */
    }
}
