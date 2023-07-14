package personagens.herois;

import itens.Item;
import personagens.viloes.Vilao;

public interface AcoesHerois {
    void contarHistoria();
    void poderEspecial2();
    void aumentarVida(int quantidadeVida);
    void aumentarVidaRodada();
    void adicionarItem(int opcao);
}
