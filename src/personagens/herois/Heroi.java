package personagens.herois;
import itens.*;
import java.util.ArrayList;
import itens.Carteira;
import personagens.Personagem;
import personagens.PoderEspecial;
import personagens.viloes.Vilao;
// fazer uma classe mae da classe heroi e vilão com os elementos comuns entre elas
// fazer dois metodos genericos na classe heroi que serão usados  na classe filha para fazer os poder especiais

public abstract class Heroi extends Personagem implements AcoesPersonagem {

    protected ArrayList<Item> inventario = new ArrayList<>();
    protected final Integer MAX_MANA = 100, MIN_MANA = 0, MIN_VIDA = 0;
    protected PoderEspecial poderEspecial2;

    public Heroi(String nome, Integer vida, Integer mana, Integer forcaAtaque, PoderEspecial poderEspecial1, ArrayList<Item> inventario, PoderEspecial poderEspecial2) {
        super(nome, vida, mana, forcaAtaque, poderEspecial1);
        this.inventario = inventario;
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
    public void aumentarVida(int quantidadeVida) {
        int MAX_VIDA = 70;
        if (vida + quantidadeVida <= MAX_VIDA) {
            vida += quantidadeVida;
        }
        else if (vida + quantidadeVida > MAX_VIDA){
            vida = MAX_VIDA;
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
    public void aumentarManaRodada(){
        aumentarMana(5);
    }

    @Override
    public void adicionarItem(Item item){
        inventario.add(item);
    }
    @Override
    public void poderEspecial1(Vilao vilao) {
        if (mana >= poderEspecial1.getAtributo()){
            diminuirMana(poderEspecial1.getAtributo());
            vilao.diminiurVida(poderEspecial1.getAtributo());
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }

}
