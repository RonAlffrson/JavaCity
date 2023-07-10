package personagens;

public abstract class Personagem {
    protected String nome;
    protected Integer vida, mana = 0;
    protected final Integer MAX_MANA = 100, MIN_MANA = 0, MIN_VIDA = 0;
    protected PoderEspecial poderEspecial1;
    protected AtaquePadrao ataquePadrao;

    public Personagem(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.ataquePadrao = ataquePadrao;
        this.poderEspecial1 = poderEspecial1;
    }

}
