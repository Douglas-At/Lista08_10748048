package ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex3.ConjuntoArrayList;

public class AdaptadorArrayList<T> implements Adaptador<T> {
    private ConjuntoArrayList<T> multiconjunto;
    private Set<T> conjunto;
    
    public AdaptadorArrayList(ConjuntoArrayList<T> mc) {
        this.multiconjunto = mc;
    }

    @Override
    public Iterator<T> iterator() { 
        conjunto = new HashSet<>(multiconjunto.getConjunto());
        return conjunto.iterator();
    }


    @Override
    public boolean equals(Adaptador<T> m) {
      conjunto = new HashSet<>(multiconjunto.getConjunto());
      return conjunto.equals(m.getConjunto());
    }

    public Set<T> getConjunto() {
      return conjunto;
    }

    public ConjuntoArrayList<T> getMulticonjunto() { 
      return multiconjunto;
    }
}