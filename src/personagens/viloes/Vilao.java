package personagens.viloes;

import personagens.Personagem;
import personagens.PoderEspecial;

public abstract class Vilao extends Personagem implements Obstaculo {
    public Vilao(String nome, Integer vida, Integer mana, Integer forcaAtaque, PoderEspecial poderEspecial1) {
        super(nome, vida, mana, forcaAtaque, poderEspecial1);
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
