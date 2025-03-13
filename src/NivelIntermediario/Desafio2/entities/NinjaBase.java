package NivelIntermediario.Desafio2.entities;

import NivelIntermediario.Desafio2.entities.enums.TipoDeHabilidade;

public abstract class NinjaBase {

    private String nome;
    private String aldeia;
    private int idade;
    private TipoDeHabilidade habilidade;

    public NinjaBase(){

    }

    public NinjaBase(String nome, String aldeia, int idade, TipoDeHabilidade habilidade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoDeHabilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(TipoDeHabilidade habilidade) {
        this.habilidade = habilidade;
    }
}
