package br.com.demo;

import br.com.demo.conta.Conta;
import br.com.demo.conta.ContaCorrente;
import br.com.demo.conta.ContaPoupanca;

/**
 * https://www.caelum.com.br/apostila-java-orientacao-objetos/interfaces/#interfaces
 * https://www.caelum.com.br/apostila-java-orientacao-objetos/classes-abstratas/#exerccios-classes-abstratas
 */
public class Principal {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(123450, "Fulano de tal");

        Conta contaPoupanca = new ContaPoupanca(543210, "José da Silva");


    }
}
