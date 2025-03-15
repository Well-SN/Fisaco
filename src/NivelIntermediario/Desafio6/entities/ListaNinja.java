package NivelIntermediario.Desafio6.entities;

import java.util.LinkedList;

public class ListaNinja{

    LinkedList<Ninja> ninjas = new LinkedList<>();

    public ListaNinja(LinkedList<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    @Override
    public String toString(){
        String resultado = "\n-------------------Lista-----------------------";
        for( int index = 0; index < ninjas.size(); index++){
            resultado += "\nIndex: " + index + " Ninja: " + ninjas.get(index).getNome() +  " Aldeia: " + ninjas.get(index).getAldeia() +  " Idade: " + ninjas.get(index).getIdade();
        }

        return resultado;
    }

    public void removerInicio(){
        this.ninjas.remove(0);
    }

    public void adicionarIncio(Ninja n){
        this.ninjas.add(0, n);
    }

    public Ninja buscarNinja(int posicao){
        return ninjas.get(posicao);
    }
}
