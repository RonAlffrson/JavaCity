package personagens.viloes;

import personagens.herois.Heroi;

public final class Dataretan extends Vilao {
    public Dataretan(){
        nome = "Dataretan";
        forcaAtaque = 6;
    }

//todo - ataques padroes dos vilões
    @Override
    public void ataquePadrao(Heroi heroi) {
        String nome = "Confusão mental";
        heroi.diminiurVida(forcaAtaque);
    }
}
