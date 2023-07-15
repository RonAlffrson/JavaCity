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

        interacao luta = new interacao(jogador, new Flegoman());
        luta.batalhar();

        luta = new interacao(jogador, new Dataretan());
        luta.batalhar();

        luta = new interacao(jogador, new Napda());
        luta.batalhar();
    }

}