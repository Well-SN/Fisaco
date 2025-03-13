package NivelFacil.condicoes;

import java.util.ArrayList;

import NivelFacil.entities.Ninja;

import static NivelFacil.enums.Status.*;

public class Desafio1 {

    public static void main(String[] args) {

        ArrayList<Ninja> listNijas = new ArrayList<Ninja>();

        listNijas.add(new Ninja("Naruto", 14, "Matar Zabuza", 'A'));
        listNijas.add(new Ninja("Gaara", 15, "Matar Rocklee", 'C'));
        listNijas.add(new Ninja("Neiji", 14, "Não Morrer", 'B'));

        for (Ninja ninja : listNijas) {
            if (ninja.getIdadade() < 15) {
                if (ninja.getRank() == 'C' || ninja.getRank() == 'D') {
                    ninja.setStatusMissao(CONCLUIDA);
                } else {
                    ninja.setStatusMissao(NAO_CONCLUIDO);
                }
            } else {
                ninja.setStatusMissao(CONCLUIDA);
            }

            System.out.println(ninja.toString());
        }


    }
}
