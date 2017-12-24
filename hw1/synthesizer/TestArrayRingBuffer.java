package synthesizer;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        ArrayRingBuffer<Double> arb = new ArrayRingBuffer<>(10);
        double y=0;
        for(int i=0; i<10; i++)
            arb.enqueue(1.2);
        for(double x: arb) {
            System.out.println(x);
            y=x;

        }
        assertEquals(1.2, y, 0.01);
    }

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
} 
