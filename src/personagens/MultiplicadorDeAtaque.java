package personagens;

public final class MultiplicadorDeAtaque {
    public static int multiplicadorDeAtaque(){
        int sorteador = (int) (Math.random() * 11);

        if(sorteador < 2){ // 0 ou 1
            return 0;
        }
        else if(sorteador < 9){ // 2 a 8
            return 1;
        }
        else { // 9 e 10
            return 2;
        }
    }
}
