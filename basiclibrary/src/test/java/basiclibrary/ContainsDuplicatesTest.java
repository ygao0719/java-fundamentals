package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;


public class ContainsDuplicatesTest {
    @Test
    public void testContainsDuplicates(){
        ContainsDuplicates libraryForTest = new ContainsDuplicates();
        int[] inputArr = new int[]{1,1,4,5};
        assertEquals(libraryForTest.containsDuplicates(inputArr),
                true);
    }
    @Test
    public void testContainsDuplicate(){
        ContainsDuplicates libraryForTest = new ContainsDuplicates();
        int[] inputArr = new int[]{1,3,4,5};
        assertEquals(libraryForTest.containsDuplicates(inputArr),
                false);
    }

}

