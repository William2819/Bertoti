import java.util.ArrayList;
import java.util.List;

import composite.forma;

public class desenho implements forma{
    private List<forma> formas = new ArrayList<forma>();

    @Override
    public void desenho(String corDesenho) {
        for(forma forma : formas){
            forma.desenho(corDesenho);
        }
    }

    public void adicionar(forma f){
        this.formas.add(f);
    }

    public void remover(forma f){
        formas.remove(f);
    }

    public void limpar(){
        System.out.println("Limpando todas as formas.");
        this.formas.clear();
    }
}