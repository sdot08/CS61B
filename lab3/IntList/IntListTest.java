import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntListTest {

    /**
     * Example test that verifies correctness of the IntList.list static
     * method. The main point of this is to convince you that
     * assertEquals knows how to handle IntLists just fine.
     */

    @Test
    public void testList() {
        IntList one = new IntList(1, null);
        IntList twoOne = new IntList(2, one);
        IntList threeTwoOne = new IntList(3, twoOne);

        IntList x = IntList.list(3, 2, 1);
        assertEquals(threeTwoOne, x);
    }


    @Test(timeout=1000)
    public void testReverse(){
        IntList one=IntList.list(1,2,3,4);
        IntList oneTest=IntList.list(4,3,2,1);
        IntList two=new IntList();
        assertEquals(IntList.reverse(one),oneTest);
        assertEquals(IntList.reverse(two),null);
        assertThat(IntList.reverse(one), not(one));
    }

    @Test
    public void testdSquareList() {
        IntList L = IntList.list(1, 2, 3);
        IntList.dSquareList(L);
        assertEquals(IntList.list(1, 4, 9), L);
    }

    /**
     * Do not use the new keyword in your tests. You can create
     * lists using the handy IntList.list method.
     * <p>
     * Make sure to include test cases involving lists of various sizes
     * on both sides of the operation. That includes the empty list, which
     * can be instantiated, for example, with
     * IntList empty = IntList.list().
     * <p>
     * Keep in mind that dcatenate(A, B) is NOT required to leave A untouched.
     * Anything can happen to A.
     */

    @Test
    public void testSquareListRecursive() {
        IntList L = IntList.list(1, 2, 3);
        IntList res = IntList.squareListRecursive(L);
        assertEquals(IntList.list(1, 2, 3), L);
        assertEquals(IntList.list(1, 4, 9), res);
    }

}

    /** If you're running this from the command line, you'll need
      * to add a main method. See ArithmeticTest.java for an
      * example. */


