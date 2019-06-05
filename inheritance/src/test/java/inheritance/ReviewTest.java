package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void test_toString() {
        Review instanceForTest = new Review("This place is nice","Tim", 3);
        String expect = "The review: 'This place is nice' is written by Tim with 3 stars.";
        assertEquals(expect,instanceForTest.toString());
    }
    @Test
    public void test_getNumOfStar() {
        Review instanceForTest = new Review("This restaurant is not so good","Dave",1);
        int expect = 1;
        assertEquals(expect,instanceForTest.getNumOfStarFromReview());
    }

}