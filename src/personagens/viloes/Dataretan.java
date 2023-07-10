package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.PoderEspecial;
import personagens.herois.Heroi;

public final class Dataretan extends Vilao {

    public Dataretan(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1) {
        super("Dataretan", 100, 0, new AtaquePadrao("Confusão mental", 6), new PoderEspecial("PoderDataretan",20,50));
    }// falta definir o poder especial do dataretan

    //todo - ataques padroes dos vilões

}
