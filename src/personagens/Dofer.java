package personagens;

public final class Dofer extends Heroi implements Personagem {
    private final Integer MAX_VIDA = 100;
    public Dofer(){
        this.nome = "Dofer";
        this.vida = 100;
        this.forcaAtaque = 3;
    }
    @Override
    public void contarHistoria() {
        System.out.print("""
                Respeitado cavaleiro da Guarda Real de Javacity, Dofer,
                 estava mais um dia na guarda das muralhas da cidade quando, com um som ensurdecedor,
                 uma luz verde em forma de garra, rapidamente se materializando, emana das sombras e mata
                 seu irmão e parceiro de armas Mikelos. Ao vê-lo Dofer utiliza seu famoso ataque espada flamejante
                 e parte para cima da garra que, para sua surpresa, superou sua extrema velocidade e ataca-o
                 antes que pudesse sequer arranhá-la, o cavaleiro caiu paralisado e, fechando os olhos,
                 viu por alguns instantes a garra voltando para as sombras e espairecer lentamente.
                 Semanas após o ocorrido, Dofer encontra-se no hospital e, ao abrir seus olhos, começa
                 a sentir uma dor latente em seu peito, ele olha para baixo e vê um buraco onde seu coração
                 deveria estar. Dofer gritou e gritou até que o médico de plantão chega tentando acalmá-lo e
                 explicá-lo um pouco mais sobre o seu estado ao chegar no hospital.
                 O médico contou que em seu peito havia um buraco de aproximadamente um palmo de largura
                , sob intensas hemorragias, seu coração estava batendo exposto, quase como se quisesse
                 desprender-se do corpo do cavaleiro. Além disso, em seu coração havia uma substância verde,
                 acídica, corroendo sua carne, que o doutor nunca vira antes, mas que suspeitava ser algum tipo
                 de magia negra. Infelizmente, a única solução para salvá-lo foi retirar seu coração infectado e
                 realizar um tratamento intensivo de materialização de mana — energia mágica que todos os seres
                 humanos compartilham, ainda que em níveis diferentes, e que pode ser transferida para outro corpo —, 
                 com os magos renomados da cidade tentando um procedimento arriscado de criar um proto-coração com 
                 sua já existente mana e com a energia doada pelos humildes habitantes de Javacity, 
                 mas apesar do êxito no tratamento, o médico o avisou que ele nunca mais teria o mesmo vigor, 
                 as mesmas forças e a mesma mana em seu corpo que antes. 
                 Desde esse dia, Dofer treinou ininterruptamente por dois anos, em dias quentes e noites chuvosas, 
                 ultrapassando a fadiga de cada músculo em seu corpo para partir em busca do assassino de seu irmão. 
                 Após cinco anos de uma jornada incansável por respostas, o cavaleiro ouviu boatos de que ao Sul de Javacity, 
                 nos subterrâneos da Floresta Sombria de Sonfejer habitava um mago negro que realizava experimentos que 
                 emanavam longínquas e estranhas luzes verdes, o herói sentiu sua espinha arrepiar, o cavaleiro já sabia o que fazer.""");
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
        if (this.mana + 3 <= MAX_MANA) {
            this.mana += 3;
        }
        else if ( this.mana + 3 > MAX_MANA){
            this.mana = MAX_MANA;
        }
    }

    @Override
    public void aumentarVida(Integer quantidadeVida) {

    }

    @Override
    public void diminiurVida(Integer quantidadeVida) {

    }


}