package personagens.herois;
import itens.*;
import java.util.ArrayList;
import java.util.Scanner;

import personagens.AtaquePadrao;
import personagens.MultiplicadorDeAtaque;
import personagens.Personagem;
import personagens.PoderEspecial;
import personagens.viloes.Vilao;

public abstract class Heroi extends Personagem implements AcoesHerois {

    public ArrayList<Item> inventario = new ArrayList<>();
    protected final Integer MAX_MANA = 100, MIN_MANA = 0, MIN_VIDA = 0;
    protected PoderEspecial poderEspecial2;

    public Heroi(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1, PoderEspecial poderEspecial2) {
        super(nome, vida, mana, ataquePadrao, poderEspecial1);
        this.inventario.add(new PocaoMana());
        this.inventario.add(new PocaoVida());
        this.poderEspecial2 = poderEspecial2;
    }

    public static void verificarOpcaoHeroi(int opcaoHeroi) throws ErroOpcaoHeroiException{
        if(opcaoHeroi != 1 && opcaoHeroi != 2){
            throw new ErroOpcaoHeroiException("Erro: Digite 1 ou 2 para escolher o heroi");
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
    public void adicionarItem(int opcao) { // 0 pocao de mana, 1 pocao de vida
        if(opcao == 0){
            System.out.println();
            this.inventario.get(0).adicionarItem(); // recebe uma pocao de mana
        }
        else if(opcao == 1){
            this.inventario.get(1).adicionarItem(); // recebe uma pocao de vida
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
