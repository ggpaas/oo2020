import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * AppTest
 */
public class AppTest {

    @Test
    public void firstTest(){
        assertEquals("1 equals 2", 1, 2);
    }

    @Test 
    public void secondTest(){
       assertEquals("sum", 10, App.returnSum(5, 5));
    }

}