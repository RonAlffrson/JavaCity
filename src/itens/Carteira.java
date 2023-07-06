package itens;

public class Carteira extends Item{
    private double dinheiro;
    public Carteira(){
        this.nome = "Carteira";
        this.preco = 0;
    }

    public void adicionarDinheiro(double quantia){
        if (quantia > 0) dinheiro += quantia;
        else throw new IllegalArgumentException("Quantia deve ser maior que zero");
    }
    public void diminuirDinheiro(double quantia){
        if (quantia > 0) dinheiro -= quantia;
        else throw new IllegalArgumentException("Quantia deve ser maior que zero");
    }



}
