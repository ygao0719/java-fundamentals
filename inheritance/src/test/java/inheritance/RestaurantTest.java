package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void test_toString() {
        Restaurant instanceForTest = new Restaurant("Pho",4,2);
        String expect = "The restaurant Pho has 4 stars and 2 dollor signs.";
        assertEquals(expect,instanceForTest.toString());
    }
}