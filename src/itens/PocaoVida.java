package itens;

public final class PocaoVida extends Item {
    public PocaoVida(){
        this.nome = "Poção de vida";
        this.valorAtributo = 25;
    }
    @Override
    public String descricaoItem(){
        return  super.descricaoItem() + " Vida";
    }

}
