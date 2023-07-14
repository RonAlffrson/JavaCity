package itens;

public final class PocaoMana extends Item{
    public PocaoMana(){
        this.nome = "Poção de mana";
        this.valorAtributo = 25;
    }
    @Override
    public String descricaoItem(){
         return  super.descricaoItem() + " mana";
    }




}
