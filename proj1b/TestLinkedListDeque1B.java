import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


/*
*/


public class TestLinkedListDeque1B {
    @Test
    public void testisEmpty() {
        StudentLinkedListDeque<Integer> a = new StudentLinkedListDeque<>();
        a.addFirst((1));
        a.removeLast();
        assertTrue(a.isEmpty());
    }

    @Test
    public void testaddFirst() {
        StudentLinkedListDeque<Integer> a = new StudentLinkedListDeque<>();
        a.addFirst(1);
        assertTrue(!a.isEmpty());
        assertEquals(1,a.size());
        assertEquals(1,(int)a.removeFirst());
    }

    @Test
    public void testaddLast() {
        StudentLinkedListDeque<Integer> a = new StudentLinkedListDeque<>();
        a.addLast(1);
        assertTrue(!a.isEmpty());
        assertEquals(1,a.size());
        assertEquals(1,(int)a.removeLast());

    }

    @Test
    public void testget() {
        StudentLinkedListDeque<Integer> a = new StudentLinkedListDeque<>();
        a.addLast(1);
        assertEquals(1,(int)a.get(0));

    }

    @Test
    public void testgetRecursive() {
        StudentLinkedListDeque<Integer> a = new StudentLinkedListDeque<>();
        a.addLast(1);
        assertEquals(1,(int)a.getRecursive(0));

    }

    @Test
    public void testrandom() {
        StudentLinkedListDeque<Integer> a = new StudentLinkedListDeque<>();
        LinkedListDequeSolution<Integer> b = new LinkedListDequeSolution<>();
        FailureSequence fs = new FailureSequence();
        for (int i = 0; i < 2; i++) {
            a.addFirst(i + 1);
            a.addLast(i + 2);

            b.addFirst(i + 1);
            b.addLast(i + 2);
            DequeOperation dequeop1 = new DequeOperation("addFirst", i + 1);
            DequeOperation dequeop2 = new DequeOperation("addLast", i + 2);
            fs.addOperation(dequeop1);
            fs.addOperation(dequeop2);
        }

        DequeOperation dequeop1 = new DequeOperation("removeLast");
        fs.addOperation(dequeop1);
        assertEquals(b.removeLast(), a.removeLast());


        for (int i = 0; i < b.size(); i++) {
            dequeop1 = new DequeOperation("get", i);
            fs.addOperation(dequeop1);
            assertEquals(fs.toString(), b.get(i), a.get(i));

        }
    }

    @Test
    public void testrandom2() {
        StudentLinkedListDeque<Integer> a = new StudentLinkedListDeque<>();
        LinkedListDequeSolution<Integer> b = new LinkedListDequeSolution<>();

        for(int i=0; i<9;i++) {
            a.addFirst(i);
            b.addFirst(i);

        }
        for(int i=0; i<7;i++) {

            assertEquals(b.removeFirst(),a.removeFirst());
        }
    }

    @Test
    public void testrandom3() {
        StudentLinkedListDeque<Integer> a = new StudentLinkedListDeque<>();
        LinkedListDequeSolution<Integer> b = new LinkedListDequeSolution<>();

        for(int i=0; i<6;i++) {
            a.addLast(i);
            b.addLast(i);

        }
        for(int i=0; i<7;i++) {

            assertEquals(b.removeLast(),a.removeLast());
        }
    }
}
