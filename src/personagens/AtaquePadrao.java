package personagens;

public class AtaquePadrao {
    private String nome;
    private Integer forcaAtaque;

    public AtaquePadrao(String nome, Integer forcaAtaque) {
        setNome(nome);
        setForcaAtaque(forcaAtaque);
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

    public Integer getForcaAtaque() {
        return forcaAtaque;
    }

    public void setForcaAtaque(Integer forcaAtaque) {
        if (forcaAtaque > 0)
            this.forcaAtaque = forcaAtaque;
        else
            throw new IllegalArgumentException("Força de Ataque deve ser maior um inteiro que zero");
    }
    public  String  descricao(){
         return getNome() +" - causa " + getForcaAtaque() + " de dano";
    }

}
