package ex4;

import java.util.Iterator;
import java.util.Set;

public interface Adaptador<T> extends Iterable<T>{
    boolean equals(Adaptador<T> m);
    Iterator<T> iterator();
    Set<T> getConjunto();
}