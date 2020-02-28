package br.com.demo.pessoa;

public class Gerente extends Funcionario implements Autenticavel {

    private String senha;

    // outros atributos e métodos

    public boolean autenticar(String senha) {
        if(this.senha != senha) {
            return false;
        }
        // pode fazer outras possíveis verificações, como saber se esse
        // departamento do gerente tem acesso ao Sistema

        return true;
    }

    public double getBonificacao() {
        return this.salario * 1.4 + 1000;
    }
}
