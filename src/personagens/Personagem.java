package personagens;


public abstract class Personagem implements AcoesPersonagem {
    protected String nome;
    protected Integer vida, mana = 0;
    protected final Integer MAX_MANA = 100, MIN_MANA = 0, MIN_VIDA = 0;
    protected PoderEspecial poderEspecial1;
    protected AtaquePadrao ataquePadrao;

    public Personagem(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1) {
        setNome(nome);
        setVida(vida);
        setMana(mana);
        setAtaquePadrao(ataquePadrao);
        setPoderEspecial1(poderEspecial1);
    }
    @Override
    public void poderEspecial1(Personagem personagem) {
        if (mana >= poderEspecial1.getAtributo()){
            diminuirMana(poderEspecial1.getAtributo());
            personagem.diminiurVida(poderEspecial1.getAtributo() * MultiplicadorDeAtaque.multiplicadorDeAtaque());
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }
    @Override
    public void ataquePadrao(Personagem personagem){
        personagem.diminiurVida(ataquePadrao.getForcaAtaque() * MultiplicadorDeAtaque.multiplicadorDeAtaque());
    }
    @Override
    public void diminuirMana(int quantidadeMana) {
        if (mana - quantidadeMana >= MIN_MANA) {
            mana -= quantidadeMana;
        }
        else if (mana - quantidadeMana < MIN_MANA){
            mana = MAX_MANA;
        }
    }

    @Override
    public void diminiurVida(int quantidadeVida) {
        if (vida - quantidadeVida >= MIN_VIDA) {
            vida -= quantidadeVida;
        }
        else if (vida - quantidadeVida < MIN_VIDA){
            vida = MIN_VIDA;
        }
    }
    @Override
    public void aumentarMana(int quantidadeMana){
        if (mana + quantidadeMana <= MAX_MANA) {
            mana += quantidadeMana;
        }
        else if (mana + quantidadeMana > MAX_MANA){
            mana = MAX_MANA;
        }
    }

    @Override
    public void aumentarManaRodada() {
        aumentarMana(5);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty())
            this.nome = nome;
        else
            throw new RuntimeException("Nome deve ser uma String não vazia");
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        if (vida >= 0)
            this.vida = vida;
        else
            throw new IllegalArgumentException("Vida deve ser um número inteiro positivo");
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        if(mana >= 0)
            this.mana = mana;
        else
            throw new IllegalArgumentException("Mana deve ser um número inteiro");
    }

    public Integer getMAX_MANA() {
        return MAX_MANA;
    }

    public Integer getMIN_MANA() {
        return MIN_MANA;
    }

    public Integer getMIN_VIDA() {
        return MIN_VIDA;
    }

    public PoderEspecial getPoderEspecial1() {
        return poderEspecial1;
    }

    public void setPoderEspecial1(PoderEspecial poderEspecial1) {
        this.poderEspecial1 = poderEspecial1;
    }

    public AtaquePadrao getAtaquePadrao() {
        return ataquePadrao;
    }

    public void setAtaquePadrao(AtaquePadrao ataquePadrao) {
        this.ataquePadrao = ataquePadrao;
    }
}
