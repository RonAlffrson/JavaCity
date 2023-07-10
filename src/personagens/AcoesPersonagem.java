package personagens;

public interface AcoesPersonagem {
    void poderEspecial1(Personagem personagem);
    void ataquePadrao(Personagem personagem);
    void diminuirMana(int quantidadeMana);
    void diminiurVida(int quantidadeVida);
    void aumentarManaRodada();
    void aumentarMana(int quantidadeMana);
}
