package NivelFacil.entities;

import NivelFacil.enums.Status;

public class Ninja {

        private String nome;
        private int idadade;
        private String missao;
        private char rank;
        private Status statusMissao;

    public Ninja(String nome, int idadade, String missao, char rank) {
        this.nome = nome;
        this.idadade = idadade;
        this.missao = missao;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idadade=" + idadade +
                ", missao='" + missao + '\'' +
                ", rank=" + rank +
                ", statusMissao=" + statusMissao +
                '}';
    }

    public Ninja(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadade() {
        return idadade;
    }

    public void setIdadade(int idadade) {
        this.idadade = idadade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public Status getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(Status statusMissao) {
        this.statusMissao = statusMissao;
    }
}
