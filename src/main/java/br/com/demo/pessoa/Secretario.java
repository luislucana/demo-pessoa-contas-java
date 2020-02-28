package br.com.demo.pessoa;

public class Secretario extends Funcionario {
    public double getBonificacao() {
        return this.salario + 200;
    }
}
