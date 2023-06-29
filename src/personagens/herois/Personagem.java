package personagens.herois;

import itens.Item;
import personagens.viloes.Vilao;

public interface Personagem {
    void contarHistoria();
    void poderEspecial1(Vilao vilao);
    void poderEspecial2();
    void ataquePadrao(Vilao vilao);
    void aumentarMana(int quantidadeMana);
    void diminuirMana(int quantidadeMana);

    void aumentarVida(int quantidadeVida);
    void diminiurVida(int quantidadeVida);
    void aumentarVidaRodada();
    void aumentarManaRodada();
    void adicionarItem(Item item);
}
