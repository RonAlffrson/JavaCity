package personagens;

public final class PoderEspecial {
    private String nome;
    private Integer atributo;
    private Integer custo;
    public PoderEspecial(String nome, Integer atributo, Integer custo) {
        this.nome = nome;
        this.atributo = atributo;
        this.custo = custo;
    }



    public String getNome() {
        return nome;
    }

    public Integer getAtributo() {
        return atributo;
    }

    public void setCusto(Integer custo) {
        this.custo = custo;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtributo(Integer atributo) {
        this.atributo = atributo;
    }
    public void printarDescricao(){
        System.out.println(getNome() + " - causa " + getAtributo() + " de danp e custa " +
                getAtributo() + "de mana ");
    }
}
