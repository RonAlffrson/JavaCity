package personagens.herois;

import personagens.viloes.Vilao;

public final class Rodan extends Heroi {

    public Rodan (){
        this.nome = "Rodan";
        this.classe = "Mago";
        this.vida = 70;
        this.forcaAtaque = 5;
    }

    @Override
    public void contarHistoria() {
        System.out.print("""
                Nascido em Java City, Rodan abandonou uma infância comum para treinar as artes mágicas em Arquinnus,
                famosa cidade dos magos à Leste de Java City, após ser encontrado pelo renomado mago-mestre Alighieri criando pequenas
                bolas de energia próximo aos limites da cidade. Mostrando talento e sabedoria, o jovem começava a se tornar tão
                famoso quanto seu mestre e, assim, ganha de Alighieri a permissão para desvencilhar-se de seus caminhos de aprendiz.\s
                Quinze anos depois, lutando na famosa Batalha de Latibrurves, o mago recebeu, no lugar do príncipe, uma flecha envenenada
                com uma substância verde em seu abdômen. Quase aceitando seu destino, ele foi salvo graças a uma jovem médica chamada Júliper que,
                vendo distante o ocorrido, fora rápida o suficiente para retirar a flecha antes que o veneno se alastrasse pelo corpo.
                Rodan apaixona-se por sua salvadora e casa-se com a moça após ganhar seu coração. Após o acontecimento chegar nos ouvidos do rei
                de Java City, Rodan tornou-se o mago-mestre conselheiro do rei.\s
                No ano seguinte, arrumando sua biblioteca, o mago encontra um bilhete em sua mesa que, instantes atrás,
                não estava ali. Em uma língua antiga, que quase não pôde decifrar, estava escrito: “A flecha não foi atirada em vão”,
                imediatamente correu para sua casa e encontrou Júliper petrificada, felizmente, com vida. Rodan entendera tudo,
                o emissário da flecha sabia que se atirasse nele ele conseguiria desviar, mas mudando o alvo para o príncipe o mago colocaria-se na frente
                da flecha, era ele quem deveria estar paralisado. Não sabendo o que fazer, ele foi de encontro ao seu antigo mestre Alighieri
                em busca de respostas. Alighieri o disse que antes de Rodan, ele tivera outro pupilo, seu nome era Napda. Por anos,
                Napda fora seu único aprendiz. Num dia, entretanto, quando viu que seu mestre decidiu ensinar outro jovem, seu coração nublou-se de inveja.
                Napda nunca mais fora o mesmo. Alighieri dormia tranquilo uma noite quando, acordado por uma estranha luz verde que saía do quarto de seu
                novo aprendiz, encontrou o jovem paralisado. Napda, depois disso, nunca mais fora visto e Alighieri deixou o outro rapaz aos cuidados do
                hospital de Arquinnus e, depois de dez meses tentando curá-lo, seu coração súbitamente parou. Rodan sabia que era Napda quem ele deveria
                encontrar, o primeiro aprendiz de seu antigo mestre, agora, um mago negro.\s
                Por nove meses Rodan procurou por Napda, havia pouco tempo. Ele volta para Java City para tentar reunir informações e ver o estado de Júliper e,
                para sua surpresa, ouve boatos de que, na Floresta Sombria de Sonfejer, foram vistas estranhas luzes verdes no fundo da mata, ele sabia
                que a salvação de sua amada finalmente estava próxima.                                                                                                            \s
                """);
    }
//todo descrição dos ataques
    @Override
    public void poderEspecial1(Vilao vilao) {
        String nome = "Tempestade de Flechas";
        if (mana >= 30){
            int dano = 15;
            diminuirMana(30);
            vilao.diminiurVida(dano);
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }

    public void poderEspecial2() {
        String nome = "Regeneração Completa";
        String descricao;
        if (mana >= 50){
            diminuirMana(50);
            aumentarVida(40);
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }

    @Override
    public void ataquePadrao(Vilao vilao){
        String nome = "Bola de Energia";
        vilao.diminiurVida(forcaAtaque);
    }

}
