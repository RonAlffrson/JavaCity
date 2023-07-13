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
        System.out.println("Batalha:\n " + heroi.getNome() +" VS " + vilao.getNome());
        boolean validador = false;
        int opcaoJogaodor = 0;
        while(heroi.getVida() != 0 && vilao.getVida() != 0) {
            System.out.println(heroi.getNome() + "Tem " + heroi.getVida() + " / " + heroi.getMax_vida() + " de vida");

            System.out.println(vilao.getNome() + "Tem " + vilao.getVida());

           opcaoJogaodor = opcaoJogador();

            if(opcaoJogaodor == 1){
                // fazer o metodo opcaoAtaque


            }
            else if(opcaoJogaodor == 2){
                System.out.println("Item que você deseja usar:");
            }


        } // to pensando em criar o metodo opcoes jogaodr que retornar esse metodo
    }
    private static int opcaoJogador(){
        Scanner input = new Scanner(System.in);
        int opcaoJogaodor = 0;
        boolean validador = false;
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
        input.close();
        return  opcaoJogaodor;
    }
    public void opcaoAtaque(){
        int opcaoAtaque = 0;
        System.out.println("Opções de Ataque:");
        System.out.println("(1)" + heroi.getAtaquePadrao().descricao());
        System.out.print("(2)");
        heroi.getPoderEspecial1().printarDescricaoPoder();
        System.out.print("(3)");
        heroi.getPoderEspecial2().printarDescricaoPoder();
        System.out.println("(4) Voltar");

    }


}
