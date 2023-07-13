package personagens.herois;
import itens.*;
import java.util.ArrayList;

import personagens.AtaquePadrao;
import personagens.Personagem;
import personagens.PoderEspecial;

public abstract class Heroi extends Personagem implements AcoesHerois {

    public ArrayList<Item> inventario = new ArrayList<>();
    protected final Integer MAX_MANA = 100, MIN_MANA = 0, MIN_VIDA = 0;
    protected PoderEspecial poderEspecial2;
    protected Integer max_vida;

    public ArrayList<Item> getInventario() {
        return inventario;
    }

    @Override
    public Integer getMAX_MANA() {
        return MAX_MANA;
    }

    @Override
    public Integer getMIN_MANA() {
        return MIN_MANA;
    }

    @Override
    public Integer getMIN_VIDA() {
        return MIN_VIDA;
    }

    public PoderEspecial getPoderEspecial2() {
        return poderEspecial2;
    }

    public Heroi(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1, PoderEspecial poderEspecial2, Integer max_vida) {
        super(nome, vida, mana, ataquePadrao, poderEspecial1);
        setMax_vida(max_vida);
        this.inventario.add(new PocaoMana());
        this.inventario.add(new PocaoVida());
        this.poderEspecial2 = poderEspecial2;
    }

    public Integer getMax_vida() {
        return max_vida;
    }

    public void setMax_vida(Integer max_vida) {
        if (max_vida > 0)
            this.max_vida = max_vida;
        else
            throw new IllegalArgumentException("Vida máxima deve ser um inteiro maior que zero ");
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
    public void aumentarVida(int quantidadeVida) {
        if (vida + quantidadeVida <= max_vida) {
            vida += quantidadeVida;
        }
        else if (vida + quantidadeVida > max_vida){
            vida = max_vida;
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
