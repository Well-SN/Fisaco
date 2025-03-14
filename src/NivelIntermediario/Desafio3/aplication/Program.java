package NivelIntermediario.Desafio3.aplication;

import NivelIntermediario.Desafio3.entities.ContaBancaria;
import NivelIntermediario.Desafio3.entities.ContaCorrente;
import NivelIntermediario.Desafio3.entities.ContaPoupanca;

public class Program {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 200) ;
        cc.depositar(200);
        System.out.println(cc.toString());

        ContaPoupanca cp = new ContaPoupanca(456,200);
        cp.depositar(200);
        System.out.println(cp.toString());
    }
}
