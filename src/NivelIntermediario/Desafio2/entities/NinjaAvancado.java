package NivelIntermediario.Desafio2.entities;

import NivelIntermediario.Desafio2.entities.enums.TipoDeHabilidade;
import NivelIntermediario.Desafio2.services.Ninja;

public class NinjaAvancado extends NinjaBase {

    private String especialidade;

    public NinjaAvancado(String nome, String aldeia, int idade, TipoDeHabilidade habilidade, String especialidade) {
        super(nome, aldeia, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + super.getNome() +
                "\n Aldeia: " + super.getAldeia() +
                "\n Idade: " + super.getIdade() +
                "\n Habilidade: " + super.getHabilidade() +
                "\n Especialidade: " + this.especialidade );
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade Especial: " + this.especialidade + " Ativada!! ");
    }
}
