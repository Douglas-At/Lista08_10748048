package ex3;

import java.util.LinkedList;

public class ConjuntoLinkedList <T>{ 
	private LinkedList<T> conjunto = new LinkedList<T>();
	
	public ConjuntoLinkedList() {
		this.conjunto = new LinkedList<T>(); 
	}
	
	public void add(T element) {
		this.conjunto.add(element);
	}
	
	public boolean equals(ConjuntoLinkedList<T> m) {
		return conjunto.containsAll(m.getConjunto()) && m.getConjunto().containsAll(this.conjunto) && m.size() == conjunto.size();
	}
	
	public int size() {
		return conjunto.size();
	}

	public void addAll(ConjuntoLinkedList<T> m) {
		this.conjunto.addAll(m.getConjunto());
	}

	public LinkedList<T> getConjunto(){
		return conjunto;
	}
	
	
}