import personagens.herois.Dofer;
import personagens.herois.Heroi;
import personagens.herois.Rodan;
import personagens.viloes.Dataretan;
import personagens.viloes.Flegoman;
import personagens.viloes.Napda;

public class Main {
    //todo - modificadores final
    public static void main(String[] args) {
        Heroi jogador;

        System.out.println("Bem-vindo a JavaCity!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

        int opcaoHeroi = Interacao.EscolhaDoHeroi();
        if(opcaoHeroi == 1){
            jogador = new Dofer();
        }
        else{
            jogador = new Rodan();
        }
        jogador.contarHistoria();

        //batalhas
        System.out.println("\n" + jogador.getNome() + " encontrou  Flegoman, capanga de Napda e famoso dominador de pássaros negros\n");
        Interacao luta = new Interacao(jogador, new Flegoman());
        luta.batalhar();

        System.out.println("\n" + jogador.getNome() + " encontrou Dataretan, capanga de Napda e famoso mestre hipnotizador\n");
        luta = new Interacao(jogador, new Dataretan());
        luta.batalhar();

        System.out.println("\n" + jogador.getNome() + " encontrou o mago negro Napda\n");
        Napda napda = new Napda();
        luta = new Interacao(jogador, napda);
        luta.batalhar();
        if (napda.getVida().equals(napda.getMIN_VIDA())) jogador.contarHistoriaFim();
    }

}