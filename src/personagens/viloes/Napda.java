package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.PoderEspecial;
import personagens.herois.Heroi;

public final class Napda extends Vilao {

    public Napda() {// definir o poder especial do napda
        super("Napda", 100, 0, new AtaquePadrao("Garra de mana Sombria", 10), new PoderEspecial("nao tem nome", 30, 50));
    }
}
