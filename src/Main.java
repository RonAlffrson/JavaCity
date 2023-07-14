import personagens.MultiplicadorDeAtaque;
import personagens.herois.Dofer;
import personagens.herois.Heroi;
import personagens.herois.Rodan;
import personagens.viloes.Flegoman;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Heroi jogador;

        Luta.mensagemInicio();
        int opcaoHeroi = Luta.EscolhadoHeroi();
        if(opcaoHeroi == 1){
            jogador = new Dofer();
        }
        else{
            jogador = new Rodan();
        }
        jogador.contarHistoria();

        Luta luta = new Luta(jogador, new Flegoman()); // primeira luta
        luta.batalhar();
    }

}