import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ArrayDequeTest {




    @Test
    public void testisEmpty() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        assertTrue(a.isEmpty());
    }

    @Test
    public void testremoveFirst() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.addLast(3);
        a.addLast(5);
        a.addFirst(4);
        a.removeFirst();
        a.removeFirst();
        a.addLast(10);
        a.addFirst(1);

        ArrayDeque<Integer> b = new ArrayDeque<>();
        b.addLast(1);
        b.addLast(5);
        b.addLast(10);
        assertEquals(a.items,b.items);

        a.removeFirst();
        a.removeFirst();
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        a.addLast(6);
        /* a.printDeque(); */


    }

    @Test
    public void testremoveLast() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.addLast(3);
        a.addLast(5);
        a.removeFirst();
        a.removeFirst();
        a.addLast(10);
        a.addFirst(1);
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        /* a.printDeque(); */
        a.addLast(6);

        ArrayDeque<Integer> b = new ArrayDeque<>();
        b.addLast(6);
        b.addLast(1);
        b.addLast(10);
        b.addLast(1);
        b.addLast(2);
        b.addLast(3);
        b.addLast(4);
        b.addLast(5);

        assertEquals(a.items,b.items);

        a.removeLast();
        a.removeLast();
        b.removeFirst();
        b.removeLast();
        assertEquals(a.items,b.items);
    }

    @Test
    public void testget() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.addLast(3);
        a.addLast(5);
        int one=a.get(0);

        assertEquals(one, 3);
        assertEquals(a.get(5), null);
    }


}

