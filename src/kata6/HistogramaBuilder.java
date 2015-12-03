package kata6;

import java.util.ArrayList;

public class HistogramaBuilder <T>{
    
    private final ArrayList <T> lista;

    public HistogramaBuilder(ArrayList<T> lista) {
        this.lista = lista;
    }
    
    public <A> Histogram <A> build (Attribute<T,A> attribute){
        Histogram<A> histo = new Histogram<>();
        for (T lista1 : lista) {
            A value = attribute.get(lista1);
            histo.increment(value);
        }
    return histo;
    }
}
