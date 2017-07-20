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
        assertArrayEquals(a.items,b.items);

        a.removeFirst();
        a.removeFirst();
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        a.addLast(6);
        /*  a.printDeque();  6 10 1 2 3 4 5  */


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
        /*  a.printDeque();  1 10 1 2 3 4 5 */
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

        assertArrayEquals(a.items,b.items);

        a.removeLast();
        a.removeLast();
        b.removeFirst();
        b.removeLast();
        assertArrayEquals(a.items,b.items);
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

    @Test
    public void testresize1() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.addFirst(1);
        a.addLast(2);
        a.addFirst(1);
        a.addLast(2);
        a.removeLast();
        a.removeLast();
        a.removeFirst();
        a.removeFirst();
        a.addFirst(1);
        a.addLast(2);
        a.addFirst(1);
        a.addLast(2);
        a.printDeque();

        
    }

    @Test
    public void testresize2() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addFirst(3);
        a.addFirst(4);
        a.addFirst(5);
        a.addFirst(6);
        a.removeLast();
        a.removeFirst();
        a.addFirst(1);
        a.addFirst(2);
        a.removeLast();
        a.addFirst(3);
        a.addFirst(4);
        a.addFirst(5);
        a.addFirst(6);

        a.addLast(5);
        a.addLast(6);
        a.removeFirst();
        a.addFirst(3);
        a.addFirst(4);
        a.addFirst(5);
        a.removeLast();
        /* a.printDeque(); 5 4 3 5 4 3 2 1 5 4 3 1 2 3 1 5  */
    }


    @Test
    public void testresize3() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        for(int i=0;i<4;i++) {
            a.addLast(1);
            a.addLast(2);
            a.addLast(3);
            a.addLast(4);
            a.addLast(5);
            a.addLast(6);
            a.addLast(7);
            a.addLast(8);
            a.addLast(9);
            a.addLast(10);
            a.addLast(11);
            a.addLast(12);
        }
        for(int i=0;i<38;i++) {
            a.removeLast();
        }


        /* System.out.println(a.leng); 32 */
    }

}

