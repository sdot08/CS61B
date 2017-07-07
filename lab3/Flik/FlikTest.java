import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class FlikTest {
    @Test
    public void isSameNumberTest(){
        int a=128;
        int b=128;
        assertTrue(Flik.isSameNumber(a, b));
    }



}
