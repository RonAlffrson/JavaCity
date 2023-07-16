import personagens.herois.Heroi;
import personagens.viloes.Vilao;
import java.util.*;


public class Interacao {
    public  Heroi heroi;
    public Vilao vilao;
    public int contadorRodadas = 0;

    public Interacao(Heroi heroi, Vilao vilao){
        this.heroi = heroi;
        this.vilao = vilao;

    }
    public static void lancarExcecaoOpcaoAtaque(int opcaoAtaque) throws ErroOpcaoException{
        if(opcaoAtaque < 1 || opcaoAtaque > 5){
            throw new ErroOpcaoException("\nErro : digite um valor entre 1 e 4\n");
        }
    }
    public static void lancarExcecaoOpcaoIventario(int opcaoIventario) throws ErroOpcaoException{
        if(opcaoIventario < 1 || opcaoIventario > 3){
            throw new ErroOpcaoException("\nErro: Digite valor entre 1 e 3\n");
        }
    }

    public static int EscolhaDoHeroi(){
        boolean validador;
        int opcaoHeroi = 0;
        Scanner input = new Scanner(System.in);
        do {
            try {
                validador = true;
                System.out.println("""
                            Escolha seu herói:
                            (1) Dofer - Cavaleiro - 100 de vida total, +5 de mana a cada rodada, 10 de dano de ataque padrão
                            (2) Ronan - Mago - 70 de vida total, +10 de mana a cada rodada, 5 de dano de ataque padrão""");
                opcaoHeroi = input.nextInt();
                Heroi.verificarOpcaoHeroi(opcaoHeroi); // esse método lança uma exceção
            }
            catch (InputMismatchException e) {
                input.nextLine();
                validador = false;
                System.out.println("\nErro: Digite 1 ou 2 para escolher o heroi\n");
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage() + "\n");
                validador = false;
            }
            catch (Exception e){
                input.nextLine();
                System.out.println("\nErro: digite um valor valido\n");
                validador = false;
            }
        } while (!validador);
        return opcaoHeroi;
    }

    public void batalhar(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("    Batalha:\n" + heroi.getNome() +" VS " + vilao.getNome() + "\n");
        int opcaoJogaodor;
        contadorRodadas = 0;

        while(heroi.getVida() != 0 && vilao.getVida() != 0){
            contarRodada();
            System.out.println("\n" + heroi.getNome() + "\nVida: " + heroi.getVida() + " / " + heroi.getMax_vida() +
                    "\nMana: " + heroi.getMana() + " / " + heroi.getMAX_MANA() + "\n");

            System.out.println(vilao.getNome() + "\nVida: " + vilao.getVida() + " / " + vilao.getMax_vida() +
                    "\nMana: " + vilao.getMana() + "\n\n");

            opcaoJogaodor = opcaoJogador(); // chama o metodo opcao jogador

            switch(opcaoJogaodor){
                case 1 -> opcaoAtaque();
                case 2 -> opcaoIventario();
            }

            // a partir daqui acabou as açoes do heroi e começa a do vilão

            vilao.decidirAtaque(heroi);
            vilao.sortearPocao(heroi);

            if(!(heroi.getVida().equals(heroi.getMIN_MANA()))){
                heroi.aumentarVidaRodada();
            }
            else{
                System.out.println(heroi.getNome() + " morreu - FIM DE JOGO");
            }

            // acabou a rodada
            heroi.aumentarManaRodada();
            vilao.aumentarManaRodada();
        }
    }

    private static int opcaoJogador(){
        Scanner input = new Scanner(System.in);
        int opcaoJogaodor = 0;
        boolean validador = false;

        while(!validador) {
            try {
                validador = true;
                System.out.println("\nOpções do jogador:");
                System.out.println("(1) Ataques");
                System.out.println("(2) Iventário");
                System.out.println("Digite a opção desejada: ");
                opcaoJogaodor = input.nextInt();
                Heroi.verificarOpcaoHeroi(opcaoJogaodor); // esse metodo lanca uma exceçãp
            } catch (InputMismatchException e) {
                input.nextLine();
                validador = false;
                System.out.println("\nErro: Digite 1 ou 2 para escolher a opção desejada\n");
            } catch (IllegalArgumentException e) {
                System.out.println("\nErro: Digite 1 ou 2 para escolher a opção desejada\n");
                validador = false;
            } catch (Exception e) {
                input.nextLine();
                System.out.println("\nErro desconhecido: digite um valor valido\n");
                validador = false;
            }
        } // fim do while validador

        return  opcaoJogaodor;
    }
    public void opcaoAtaque(){
        Scanner input = new Scanner(System.in);
        int opcaoAtaque = 0;
        boolean validador = false;

        while(!validador) {
            try {
                validador = true;
                System.out.println("\nOpções de ataque:");
                System.out.println("(1) " + heroi.getAtaquePadrao().descricao());
                System.out.print("(2) ");
                heroi.getPoderEspecial1().printarDescricaoPoder();
                System.out.print("(3) ");
                heroi.getPoderEspecial2().printarDescricaoPoder();
                System.out.println("(4) Voltar");
                System.out.print("Digite a opção desejada: ");
                opcaoAtaque = input.nextInt();
                System.out.println(" ");
                lancarExcecaoOpcaoAtaque(opcaoAtaque);
            }catch (InputMismatchException e){
                validador = false;
                input.nextLine();
                System.out.println("\nErro: Digite um valor entre 1 e 4\n");
            }
            catch (IllegalArgumentException e){
                validador = false;
                input.nextLine();
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                validador = false;
                input.nextLine();
                System.out.println("\nErro desconhecido: digite um valor valido\n");
            }
        }
        if(opcaoAtaque == 4){ // nesse caso vai perguntar para o usuário se ele vai para opção ataque ou opção jogador
            int opcaoJogador = opcaoJogador();
            if(opcaoJogador == 1){
                opcaoAtaque();
            }
            else if (opcaoJogador == 2) {
                opcaoIventario();
            }
        }
        else if(opcaoAtaque == 1){
            heroi.ataquePadrao(vilao);
        }
        else if (opcaoAtaque == 2){
            if(heroi.getMana() >= heroi.getPoderEspecial1().getCusto()) {
                heroi.poderEspecial1(vilao);
            }
            else{
                System.out.println("\nErro: Mana insuficiente, escolha outra opção de ataque");
                opcaoAtaque();
            }
        }
        else if (opcaoAtaque == 3) {
            if(heroi.getMana() >= heroi.getPoderEspecial2().getCusto()) {
                heroi.poderEspecial2();
            }
            else{
                System.out.println("Erro: Mana insuficiente, escolha outra opção de ataque");
                opcaoAtaque();
            }
        }
    }
    public void opcaoIventario(){
        Scanner input = new Scanner(System.in);
        int opcaoIventario = 0;
        boolean validador = false;
        while(!validador) {
            try {
                validador = true;
                System.out.println("\nOpções do Iventario:");
                System.out.println("(1) " + heroi.getInventario().get(0).descricaoItem() + " - qnt:" + heroi.getInventario().get(0).getQuantidadeItem());
                System.out.println("(2) " + heroi.getInventario().get(1).descricaoItem() + " - qnt:" + heroi.getInventario().get(1).getQuantidadeItem());
                System.out.println("(3) Voltar");
                System.out.print("Digite a opção desejada: ");
                System.out.println(" ");
                opcaoIventario = input.nextInt();
                lancarExcecaoOpcaoIventario(opcaoIventario);

            } catch (InputMismatchException e) {
                validador = false;
                input.nextLine();
                System.out.println("\nErro: Digite 1 ou 2\n");
            } catch (IllegalArgumentException e) {
                validador = false;
                input.nextLine();
                System.out.println(e.getMessage());
            } catch (Exception e) {
                validador = false;
                input.nextLine();
                System.out.println("\nErro desconhecido: digite um valor válido\n");
            }
        }

        // executar as opcoes escolhidas e voltar caso de erro
        if(opcaoIventario == 3){
            int opcaoJogador = opcaoJogador();
            if(opcaoJogador == 1){
                opcaoAtaque();
            }
            else if (opcaoJogador == 2) {
                opcaoIventario();
            }
        }
        else if(opcaoIventario == 1){
            if(heroi.getInventario().get(0).getQuantidadeItem() > 0) {
                System.out.println(heroi.getNome() + " usou " + heroi.getInventario().get(0).getNome());
                heroi.aumentarMana(heroi.getInventario().get(0).getValorAtributo());
                heroi.getInventario().get(0).diminuirItem(heroi);
            }
            else{
                System.out.println("\nErro: Você não tem esse item no iventário\n");
                opcaoIventario();
            }
        }
        else if (opcaoIventario == 2){
            if(heroi.getInventario().get(1).getQuantidadeItem() > 0) {
                System.out.println(heroi.getNome() + " usou " + heroi.getInventario().get(1).getNome());
                heroi.aumentarMana(heroi.getInventario().get(1).getValorAtributo());
                heroi.getInventario().get(1).diminuirItem(heroi);
            }
            else{
                System.out.println("\nErro: Você não tem esse item no iventário\n");
                opcaoIventario();
            }
        }

    }
    public void contarRodada(){
        contadorRodadas += 1;
        System.out.println("\n" + contadorRodadas + "° Rodada\n");
    }

}