import personagens.herois.Dofer;
import personagens.herois.Heroi;
import personagens.herois.Rodan;
import personagens.viloes.Dataretan;
import personagens.viloes.Flegoman;
import personagens.viloes.Napda;

public class Main {
    public static void main(String[] args) {
        Heroi jogador;

        System.out.println("Bem-vindo a JavaCity");
        System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        int opcaoHeroi = interacao.EscolhadoHeroi();
        if(opcaoHeroi == 1){
            jogador = new Dofer();
        }
        else{
            jogador = new Rodan();
        }
        jogador.contarHistoria();

        System.out.println(jogador.getNome() + " encontrou  Flegoman, capanga de Napda e famoso dominador de pássaros negros\n");
        interacao luta = new interacao(jogador, new Flegoman());
        luta.batalhar();

        System.out.println(jogador.getNome() + " encontrou Dataretan, capanga de Napda e famoso mestre hipnotizador\n");
        luta = new interacao(jogador, new Dataretan());
        luta.batalhar();

        System.out.println(jogador.getNome() + " encontrou o mago negro Napda\n");
        Napda napda = new Napda();
        luta = new interacao(jogador, napda);
        luta.batalhar();
        if (napda.getVida().equals(napda.getMIN_VIDA())) jogador.contarHistoriaFim();


    }

}