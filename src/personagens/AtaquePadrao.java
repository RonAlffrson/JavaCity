package personagens;

public class AtaquePadrao {
    private String nome;
    private Integer forcaAtaque;

    public AtaquePadrao(String nome, Integer forcaAtaque) {
        this.nome = nome;
        this.forcaAtaque= forcaAtaque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getForcaAtaque() {
        return forcaAtaque;
    }

    public void setForcaAtaque(Integer forcaAtaque) {
        this.forcaAtaque = forcaAtaque;
    }
}
