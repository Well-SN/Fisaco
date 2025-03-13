package NivelIntermediario;

public class Ninja {

    String name;
    int idade;
    String aldeia;

    public Ninja(){

    }

    public Ninja(String name, int idade, String aldeia) {
        this.name = name;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public String cirarClone(){
        return "Clone criados";
    }

    public int anosParaSeTornarHokage(int idadeMinima){
        return  idadeMinima - idade;
    }
}
