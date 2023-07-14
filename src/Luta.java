import itens.PocaoMana;
import personagens.herois.Heroi;
import personagens.viloes.Vilao;
import java.util.*;


public class Luta {
    public  Heroi heroi;
    public Vilao vilao;
    public int contadorRodadas = 0;

    public Luta(Heroi heroi, Vilao vilao){
        this.heroi = heroi;
        this.vilao = vilao;

    }
    public static void lancarExcecaoOpcaoAtaque(int opcaoAtaque) throws IllegalArgumentException{
        if(!(opcaoAtaque > 0 && opcaoAtaque < 5)){
            throw new IllegalArgumentException("Erro : digite um valor entre 1 e 4");
        }
    }
    public static void lancarExcecaoOpcaoIventario(int opcaoIventario) throws IllegalArgumentException{
        if(opcaoIventario <= 0 || opcaoIventario > 3){
            throw new IllegalArgumentException("Erro: Digite valor entre 1 e 3");
        }
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
        return opcaoHeroi;
    }
    public  void batalhar(){
        System.out.println("Batalha:\n " + heroi.getNome() +" VS " + vilao.getNome());
        boolean validador = false;
        int opcaoJogaodor = 0;
        while(heroi.getVida() != 0 && vilao.getVida() != 0) {
            System.out.println(heroi.getNome() + "\nVida: " + heroi.getVida() + " / " + heroi.getMax_vida() +
                    "\nMana:" + heroi.getMana() + " / " + heroi.getMAX_MANA() + "\n");

            System.out.println(vilao.getNome() + "\nVida: " + vilao.getVida() + "\n" +
                    "Mana: " + vilao.getMana());

           opcaoJogaodor = opcaoJogador(); // chama o metodo opcao jogador

            if(opcaoJogaodor == 1) {
                int opcaoAtaque = opcaoAtaque();
            }

            else if(opcaoJogaodor == 2){
                int opcaoIventario = opcaoIventario();
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

        return  opcaoJogaodor;
    }
    public int opcaoAtaque(){
        Scanner input = new Scanner(System.in);
        int opcaoAtaque = 0;
        boolean validador = false;
        while(!validador) {
            try {
                validador = true;
                System.out.println("Opções de Ataque:");
                System.out.println("(1)" + heroi.getAtaquePadrao().descricao());
                System.out.print("(2)");
                heroi.getPoderEspecial1().printarDescricaoPoder();
                System.out.print("(3)");
                heroi.getPoderEspecial2().printarDescricaoPoder();
                System.out.println("(4) Voltar");
                System.out.print("Digite a opção desejada: ");
                opcaoAtaque = input.nextInt();
                lancarExcecaoOpcaoAtaque(opcaoAtaque);

            }catch (InputMismatchException e){
                validador = false;
                input.nextLine();
                System.out.println("Erro: Digite um valor entre 1 e 4");
            }
            catch (IllegalArgumentException e){
                validador = false;
                input.nextLine();
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                validador = false;
                input.nextLine();
                System.out.println("Erro desconhecido: digite um valor valido");
            }
        }
        if(opcaoAtaque == 4){ // voltar
            opcaoAtaque = opcaoJogador();
            if(opcaoAtaque == 1){
                opcaoAtaque = opcaoAtaque();
            }
            else if (opcaoAtaque == 2) {
                opcaoIventario(); // esse seria o caso que o jogador escolheria  Iventario ainda ns como resolriasve
            }

        }
        return opcaoAtaque;

    }
    public int opcaoIventario(){
        Scanner input = new Scanner(System.in);
        int opcaoIventario = 0;
        boolean validador = false;
        while(!validador) {
            try {
                validador = true;
                System.out.println("Opções de Iventario:");
                System.out.println("(1) " + heroi.inventario.get(0).descricaoItem() + "\n" +
                        "(2) " + heroi.inventario.get(1).descricaoItem());
                System.out.println("(3) voltar ");
                System.out.print("Digite a opção desejada: ");
                opcaoIventario = input.nextInt();
                lancarExcecaoOpcaoIventario(opcaoIventario);
            } catch (InputMismatchException e) {
                validador = false;
                input.nextLine();
                System.out.println("Erro: Digite um valor entre 1 e 4");
            } catch (IllegalArgumentException e) {
                validador = false;
                input.nextLine();
                System.out.println(e.getMessage());
            } catch (Exception e) {
                validador = false;
                input.nextLine();
                System.out.println("Erro desconhecido: digite um valor valido");
            }

        }
        return opcaoIventario; // so para testar na main

    }

}
