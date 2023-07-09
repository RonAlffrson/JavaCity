package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.Personagem;
import personagens.PoderEspecial;

public abstract class Vilao extends Personagem implements Obstaculo {
    public Vilao(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1) {
        super(nome, vida, mana, ataquePadrao, poderEspecial1);
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
}
