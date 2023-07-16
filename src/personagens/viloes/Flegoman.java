package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.PoderEspecial;

public final class Flegoman extends Vilao{
    public Flegoman() {
        super("Flegoman", 80, 80, 0,
                new AtaquePadrao("Flecha flamejante",7),
                new PoderEspecial("Horda de pássaros negros",15, 30, 1));
    }

}
