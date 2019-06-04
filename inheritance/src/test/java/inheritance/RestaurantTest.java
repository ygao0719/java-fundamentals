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
//test: after add review if the rating of restaurant change
    @Test
    public void test_AddReview() {
        Restaurant instanceForTest = new Restaurant("Pho",4,2);
        String expect = "The review: nice food is written by Tom with 6 stars for Pho. After review, the star rating for Pho is 5";
        assertEquals(expect,instanceForTest.addReview("nice food","Tom",6));
    }

}