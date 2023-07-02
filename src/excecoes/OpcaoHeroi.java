package excecoes;

public class OpcaoHeroi extends IllegalArgumentException {
    public static void verificarOpcaoHeroi(int opcaoHeroi) throws IllegalArgumentException{
        if(opcaoHeroi != 1 && opcaoHeroi != 2){
            throw new IllegalArgumentException("Erro: Diite 1 ou 2 para escolher o heroi");
        }
    }
}
