package ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex3.ConjuntoLinkedList;

public class AdaptadorLinkedList<T> implements Adaptador<T> {
    private ConjuntoLinkedList<T> multiconjunto;
    private Set<T> conjunto;
    
    public AdaptadorLinkedList(ConjuntoLinkedList<T> mc) {
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

    public ConjuntoLinkedList<T> getMulticonjunto() { 
      return multiconjunto;
    }
}