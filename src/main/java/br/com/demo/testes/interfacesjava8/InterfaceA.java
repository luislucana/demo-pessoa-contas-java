package br.com.demo.testes.interfacesjava8;

public interface InterfaceA {
    default void facaAlgo() {
        System.out.println("fazendo algo...");
    }
}
