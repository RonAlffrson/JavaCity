package personagens;

public final class Rodan extends Heroi implements Personagem {
    private final Integer MAX_VIDA = 70;

    public Rodan (){
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
    public void adicionarItem() {

    }

    @Override
    public void ataquePadrao() {

    }
    @Override
    public void aumentarMana(){
        if(this.mana + 5 <= MAX_MANA) {
            this.mana += 5;
        }
        else if( this.mana + 5 > MAX_MANA){
            this.mana = MAX_MANA;
        }
    }

    @Override
    public void alterarVida(Integer quantidadeVida) {

    }

}
