package br.com.demo.pessoa;

import br.com.demo.pessoa.Autenticavel;

public class TestePessoasSistemaInterno {

    public void login(Autenticavel a) {
        String senha = "123456"; // pega senha de um lugar, ou de um scanner de polegar
        boolean autenticado = a.autenticar(senha);

        // aqui eu posso chamar o autentica!
        // não necessariamente é um Funcionario!
        // Mais ainda, eu não sei que objeto a
        // referência "a" está apontando exatamente! Flexibilidade.
    }

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.facaAlgo();
    }
}