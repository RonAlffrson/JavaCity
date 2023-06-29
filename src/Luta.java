import personagens.herois.Heroi;
import personagens.viloes.Vilao;

public class Luta {
    private Heroi heroi;
    private Vilao vilao;
    private int contadorRodadas;

    public Luta(Heroi heroi, Vilao vilao){
        this.heroi = heroi;
        this.vilao = vilao;
    }
}
