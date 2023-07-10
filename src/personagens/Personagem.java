package personagens;

import personagens.viloes.Vilao;

public abstract class Personagem implements AcoesPersonagem {
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
    @Override
    public void poderEspecial1(Personagem personagem) {
        if (mana >= poderEspecial1.getAtributo()){
            diminuirMana(poderEspecial1.getAtributo());
            personagem.diminiurVida(poderEspecial1.getAtributo() * MultiplicadorDeAtaque.multiplicadorDeAtaque());
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }
    @Override
    public void ataquePadrao(Personagem personagem){
        personagem.diminiurVida(ataquePadrao.getForcaAtaque() * MultiplicadorDeAtaque.multiplicadorDeAtaque());
    }
    @Override
    public void diminuirMana(int quantidadeMana) {
        if (mana - quantidadeMana >= MIN_MANA) {
            mana -= quantidadeMana;
        }
        else if (mana - quantidadeMana < MIN_MANA){
            mana = MAX_MANA;
        }
    }

    @Override
    public void diminiurVida(int quantidadeVida) {
        if (vida - quantidadeVida >= MIN_VIDA) {
            vida -= quantidadeVida;
        }
        else if (vida - quantidadeVida < MIN_VIDA){
            vida = MIN_VIDA;
        }
    }
    @Override
    public void aumentarMana(int quantidadeMana){
        if (mana + quantidadeMana <= MAX_MANA) {
            mana += quantidadeMana;
        }
        else if (mana + quantidadeMana > MAX_MANA){
            mana = MAX_MANA;
        }
    }

    @Override
    public void aumentarManaRodada() {
        aumentarMana(5);
    }
}
