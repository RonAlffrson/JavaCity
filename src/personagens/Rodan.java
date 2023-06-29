package personagens;

public final class Rodan extends Heroi implements Personagem {

    public Rodan (){
        this.nome = "Rodan";
        this.vida = 70;
        this.forcaAtaque = 5;
    }

    @Override
    public void contarHistoria() {

    }

    @Override
    public void poderEspecial1() {
        String nome = "Tempestade de Flechas";
        int dano = 15;
//todo - poder especial 1 vai ter como parametro um vilão/obstáculo e vair diminuir a vida dele


    }
    public void poderEspecial2() {
        String nome = "Regeneração Completa";
        aumentarVida(30);
    }

    @Override
    public void ataquePadrao(){
//todo - ataque padrão vai ter como parametro um vilão/obstáculo e vair diminuir a vida dele
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
        int MAX_VIDA = 70;
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

    @Override
    public void aumentarVidaRodada(){
        aumentarVida(3);
    }

}
