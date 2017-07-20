import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;


public class TestArrayDeque1B {
    @Test
    public void testisEmpty() {
        StudentArrayDeque<Integer> a = new StudentArrayDeque<>();
        assertTrue(a.isEmpty());
    }

    @Test
    public void testaddFirst() {
        StudentArrayDeque<Integer> a = new StudentArrayDeque<>();
        a.addFirst(1);
        assertTrue(!a.isEmpty());
        assertEquals(1,a.size());
        assertEquals(1,(int)a.removeFirst());
    }

    @Test
    public void testaddLast() {
        StudentArrayDeque<Integer> a = new StudentArrayDeque<>();
        a.addLast(1);
        assertTrue(!a.isEmpty());
        assertEquals(1,a.size());
        assertEquals(1,(int)a.removeLast());

    }

    @Test
    public void testget() {
        StudentArrayDeque<Integer> a = new StudentArrayDeque<>();
        a.addLast(1);
        assertEquals(1,(int)a.get(0));

    }

    @Test
    public void testrandom() {
        StudentArrayDeque<Integer> a = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> b = new ArrayDequeSolution<>();

        for(int i=0; i<10;i++) {
            a.addFirst(1);
            a.addLast(2);
            a.addFirst(3);
            a.addLast(4);
            a.addLast(5);
            a.addLast(6);
            a.addFirst(7);
            a.addLast(4);
            a.addLast(5);
            a.addLast(6);
            a.addFirst(7);
            a.removeFirst();


            b.addFirst(1);
            b.addLast(2);
            b.addFirst(3);
            b.addLast(4);
            b.addLast(5);
            b.addLast(6);
            b.addFirst(7);
            b.addLast(4);
            b.addLast(5);
            b.addLast(6);
            b.addFirst(7);
            b.removeFirst();
        }
        assertEquals(b.size(),a.size());
        assertEquals((int)b.get(5),(int)a.get(5));
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals((int)b.get(5),(int)a.get(5));
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.size(),a.size());
        assertEquals(b.size(),a.size());
        assertEquals((int)b.get(5),(int)a.get(5));
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals((int)b.get(5),(int)a.get(5));
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeLast(),a.removeLast());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.removeFirst(),a.removeFirst());
        assertEquals(b.size(),a.size());


    }

    @Test
    public void testrandom2() {
        FailureSequence fs=new FailureSequence();

        StudentArrayDeque<Integer> a = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> b = new ArrayDequeSolution<>();

        for(int i=0; i<8;i++) {
            a.addFirst(1);
            b.addFirst(1);
            DequeOperation dequeop= new DequeOperation("addFirst",1);
            fs.addOperation(dequeop);
        }
        for(int i=0; i<6;i++) {
            DequeOperation dequeop= new DequeOperation("removeFirst");
            fs.addOperation(dequeop);
            assertEquals(fs.toString(), b.removeFirst(),a.removeFirst());
        }



    }
}
