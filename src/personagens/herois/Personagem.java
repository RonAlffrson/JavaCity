package personagens.herois;

import itens.Item;
import personagens.viloes.Vilao;

public interface Personagem {
    void contarHistoria();
    void poderEspecial1(Vilao vilao);
    void poderEspecial2();
    void ataquePadrao(Vilao vilao);
    void aumentarMana(Integer quantidadeMana);
    void diminuirMana(Integer quantidadeMana);

    void aumentarVida(Integer quantidadeVida);
    void diminiurVida(Integer quantidadeVida);
    void aumentarVidaRodada();
    void aumentarManaRodada();
    void adicionarItem(Item item);
}
