package personagens.viloes;

import personagens.Personagem;
import personagens.herois.Heroi;

public interface AcoesViloes {
    void tomadadeDecisao(Personagem personagem);
    void sortearPocao(Heroi heroi);
}
