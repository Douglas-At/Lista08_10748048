package ex3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteMulticonjuntos {

    @Test
    public void testConjuntoArrayList() {
        ConjuntoArrayList<Integer> al1 = new ConjuntoArrayList<Integer>();
        ConjuntoArrayList<Integer> al2 = new ConjuntoArrayList<Integer>();
        ConjuntoArrayList<Integer> al3 = new ConjuntoArrayList<Integer>();
        ConjuntoArrayList<Integer> al4 = new ConjuntoArrayList<Integer>();
        
        al1.add(777);
        al1.add(888);
        al1.add(999);
        al2.add(777);
        al2.add(888);
        al2.add(999);
        assertTrue(al1.equals(al2)); //Comparacao verdadeira
        
        al3.add(777);
        al3.add(888);
        al3.add(999);
        al3.add(111);
        assertFalse(al1.equals(al3)); //Comparacao falsa
        
        al4.add(111);
        al4.addAll(al2);
        assertTrue(al3.equals(al4)); //Add all
    }
    
   
    @Test
    public void testConjuntoSet() {
        ConjuntoSet<Integer> s1 = new ConjuntoSet<Integer>();
        ConjuntoSet<Integer> s2 = new ConjuntoSet<Integer>();
        ConjuntoSet<Integer> s3 = new ConjuntoSet<Integer>();
        ConjuntoSet<Integer> s4 = new ConjuntoSet<Integer>();
    
        s1.add(777);
        s1.add(888);
        s1.add(999);
        s2.add(777);
        s2.add(888);
        s2.add(999);
        assertTrue(s1.equals(s2)); //Comparacao verdadeira
        
        s3.add(777);
        s3.add(888);
        s3.add(999);
        s3.add(111);
        assertFalse(s1.equals(s3)); //Comparacao falsa
        
        s4.add(111);
        s4.addAll(s2);
        assertTrue(s3.equals(s4)); //Add all
    }
    

    @Test
    public void testConjuntoLinkedList() {
        ConjuntoLinkedList<Integer> ll1 = new ConjuntoLinkedList<Integer>();
        ConjuntoLinkedList<Integer> ll2 = new ConjuntoLinkedList<Integer>();
        ConjuntoLinkedList<Integer> ll3 = new ConjuntoLinkedList<Integer>();
        ConjuntoLinkedList<Integer> ll4 = new ConjuntoLinkedList<Integer>();
    
        ll1.add(777);
        ll1.add(888);
        ll1.add(999);
        ll2.add(777);
        ll2.add(888);
        ll2.add(999);
        assertTrue(ll1.equals(ll2)); //Comparacao verdadeira
        
        ll3.add(777);
        ll3.add(888);
        ll3.add(999);
        ll3.add(111);
        assertFalse(ll1.equals(ll3)); //Comparacao falsa
        
        ll4.add(111);
        ll4.addAll(ll2);
        assertTrue(ll3.equals(ll4)); //Add all
    }


    @Test
    public void testConjuntoStack() {
    	ConjuntoStack<Integer> s1 = new ConjuntoStack<Integer>();
    	ConjuntoStack<Integer> s2 = new ConjuntoStack<Integer>();
    	ConjuntoStack<Integer> s3 = new ConjuntoStack<Integer>();
    	ConjuntoStack<Integer> s4 = new ConjuntoStack<Integer>();
    
        s1.add(777);
        s1.add(888);
        s1.add(999);
        s2.add(777);
        s2.add(888);
        s2.add(999);
        assertTrue(s1.equals(s2)); //Comparacao verdadeira
        
        s3.add(777);
        s3.add(888);
        s3.add(999);
        s3.add(111);
        assertFalse(s1.equals(s3)); //Comparacao falsa
        
        s4.add(111);
        s4.addAll(s2);
        assertTrue(s3.equals(s4)); //Add all
        
    }
    
}