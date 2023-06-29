package personagens;

public final class Rodan extends Heroi implements Personagem {
    private final Integer MAX_VIDA = 70;

    public Rodan (){
        this.nome = "Rodan";
        this.vida = 70;
        this.forcaAtaque = 5;
    }

    @Override
    public void contarHistoria() {

    }

    @Override
    public void poderEspecial() {

    }

    @Override
    public void adicionarItem(){

    }

    @Override
    public void ataquePadrao(){

    }
    @Override
    public void aumentarMana(){
        if (mana + 5 <= MAX_MANA) {
            mana += 5;
        }
        else if (mana + 5 > MAX_MANA){
            mana = MAX_MANA;
        }
    }

    @Override
    public void aumentarVida(Integer quantidadeVida) {
        if (vida + quantidadeVida <= MAX_VIDA) {
            vida += quantidadeVida;
        }
        else if (vida + quantidadeVida > MAX_VIDA){
            vida = MAX_VIDA;
        }
    }

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
