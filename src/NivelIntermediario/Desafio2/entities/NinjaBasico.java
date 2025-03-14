package NivelIntermediario.Desafio2.entities;

import NivelIntermediario.Desafio2.entities.enums.TipoDeHabilidade;
import NivelIntermediario.Desafio2.services.Ninja;

public class NinjaBasico extends NinjaBase {

    public NinjaBasico(){

    }

    public NinjaBasico(String nome, String aldeia, int idade, TipoDeHabilidade habilidade) {
        super(nome, aldeia, idade, habilidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + super.getNome() +
                "\n Aldeia: " + super.getAldeia() +
                "\n Idade: " + super.getAldeia() +
                "\n Habilidade: " + super.getHabilidade());
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade: " + super.getHabilidade() + " Ativada!! ");
    }
}
