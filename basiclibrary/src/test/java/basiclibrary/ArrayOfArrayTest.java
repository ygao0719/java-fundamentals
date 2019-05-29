package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;


public class ArrayOfArrayTest {
    @Test
    public void testArrayOfArray(){
        ArrayOfArray libraryForTest = new ArrayOfArray();
        int[][] inputArr = new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int [] expectArray = new int[]{55, 54, 60, 53, 59, 57, 61};
        assertArrayEquals(expectArray,
                libraryForTest.arrayOfArray(inputArr)
                );

    }
}
