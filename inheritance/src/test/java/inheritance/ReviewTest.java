package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void test_toString() {
        Review instanceForTest = new Review("Pho",5,3,"This place is nice","Tim", 3);
        String expect = "The review: This place is nice is written by Tim with 3 stars for Pho.";
        assertEquals(expect,instanceForTest.toString());
    }
// test addReview method
    @Test
    public void test_addReview() {
        Review instanceForTest = new Review("Pho",5,3,"This place is nice","Tim", 3);
        String expect = "The review: This place sucks is written by David with 7 stars for Pho. After review, the star rating for Pho is 6";
        assertEquals(expect,instanceForTest.addReview("This place sucks","David",7));
    }

}