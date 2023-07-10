package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.PoderEspecial;
import personagens.herois.Heroi;

public final class Dataretan extends Vilao {
    public Dataretan(){
        nome = "Dataretan";
        forcaAtaque = 6;
    }

    public Dataretan(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1) {
        super(Dataretan, 100, 0, new AtaquePadrao("Confusão mental"), poderEspecial1);
    }

    //todo - ataques padroes dos vilões
    @Override
    public void ataquePadrao(Heroi heroi) {
        String nome = "Confusão mental";
        heroi.diminiurVida(forcaAtaque);
    }
}
