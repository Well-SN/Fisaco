package NivelIntermediario.Desafio3.entities;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(){

    }

    public ContaCorrente(int numeroConta, double saldoConta) {
        super(numeroConta, saldoConta);
    }

    @Override
    public double consultarSaldo() {
        return super.getSaldoConta();
    }

    @Override
    public void depositar(double valor) {
        super.setSaldoConta(valor) ;
    }
}
