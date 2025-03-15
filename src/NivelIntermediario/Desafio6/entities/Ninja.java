package NivelIntermediario.Desafio6.entities;

import java.util.LinkedList;

public class Ninja {

    private String nome;
    private String aldeia;
    private int idade;



    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public Ninja(){

    }

    @Override
    public String toString() {
        return STR."Ninja{nome='\{nome}', aldeia='\{aldeia}', idade=\{idade}}";
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





}
