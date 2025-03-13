package NivelFacil.condicoes;

public class IFeElse {
    public static void main(String[] args) {


        //Passar o naruto de nível
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numMissoes =  30;

            if(numMissoes == 10 && idade > 15){
            System.out.println("Naruto é um Chunnin");
        }else if(numMissoes <= 20){
            System.out.println("Naurto é um Jonnin");
        }else if(numMissoes == 30){
            System.out.println("Naurto é um Hokage");
        }else{
            System.out.println("Naurto é um Gennin");
        }




    }
}
