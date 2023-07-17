import personagens.herois.Dofer;
import personagens.herois.Heroi;
import personagens.herois.Rodan;
import personagens.viloes.Dataretan;
import personagens.viloes.Flegoman;
import personagens.viloes.Napda;

public class Main {
    public static void main(String[] args) {
        Heroi jogador;

        System.out.println("Bem-vindo a JavaCity!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

        int opcaoHeroi = Interacao.escolhaDoHeroi();
        if(opcaoHeroi == 1){
            jogador = new Dofer();
        }
        else{
            jogador = new Rodan();
        }
        jogador.contarHistoria();

        //batalhas
        System.out.println("Adentrando a mata da FLoresta Sombria de Sonfejer, " + jogador.getNome() + ", o herói ouve sons horripilantes de pássaros,\n" +
                "como se cada um deles estivesse sendo terrívemente torturado, ele olha para cima e vê a movimentação de dezenas de pássaros negros logo adiante,\n" +
                "o herói logo percebe do que se trata aquele estranho acontecimento.");
        System.out.println("\n" + jogador.getNome() + " encontrou Flegoman, famoso domador de pássaros negros\n");
        Interacao luta = new Interacao(jogador, new Flegoman());
        luta.batalhar();
        if(jogador.getVida() != 0) {

            System.out.println("Ao vencer Flegoman, " + jogador.getNome() + " se surpreendeu ao ver o conhecido Flegoman se juntar ao mago Napda,\n" +
                    "imaginou se mais criminosos teriam feito o mesmo.\n" +
                    "Avançando no terreno, próximo à entrada de uma caverna profunda " + jogador.getNome() +
                    " sente uma inesperada dor de cabeça, cada vez mais forte,\n" +
                    "sentia como se estivesse chegando perto de uma barreira psíquica, " +
                    "o que ele suspeitara era realidade.");

            System.out.println("\n" + jogador.getNome() + " encontrou Dataretan, famoso mestre hipnotizador\n");
            luta = new Interacao(jogador, new Dataretan());
            luta.batalhar();
        }
        if(jogador.getVida() != 0) {
            System.out.println("Dentro da caverna, " + jogador.getNome() + ", já cansado de suas prévias batalhas, enxerga de longe uma poção de vida,\n" +
                    "ele a toma e, rapidamente, regenera suas forças.\n" +
                    jogador.getNome() + " já estava sentindo o ar pesado, sabia que estava próximo de finalmente encontrar o mago negro Napda.\n" +
                    "Ele corre bravamente com tal determinação que o chão aos seus pés tremia. A névoa verde foi tomando conta do ar em seus pés e, finalmente, encontra Napda.\n" +
                    "'Ora ora ora, mal sabes que já estava lhe esperando, ó tão conhecido " + jogador.getNome() + ".\nVocê acha que vai conseguir frustrar meus planos de finalmente conquistar JavaCity?'\n" +
                    jogador.getNome() + " ouviu aquelas palavras proferidas pelo mago negro e sem pestanejar partiu para o ataque.\n");

            jogador.aumentarVida(25); //herói toma duas poções

            Napda napda = new Napda();
            luta = new Interacao(jogador, napda);
            luta.batalhar();
            if (napda.getVida().equals(napda.getMIN_VIDA())) jogador.contarHistoriaFim();
        }
    }
}