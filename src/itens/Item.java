package itens;

public abstract class Item {
    protected String nome;
    protected double valorAtributo;
    protected Integer quantidadeItem = 0;

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
    public void diminuirItem(){
        if(quantidadeItem > 0 ) {
            quantidadeItem--;
        }
        else{
            System.out.println("Você não tem " + getNome() +" no iventario");
        }
    }
    public String descricaoItem(){
        return getNome() + " recupera " + getValorAtributo();
    }

}
