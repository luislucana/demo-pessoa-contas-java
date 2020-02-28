package br.com.demo.conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroConta, String titular) {
        super(numeroConta, titular);
    }

    public void gerarTaxa() {
        saldo += saldo * .006;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numeroConta=" + numeroConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
