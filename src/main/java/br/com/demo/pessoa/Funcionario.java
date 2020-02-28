package br.com.demo.pessoa;

public abstract class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public void facaAlgo() {
        System.out.println("(Funcionario) fazendo algo...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonificacao();
}
