package ex3;

import java.util.Stack;

public class ConjuntoStack <T>{ 
	private Stack<T> conjunto;
	
	public ConjuntoStack() {
		this.conjunto = new Stack<T>(); 
	}
	
	public void add(T element) {
		this.conjunto.add(element);
	}
	
	public boolean equals(ConjuntoStack<T> m) {
		return conjunto.containsAll(m.getConjunto()) && m.getConjunto().containsAll(this.conjunto) && m.size() == conjunto.size();
	}
	
	public int size() {
		return conjunto.size();
	}

	public void addAll(ConjuntoStack<T> m) {
		this.conjunto.addAll(m.getConjunto());
	}

	public Stack<T> getConjunto(){
		return conjunto;
	}
	
}