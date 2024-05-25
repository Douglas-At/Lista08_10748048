package ex3;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSet <T>{ 
	private Set<T> conjunto;
	
	public ConjuntoSet() {
		this.conjunto = new HashSet<T>(); 
	}
	
	public void add(T element) {
		this.conjunto.add(element);
	}
	
	public boolean equals(ConjuntoSet<T> m) {
		return conjunto.containsAll(m.getConjunto()) && m.getConjunto().containsAll(this.conjunto) && m.size() == conjunto.size();
	}
	
	public int size() {
		return conjunto.size();
	}


	public void addAll(ConjuntoSet<T> m) {
		this.conjunto.addAll(m.getConjunto());
	}

	public Set<T> getConjunto(){
		return conjunto;
	}
	
	
}