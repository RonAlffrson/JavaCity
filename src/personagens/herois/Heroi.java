package personagens.herois;
import itens.*;
import java.util.ArrayList;

import personagens.AtaquePadrao;
import personagens.MultiplicadorDeAtaque;
import personagens.Personagem;
import personagens.PoderEspecial;
import personagens.viloes.Vilao;
// fazer uma classe mae da classe heroi e vilão com os elementos comuns entre elas
// fazer dois metodos genericos na classe heroi que serão usados  na classe filha para fazer os poder especiais

public abstract class Heroi extends Personagem implements AcoesHerois {

    protected ArrayList<Item> inventario = new ArrayList<>();
    protected final Integer MAX_MANA = 100, MIN_MANA = 0, MIN_VIDA = 0;
    protected PoderEspecial poderEspecial2;

    public Heroi(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1, PoderEspecial poderEspecial2) {
        super(nome, vida, mana, ataquePadrao, poderEspecial1);
        this.inventario.add(new PocaoMana());
        this.inventario.add(new PocaoVida());
        this.poderEspecial2 = poderEspecial2;
    }

    public static void verificarOpcaoHeroi(int opcaoHeroi) throws IllegalArgumentException{
        if(opcaoHeroi != 1 && opcaoHeroi != 2){
            throw new IllegalArgumentException("Erro: Digite 1 ou 2 para escolher o heroi");
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
    public void aumentarVidaRodada(){
        aumentarVida(3);
    }



    @Override
    public void adicionarQuantidadeItem(int opcao) { // 0 porcao de mana, 1 porcao de vida
        if(opcao == 0){
            this.inventario.get(0).adicionarItem(); // recebe uma pocao de mana
        }
        else if(opcao == 1){
            this.inventario.get(0).adicionarItem(); // recebe uma pocao de vida
        }
    }

    @Override
    public void poderEspecial2(){
        if (mana >= poderEspecial2.getCusto()){
            diminuirMana(poderEspecial2.getAtributo());
            aumentarVida(poderEspecial2.getAtributo());
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }


}
