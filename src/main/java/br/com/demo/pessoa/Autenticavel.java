package br.com.demo.pessoa;

public interface Autenticavel {
    boolean autenticar(String senha);

    default void facaAlgo() {
        System.out.println("(Autenticavel) fazendo algo...");
    }
}
