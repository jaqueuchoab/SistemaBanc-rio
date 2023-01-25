package br.com.fiap.banco;

/* Aplicando princípios de uma classe padrão JavaBean, regras:
*  1- Ter construtor padrão;
*  2- Encapsulamento: Todos os atributos bem protegidos, definindo modificadores;
*  3- Interface Serializable: Dados em bits para tornar as informações menos transparentes;
* */

// Package que contem o Serializable
import java.io.Serializable;

// Aplicando terceira regra: Interface Serializable;
public class Pessoa implements Serializable {
    // Aplicando segunda regra: encapsulamento de atributos;
    private String nome;
    /* Como de alguma forma a variável - nome - precisa ser utilizada define-se os getters e setters,
    *  métodos que permitem que o dado possa ser utilizado/pegado e substituido/alterado.
    * */
    // Definindo método Get
    public String getNome() {
        return nome;
    }

    // Definindo método Set
    public void setNome(String nome) {
        this.nome = nome;
    }
}
