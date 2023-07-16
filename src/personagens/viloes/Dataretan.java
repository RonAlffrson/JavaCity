package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.PoderEspecial;

public final class Dataretan extends Vilao {

    public Dataretan() {
        super("Dataretan", 90,90, 0,
                new AtaquePadrao("Confusão mental", 9),
                new PoderEspecial("Travamento de neurônios",20,50, 1));
    }
}
