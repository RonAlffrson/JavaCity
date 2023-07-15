package itens;

import personagens.herois.Heroi;

public final class PocaoMana extends Item{
    public PocaoMana(){
        this.nome = "Poção de mana";
        this.valorAtributo = 25;
    }
    @Override
    public String descricaoItem(){
         return  super.descricaoItem() + " Mana";
    }
    @Override
    public void diminuirItem(Heroi heroi){ // esse metodo aumenta a mana do heroi
        super.diminuirItem(heroi);
        if(quantidadeItem > 0){
            heroi.aumentarMana(valorAtributo);
        }
    }




}
