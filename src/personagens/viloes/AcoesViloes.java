package personagens.viloes;

import personagens.Personagem;
import personagens.herois.Heroi;

public interface AcoesViloes {
    void decidirAtaque(Heroi heroi);
    void sortearPocao(Heroi heroi);
}
