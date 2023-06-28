package personagens;
import itens.*;
import java.util.ArrayList;

public abstract class Heroi {
    public String nome;
    protected Integer vida, xp, nivel;
    public ArrayList<Item> inventario = new ArrayList<>();

    public void adicionarItem(Item item){
        inventario.add(item);
    }
    public void alterarVida(){

    }
}
