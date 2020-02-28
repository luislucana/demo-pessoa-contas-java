package br.com.demo.conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, String titular) {
        super(numeroConta, titular);
    }

    public void gerarTaxa() {
        saldo -= 15.90;
    }

    public boolean sacar(double valor, boolean cobraCPMF){
        if (cobraCPMF) {
            return sacar(valor + valor * .0038);
        }
        else {
            return sacar(valor);
        }
    }
}
