package personagens.herois;
import itens.*;
import java.util.ArrayList;

public abstract class Heroi implements  Personagem {
    protected String nome, classe;
    protected Integer vida, mana = 0, forcaAtaque;
    protected ArrayList<Item> inventario = new ArrayList<>();
    protected final Integer MAX_MANA = 100, MIN_MANA = 0, MIN_VIDA = 0;
    @Override
    public void adicionarItem(Item item){
        inventario.add(item);
    }

}
