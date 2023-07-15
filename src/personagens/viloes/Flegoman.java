package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.PoderEspecial;
import personagens.herois.Heroi;

public final class Flegoman extends Vilao{
    public Flegoman() {
        super("Flegoman", 80, 80, 0,
                new AtaquePadrao("Flecha flamejante",9),
                new PoderEspecial("Horda de pássaros negros",15, 30, 1));
    }

}
