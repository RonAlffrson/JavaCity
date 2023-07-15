import personagens.herois.Heroi;
import personagens.viloes.Vilao;
import java.util.*;


public class Luta {
    public  Heroi heroi;
    public Vilao vilao;
    public int contadorRodadas = 1;

    public Luta(Heroi heroi, Vilao vilao){
        this.heroi = heroi;
        this.vilao = vilao;
        //todo - método batalhar no construtor

    }
    public static void lancarExcecaoOpcaoAtaque(int opcaoAtaque) throws ErroOpcaoAtaqueException{
        if(!(opcaoAtaque >= 1 && opcaoAtaque <= 4)){
            throw new ErroOpcaoAtaqueException("Erro : digite um valor entre 1 e 4");
        }
    }
    //todo - não faz sentido deixar o método mensagemInicio() nessa classe
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
        return opcaoHeroi;
    }
    public void batalhar(){
        boolean validador = false;
        int opcaoJogaodor;

        System.out.println("    Batalha:\n" + heroi.getNome() +" VS " + vilao.getNome());

        while(heroi.getVida() != 0 && vilao.getVida() != 0) {
            System.out.println("\n" + vilao.getNome() + "\n-Vida: " + vilao.getVida() + " / " + vilao.getMax_vida()+ "\n");
            System.out.println(heroi.getNome() + "\n-Vida: " + heroi.getVida() + " / " + heroi.getMax_vida() +
                    "\n-Mana: " + heroi.getMana() + " / " + heroi.getMAX_MANA() + "\n");


           opcaoJogaodor = opcaoJogador();

            if(opcaoJogaodor == 1){
                int opcaoAtaque = opcaoAtaque();

                switch (opcaoAtaque){
                    case 1 -> heroi.ataquePadrao(vilao);
                    case 2 -> heroi.poderEspecial1(vilao);
                    case 3 -> heroi.poderEspecial2();
                }
            }
            else if(opcaoJogaodor == 2){
                System.out.println("Item que você deseja usar:");
            }

            vilao.decidirAtaque(heroi);
            //ultima coisa a fazer dentro desse while:
            heroi.aumentarVidaRodada();
            heroi.aumentarManaRodada();
            vilao.aumentarManaRodada();
            vilao.sortearPocao(heroi);
            contadorRodadas++;

        } // to pensando em criar o metodo opcoes jogaodor que retorna esse metodo

    }
    private static int opcaoJogador(){
        Scanner input = new Scanner(System.in);
        int opcaoJogaodor = 0;
        boolean validador;
        do {
            try {
                validador = true;

                System.out.println("Opções do jogador:");
                System.out.println("(1) Ataques");
                System.out.println("(2) Inventario");
                System.out.println("Digite a opção desejada: ");

                opcaoJogaodor = input.nextInt();
                System.out.println(" ");
                Heroi.verificarOpcaoHeroi(opcaoJogaodor); // esse metodo lanca uma exceçãp
            } catch (InputMismatchException e) {
                input.nextLine();
                validador = false;
                System.out.println("Erro : Digite 1 ou 2 para escolher a opção desejada\n");
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Erro desconhecido: digite um valor valido");
                validador = false;
            }
        }while (!validador); // fim do while validador

        return  opcaoJogaodor;
    }
    public int opcaoAtaque(){
        Scanner input = new Scanner(System.in);
        int opcaoAtaque = 0;
        boolean validador;
        do {
            try {
                validador = false;
                System.out.println("Opções de Ataque:");
                System.out.println("(1) " + heroi.getAtaquePadrao().descricao());
                System.out.print("(2) ");
                heroi.getPoderEspecial1().printarDescricaoPoder();
                System.out.print("(3) ");
                heroi.getPoderEspecial2().printarDescricaoPoder();
                System.out.println("(4) Voltar");
                System.out.print("\nDigite a opção desejada: ");
                opcaoAtaque = input.nextInt();
                System.out.println(" ");
                lancarExcecaoOpcaoAtaque(opcaoAtaque);

            }catch (InputMismatchException e){
                validador = true;
                input.nextLine();
                System.out.println("Erro: Digite um valor entre 1 e 4");
            }
            catch (Exception e){
                validador = true;
                input.nextLine();
                System.out.println("Erro desconhecido: digite um valor valido");
            }
        }while (validador);

        if(opcaoAtaque == 4){ // voltar
            int opcaoJogaodor = opcaoJogador();

            if(opcaoJogaodor == 1){
                opcaoAtaque = opcaoAtaque();
            }
            else if (opcaoJogaodor == 2) {
                return -1; // esse seria o caso que o jogador escolheria  Iventario
            }

        }
        return opcaoAtaque;

    }



}
