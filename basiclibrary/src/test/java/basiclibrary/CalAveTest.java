package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalAveTest {
    @Test
    public void testCalAve(){
        CalAve libraryForTesting = new CalAve();
        int[] inputArr = new int[]{1,2,3,4,5};
        assertEquals(libraryForTesting.calAve(inputArr), 3);
    }
}
