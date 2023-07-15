package itens;

import personagens.herois.Heroi;

public final class PocaoVida extends Item {
    public PocaoVida(){
        this.nome = "Poção de vida";
        this.valorAtributo = 25;
    }
    @Override
    public String descricaoItem(){
        return  super.descricaoItem() + " Vida";
    }
    @Override
    public void diminuirItem(Heroi heroi) { // esse metodo aumenta a vida  do heroi
        super.diminuirItem(heroi);
        if (quantidadeItem > 0) {
            heroi.aumentarVida(valorAtributo);

        }

    }

}
