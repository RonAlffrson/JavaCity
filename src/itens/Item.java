package itens;

import personagens.herois.Heroi;

public abstract class Item {
    protected String nome;
    protected Integer valorAtributo;
    protected Integer quantidadeItem = 1;

    public String getNome() {
        return nome;
    }

    public double getValorAtributo() {
        return valorAtributo;
    }

    public Integer getQuantidadeItem() {
        return quantidadeItem;
    }

    public void adicionarItem(){
        quantidadeItem++;
    }
    public void diminuirItem(Heroi heroi){ // falta fazer esse metodo corretamente
        if(quantidadeItem > 0 ) {
            quantidadeItem--; //
        }
        else{
            System.out.println("Você não tem " + getNome() +" no iventario");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorAtributo(Integer valorAtributo) {
        this.valorAtributo = valorAtributo;
    }

    public void setQuantidadeItem(Integer quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public String descricaoItem(){
        return getNome() + " recupera " + getValorAtributo();
    }

}
