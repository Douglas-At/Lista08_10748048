package ex3;

import java.util.ArrayList;

public class ConjuntoArrayList <T>{ 
	private ArrayList<T> conjunto;
	
	public ConjuntoArrayList() {
		this.conjunto = new ArrayList<T>(); 
	}
	
	public void add(T element) {
		conjunto.add(element);
	}
	
	public boolean equals(ConjuntoArrayList<T> m) {
		return conjunto.containsAll(m.getConjunto()) && m.getConjunto().containsAll(this.conjunto) && m.size() == conjunto.size();
	}
	
	public int size() {
		return conjunto.size();
	}

	public void addAll(ConjuntoArrayList<T> m) {
		this.conjunto.addAll(m.getConjunto());
	}
	
	public ArrayList<T> getConjunto(){
		return conjunto;
	}
	
}