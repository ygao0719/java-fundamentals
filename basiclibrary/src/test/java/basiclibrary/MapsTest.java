package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class MapsTest {
    @Test
    public void testMaps(){
        Maps instanceForTest = new Maps();
        int[][] inputArr = new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expect = "High: 72Low: 51Never saw temperature: 63Never saw temperature: 67Never saw temperature: 68Never saw temperature: 69";
        assertEquals(expect,instanceForTest.maps(inputArr));
    }

}