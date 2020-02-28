package br.com.demo.pessoa;

public class Engenheiro extends Funcionario {
    public double getBonificacao() {
        return this.salario + 800;
    }
}
