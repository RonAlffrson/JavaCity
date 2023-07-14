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
    public void decidirAtaque(Heroi heroi) {
        if (mana < poderEspecial1.getCusto()){

            System.out.println(nome + " usou " + ataquePadrao.getNome() + " em " + heroi.getNome());
            ataquePadrao(heroi);
        }
        else{
            System.out.println(nome + " usou " + poderEspecial1.getNome() + " em " + heroi.getNome());
            poderEspecial1(heroi);
        }
    }

    @Override
    public void sortearPocao(Heroi heroi){
        Random random = new Random();
        int opcao = random.nextInt(2);
        //Retorna um número entre 0-1
        if (getVida() == 0){
            if (opcao == 0)
                System.out.println(heroi.getNome() + "recebeu uma poção de mana");
            else
                System.out.println(heroi.getNome() + "recebeu uma poção de vida");
            heroi.adicionarItem(opcao);
        }
    }
}
