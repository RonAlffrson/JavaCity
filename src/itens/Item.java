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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorAtributo(double valorAtributo) {
        this.valorAtributo = valorAtributo;
    }

    public void setQuantidadeItem(Integer quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public String descricaoItem(){
        return getNome() + " recupera " + getValorAtributo();
    }

}
