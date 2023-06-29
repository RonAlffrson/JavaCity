package personagens.viloes;

public abstract class Vilao implements Obstaculo {
    protected String nome;
    protected Integer vida = 100, mana = 0, forcaAtaque;
    protected final Integer MIN_VIDA = 0;

    @Override
    public void diminiurVida(Integer quantidadeVida) {
        if (vida - quantidadeVida >= MIN_VIDA) {
            vida -= quantidadeVida;
        }
        else if (vida - quantidadeVida < MIN_VIDA){
            vida = MIN_VIDA;
        }
    }
}
