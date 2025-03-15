package NivelIntermediario.Desafio6.aplication;

import NivelIntermediario.Desafio6.entities.ListaNinja;
import NivelIntermediario.Desafio6.entities.Ninja;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        LinkedList<Ninja> criandoListaNinja = new LinkedList<>();

        criandoListaNinja.add(new Ninja("Naruto",16,"Konoha"));
        criandoListaNinja.add(new Ninja("Sasuke",17,"Konoha"));
        criandoListaNinja.add(new Ninja("Sakura",16,"Konoha"));
        criandoListaNinja.add(new Ninja("Gaara",17,"Areia"));
        criandoListaNinja.add(new Ninja("Temari",16,"Areia"));
        criandoListaNinja.add(new Ninja("Kankuro",18,"Areia"));

        ListaNinja linkNinjas = new ListaNinja(criandoListaNinja);
        System.out.println(linkNinjas);

        //Removendo o primeiro
        linkNinjas.removerInicio();
        System.out.println(linkNinjas);

        //Adicionando novo ninja
        linkNinjas.adicionarIncio(new Ninja("Deidara",25,"Som"));
        System.out.println(linkNinjas);

        //Buscar Ninja
        System.out.println("\n Ninja procurado -> " + linkNinjas.buscarNinja(3));




//        System.out.println("-------------------Lista-----------------------");
//        for( int index = 0; index < listDeNinjas.size(); index++){
//            System.out.println("Index: " + index + " Ninja: " + listDeNinjas.get(index).getNome() +  " Aldeia: " + listDeNinjas.get(index).getAldeia() +  " Idade: " + listDeNinjas.get(index).getIdade());
//        }


    }
}

