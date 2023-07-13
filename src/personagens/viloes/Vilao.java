package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.Personagem;
import personagens.PoderEspecial;
import personagens.herois.Heroi;

import java.util.Random;

public abstract class Vilao extends Personagem implements AcoesViloes {
    public Vilao(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1) {
        super(nome, vida, mana, ataquePadrao, poderEspecial1);
    }

    @Override
    public void decidirAtaque(Personagem personagem) {
        if (mana < poderEspecial1.getCusto()){
            ataquePadrao(personagem);
        }
        else{
            poderEspecial1(personagem);
        }
    }

    @Override
    public void sortearPocao(Heroi heroi){
        Random random = new Random();
        int opcao = random.nextInt(2);
        //Retorna um número entre 0-1
        if (getVida() == 0){
            heroi.adicionarItem(opcao);
        }
    }
}
