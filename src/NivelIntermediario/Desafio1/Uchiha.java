package NivelIntermediario.Desafio1;

public class Uchiha extends Ninja {

    String habilidadeEspecila;

    public Uchiha(String nome, int idade, String missao, String nivelDificulade, String statusMissao, String habilidadeEspecila) {
        super(nome, idade, missao, nivelDificulade, statusMissao);
        this.habilidadeEspecila = habilidadeEspecila;
    }

    public void mostrarHabilidadeEspecila(){
         System.out.println(habilidadeEspecila);
    }

    @Override
    public String toString() {
        return "Uchiha" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", missao='" + missao + '\'' +
                ", nivelDificulade='" + nivelDificulade + '\'' +
                ", StatusMissao='" + StatusMissao + '\'' +
                "habilidadeEspecila='" + habilidadeEspecila;
    }
}
