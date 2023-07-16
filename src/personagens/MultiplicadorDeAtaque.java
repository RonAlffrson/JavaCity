package personagens;

public final class MultiplicadorDeAtaque {
    public static int multiplicadorDeAtaque(){
        int sorteador = (int) (Math.random() * 11);

        if(sorteador < 1){ // 0
            return 0;
        }
        else if(sorteador < 7){ // 1 a 6
            return 1;
        }
        else { // 7 a 10
            return 2;
        }
    }
}
