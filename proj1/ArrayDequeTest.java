import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ArrayDequeTest {


    @Test
    public void testprint() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.addFirst(3);
        a.addLast(5);
        a.addFirst(4);
        a.printDeque();
    }

    @Test
    public void testisEmpty() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        assertTrue(a.isEmpty());
    }


}

