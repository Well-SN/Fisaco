package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naurto Uzumaki",16,"Konoha");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha",16,"Konoha");

        System.out.println(naruto.name);
        naruto.modoSabio();

        System.out.println(sasuke.name);
        sasuke.ativaSharingan();

        Stack<String> stack = new Stack<>();
         System.out.println(naruto.cirarClone());
        System.out.println(naruto.anosParaSeTornarHokage(18)+" Anos");


    }
}
