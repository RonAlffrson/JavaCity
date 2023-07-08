package personagens.viloes;

import personagens.herois.Heroi;

public final class Napda extends Vilao{
    public Napda(){
        nome = "Napda";
        forcaAtaque = 9;
    }

    @Override
    public void ataquePadrao(Heroi heroi) {
        String nome = "Garra de mana sombria";
        heroi.diminiurVida(forcaAtaque);
    }
}
