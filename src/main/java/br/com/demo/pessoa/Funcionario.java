package br.com.demo.pessoa;

public abstract class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public abstract double getBonificacao();
}
