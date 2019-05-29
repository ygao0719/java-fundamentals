package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class RollTest {
    @Test
    public void testRoll(){
        Roll libraryForTesting = new Roll();
        assertEquals(libraryForTesting.roll(4).length, 4);
        assertTrue( "number inside the array should greater than 1",
        libraryForTesting.roll(1)[0] >= 1);
        assertTrue( "number inside the array should smaller than 7",
                libraryForTesting.roll(1)[0] < 7 );

    }
}
