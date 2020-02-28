package br.com.demo.testes.interfacesjava8;

public interface InterfaceB {
    default void facaAlgo() {
        System.out.println("fazendo algo...");
    }
}
