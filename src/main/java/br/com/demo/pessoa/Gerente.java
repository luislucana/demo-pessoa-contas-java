package br.com.demo.pessoa;

public class Gerente extends Funcionario implements Autenticavel {

    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        return this.salario * 1.4 + 1000;
    }

    public boolean autenticar(String senha) {
        if(this.senha != senha) {
            return false;
        }
        // pode fazer outras possíveis verificações, como saber se esse
        // departamento do gerente tem acesso ao Sistema

        return true;
    }
}
