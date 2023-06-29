package personagens;

public interface Personagem {
    void contarHistoria();
    void poderEspecial();
    void adicionarItem();
    void ataquePadrao();
    void aumentarMana();
    //void alterarVida(Integer quantidadeVida);
    void aumentarVida(Integer quantidadeVida);
    void diminiurVida(Integer quantidadeVida);
}
