import personagens.herois.Heroi;
import personagens.viloes.Vilao;
import java.util.*;


public class Luta {
    public Heroi heroi;
    public Vilao vilao;
    public int contadorRodadas = 0;

    public Luta(Heroi heroi, Vilao vilao){
        this.heroi = heroi;
        this.vilao = vilao;

    }
    public static void mensagemInicio(){
        System.out.println("Bem-vindo a JavaCity");
        System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public static int EscolhadoHeroi(){
        boolean validador = false;
        int opcaoHeroi = 0;
        Scanner input = new Scanner(System.in);
        do {
            try {
                validador = true;
                System.out.println("""
                            Escolha seu heroi:
                            (1) Dofer - Cavaleiro
                            (2) Ronan - Mago""");
                opcaoHeroi = input.nextInt();
                Heroi.verificarOpcaoHeroi(opcaoHeroi); // esse metodo lanca uma exceçãp
            }
            catch (InputMismatchException e) {
                input.nextLine();
                validador = false;
                System.out.println("Erro : Digite 1 ou 2 para escolher o heroi\n");
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage() + "\n");
                validador = false;
            }
            catch (Exception e){
                input.nextLine();
                System.out.println("Erro desconhecido: digite um valor valido");
                validador = false;
            }

        } while (!validador);
        input.close();
        return opcaoHeroi;
    }
    public static void batalhar(Heroi heroi, Vilao vilao){
        Scanner input = new Scanner(System.in);
        System.out.println("Batalha:\n " + heroi.getNome() +" VS " + vilao.getNome());
        boolean validador = false;
        int opcaoJogaodor = 0;
        while(heroi.getVida() != 0 && vilao.getVida() != 0) {
            System.out.println(heroi.getNome() + "Tem " + heroi.getVida() + " / " + heroi.getMax_vida() + " de vida");
            System.out.println(vilao.getNome() + "Tem " + vilao.getVida());
            while(!validador) {
                try {
                    validador = true;
                    System.out.println("Opções do jogador:\n");
                    System.out.println("(1) Ataques");
                    System.out.println("(2) Iventario");
                    System.out.println("Digite a opção desejada: ");
                    opcaoJogaodor = input.nextInt();
                    Heroi.verificarOpcaoHeroi(opcaoJogaodor); // esse metodo lanca uma exceçãp
                } catch (InputMismatchException e) {
                    input.nextLine();
                    validador = false;
                    System.out.println("Erro : Digite 1 ou 2 para escolher a opção desejada\n");
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro : Digite 1 ou 2 para escolher a opção desejada\n");
                    validador = false;
                } catch (Exception e) {
                    input.nextLine();
                    System.out.println("Erro desconhecido: digite um valor valido");
                    validador = false;
                }
            } // fim do while validador
            if(opcaoJogaodor == 1){
                System.out.println("Opções de Ataque:");
            }


        }
    }


}
