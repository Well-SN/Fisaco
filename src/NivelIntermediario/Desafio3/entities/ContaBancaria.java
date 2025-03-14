package NivelIntermediario.Desafio3.entities;

import NivelIntermediario.Desafio3.services.Conta;

public abstract class ContaBancaria implements Conta {

    private int numeroConta;
    private double saldoConta;


    public ContaBancaria(){

    }

    public ContaBancaria(int numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldoConta=" + saldoConta +
                '}';
    }



}
