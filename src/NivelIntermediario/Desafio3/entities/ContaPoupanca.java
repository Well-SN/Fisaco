package NivelIntermediario.Desafio3.entities;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(){

    }

    public ContaPoupanca(int numeroConta, double saldoConta) {
        super(numeroConta, saldoConta);
    }

    @Override
    public double consultarSaldo() {
        return super.getSaldoConta();
    }

    @Override
    public void depositar(double valor) {
        valor += valor * 0.01;
        super.setSaldoConta(valor) ;
    }
}
