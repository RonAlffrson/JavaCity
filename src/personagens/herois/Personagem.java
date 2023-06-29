package personagens.herois;

import personagens.viloes.Vilao;

public interface Personagem {
    void contarHistoria();
    void poderEspecial1(Vilao vilao);
    void poderEspecial2();
    void ataquePadrao(Vilao vilao);
    void aumentarMana();
    void aumentarVida(Integer quantidadeVida);
    void diminiurVida(Integer quantidadeVida);
    void aumentarVidaRodada();
}
