package personagens;

public final class PoderEspecial {
    private String nome;
    private Integer atributo;
    private Integer custo;
    private Integer categoria;
    public PoderEspecial(String nome, Integer atributo, Integer custo, Integer categoria) {
        setNome(nome);
        setAtributo(atributo);
        setCusto(custo);
        setCategoria(categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!(nome.isEmpty()))
            this.nome = nome;
        else
            throw new IllegalArgumentException("Nome deve ser uma String não vazia");
    }

    public Integer getCusto() {
        return custo;
    }

    public void setCusto(Integer custo) {
        if (custo >= 0)
            this.custo = custo;
        else
            throw new IllegalArgumentException("Custo deve ser um número inteiro positivo");
    }

    public Integer getAtributo() {
        return atributo;
    }

    public void setAtributo(Integer atributo) {
        this.atributo = atributo;
    }

    public Integer getCategoria(){return categoria;}

    public void setCategoria(Integer categoria) {
        if (categoria == 1 || categoria == 2)
            this.categoria = categoria;
        else
            throw new IllegalArgumentException("Categoria deve ser 1 ou 2");
    }

    public void printarDescricaoPoder(){
        switch (categoria){
            case 1 -> System.out.println(getNome() + " - causa: " + getAtributo() + " de dano e custa: " +
                    getAtributo() + " de mana");
            case 2 -> System.out.println(getNome() + " - gera: " + getAtributo() + " de vida e custa: " +
                    getAtributo() + " de mana");
        }
    }
}
