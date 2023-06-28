import java.util.ArrayList;

public abstract class Heroi {
    protected Integer vida, xp, nivel;
    public String nome;
    public ArrayList<Item> inventario = new ArrayList<>();

    public abstract void adicionarItem();
}
