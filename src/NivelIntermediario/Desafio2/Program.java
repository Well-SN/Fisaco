package NivelIntermediario.Desafio2;

import NivelIntermediario.Desafio2.entities.NinjaAvancado;
import NivelIntermediario.Desafio2.entities.NinjaBase;
import NivelIntermediario.Desafio2.entities.NinjaBasico;

import static NivelIntermediario.Desafio2.entities.enums.TipoDeHabilidade.*;

public class Program {
    public static void main(String[] args) {

        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", "Konoha", 16, CLONE);
        NinjaAvancado jiraiya = new NinjaAvancado("Jiraiya", "Konoha", 30, NINJUTSU, "INVOCAÇÃO");

        naruto.mostrarInformacoes();
        System.out.println();https://github.com/Well-SN/Fisaco.git
        naruto.executarHabilidade();
        System.out.println("\n========================================\n");
        jiraiya.mostrarInformacoes();
        System.out.println();
        jiraiya.executarHabilidade();

    }
}
