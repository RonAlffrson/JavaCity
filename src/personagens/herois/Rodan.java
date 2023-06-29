package personagens.herois;

import personagens.viloes.Vilao;

public final class Rodan extends Heroi {

    public Rodan (){
        this.nome = "Rodan";
        this.classe = "Mago";
        this.vida = 70;
        this.forcaAtaque = 5;
    }

    @Override
    public void contarHistoria() {

    }

    @Override
    public void poderEspecial1(Vilao vilao) {
        String nome = "Tempestade de Flechas";
        if (mana >= 30){
            int dano = 15;
            diminuirMana(30);
            vilao.diminiurVida(dano);
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }

    public void poderEspecial2() {
        String nome = "Regeneração Completa";
        if (mana >= 50){
            diminuirMana(50);
            aumentarVida(30);
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }

    @Override
    public void ataquePadrao(Vilao vilao){
        String nome = "Bola de Energia";
        vilao.diminiurVida(forcaAtaque);
    }

    @Override
    public void aumentarMana(Integer quantidadeMana){
        if (mana + quantidadeMana <= MAX_MANA) {
            mana += quantidadeMana;
        }
        else if (mana + quantidadeMana > MAX_MANA){
            mana = MAX_MANA;
        }
    }

    @Override
    public void diminuirMana(Integer quantidadeMana) {
        if (mana - quantidadeMana >= MIN_MANA) {
            mana -= quantidadeMana;
        }
        else if (mana - quantidadeMana < MIN_MANA){
            mana = MAX_MANA;
        }
    }

    @Override
    public void aumentarVida(Integer quantidadeVida) {
        int MAX_VIDA = 70;
        if (vida + quantidadeVida <= MAX_VIDA) {
            vida += quantidadeVida;
        }
        else if (vida + quantidadeVida > MAX_VIDA){
            vida = MAX_VIDA;
        }
    }

    @Override
    public void diminiurVida(Integer quantidadeVida) {
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
    public void aumentarManaRodada(){
        aumentarMana(5);
    }

}
