package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.PoderEspecial;

public final class Napda extends Vilao {
    public Napda() {
        super("Napda", 100, 100, 0,
                new AtaquePadrao("Feitiço rouba-corações", 10),
                new PoderEspecial("Garra de mana sombria", 30, 50, 1));
    }
}
