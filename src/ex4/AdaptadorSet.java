package ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex3.ConjuntoSet;

public class AdaptadorSet<T> implements Adaptador<T> {
    private ConjuntoSet<T> multiconjunto;
    private Set<T> conjunto;
    
    public AdaptadorSet(ConjuntoSet<T> mc) {
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

    public ConjuntoSet<T> getMulticonjunto() { 
      return multiconjunto;
    }
}