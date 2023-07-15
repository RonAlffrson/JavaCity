package itens;

import personagens.herois.Heroi;

public final class PocaoMana extends Item{
    public PocaoMana(){
        setNome("Poção de mana");
        setValorAtributo(25);
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
