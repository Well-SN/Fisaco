package NivelFacil.Lista;

public class Array {
    public static void main(String[] args) {

        String[] ninjas = new String[3];

        //Arrays são tipos referências
        // - Array tem tamaho fixos e tipo do array
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruano";

        // Array idade
        Integer[] idade = new Integer[3];
        System.out.println(idade[6]);


        for (String ninja : ninjas) {
            System.out.println(ninja);
        }


    }

}
