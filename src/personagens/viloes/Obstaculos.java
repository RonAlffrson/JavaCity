package personagens.viloes;

import personagens.herois.Heroi;

public interface Obstaculos {
    //colocar forca de ataque do ataque padrao
    void ataquePadrao(Heroi heroi);
    void diminiurVida(Integer quantidadeVida);
}
