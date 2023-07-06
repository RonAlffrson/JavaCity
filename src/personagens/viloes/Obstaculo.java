package personagens.viloes;

import personagens.herois.Heroi;

public interface Obstaculo  {
    void ataquePadrao(Heroi heroi);
    void diminiurVida(int quantidadeVida);
}
