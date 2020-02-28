package br.com.demo.pessoa;

public class Diretor extends Funcionario implements Autenticavel {

    public boolean autenticar(String senha) {
        // TODO fazer
        return false;
    }

    public double getBonificacao() {
        return this.salario * 2 + 1000;
    }
}
