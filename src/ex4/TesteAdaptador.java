package ex4;
import ex3.*;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteAdaptador {

    @Test
    public void ArrayListAdapter() {
        ConjuntoArrayList<Integer> conjunto = new ConjuntoArrayList<>();
        AdaptadorArrayList<Integer> adaptador = new AdaptadorArrayList<>(conjunto);
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);

        Set<Integer> esperado = new HashSet<>();
        esperado.add(10);
        esperado.add(20);
        esperado.add(30); 

        
        Iterator<Integer> iterator = adaptador.iterator();
        Set<Integer> resultado = new HashSet<>();
        
        while (iterator.hasNext()) {
            resultado.add(iterator.next());
        }
        assertEquals(esperado, resultado);

        assertEquals(esperado, adaptador.getConjunto());
    }
    
    @Test
    public void LinkedListAdapter() {
        ConjuntoLinkedList<Integer> conjunto = new ConjuntoLinkedList<>();
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);

        AdaptadorLinkedList<Integer> adaptador = new AdaptadorLinkedList<>(conjunto);

        Set<Integer> esperado = new HashSet<>();
        esperado.add(10);
        esperado.add(20);
        esperado.add(30); 

        Iterator<Integer> iterator = adaptador.iterator();
        Set<Integer> resultado = new HashSet<>();
        
        while (iterator.hasNext()) {
            resultado.add(iterator.next());
        }
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void SetAdapter() {
        ConjuntoSet<Integer> conjunto = new ConjuntoSet<>();
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);

        AdaptadorSet<Integer> adaptador = new AdaptadorSet<>(conjunto);

        Set<Integer> esperado = new HashSet<>();
        esperado.add(10);
        esperado.add(20);
        esperado.add(30); 

        Iterator<Integer> iterator = adaptador.iterator();
        Set<Integer> resultado = new HashSet<>();
        
        while (iterator.hasNext()) {
            resultado.add(iterator.next());
        }
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void StackAdapter() {
    	ConjuntoStack<Integer> conjunto = new ConjuntoStack<>();
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);

        AdaptadorStack<Integer> adaptador = new AdaptadorStack<>(conjunto);

        Set<Integer> esperado = new HashSet<>();
        esperado.add(10);
        esperado.add(20);
        esperado.add(30); 

        Iterator<Integer> iterator = adaptador.iterator();
        Set<Integer> resultado = new HashSet<>();
        
        while (iterator.hasNext()) {
            resultado.add(iterator.next());
        }
        
        assertEquals(esperado, resultado);
    }
        
}