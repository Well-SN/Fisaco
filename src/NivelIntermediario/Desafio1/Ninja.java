package NivelIntermediario.Desafio1;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDificulade;
    String StatusMissao;

    public Ninja(){

    }

    public Ninja(String nome, int idade, String missao, String nivelDificulade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificulade = nivelDificulade;
        StatusMissao = statusMissao;
    }

    @Override
    public String toString() {
        return "Ninja" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", missao='" + missao + '\'' +
                ", nivelDificulade='" + nivelDificulade + '\'' +
                ", StatusMissao='" + StatusMissao;
    }



}
