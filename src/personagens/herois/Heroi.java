package personagens.herois;
import itens.*;
import java.util.ArrayList;

import personagens.AtaquePadrao;
import personagens.Personagem;
import personagens.PoderEspecial;

public abstract class Heroi extends Personagem implements AcoesHerois {

    protected ArrayList<Item> inventario = new ArrayList<>();
    protected PoderEspecial poderEspecial2;
    protected Integer max_vida;

    public Heroi(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1, PoderEspecial poderEspecial2, Integer max_vida) {
        super(nome, vida, mana, ataquePadrao, poderEspecial1);
        setMax_vida(max_vida);
        this.inventario.add(new PocaoMana());
        this.inventario.add(new PocaoVida());
        this.poderEspecial2 = poderEspecial2;
    }



    public static void verificarOpcaoHeroi(int opcaoHeroi) throws ErroOpcaoHeroiException{
        if(opcaoHeroi != 1 && opcaoHeroi != 2){
            throw new ErroOpcaoHeroiException("Digite 1 ou 2 para escolher o heroi");
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

    public void setInventario(ArrayList<Item> inventario) {
        this.inventario = inventario;
    }

    public void setPoderEspecial2(PoderEspecial poderEspecial2) {
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
    public ArrayList<Item> getInventario() {
        return inventario;
    }

    public PoderEspecial getPoderEspecial2() {
        return poderEspecial2;
    }

}
