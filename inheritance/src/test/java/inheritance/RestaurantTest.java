package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    //test toString before add review
    @Test
    public void test_toString() {
        Restaurant instanceForTest = new Restaurant("Pho",2);
        String expect = "The restaurant Pho has 0 stars and 2 dollor signs.";
        assertEquals(expect,instanceForTest.toString());
    }

    //test toString after adding review
    @Test
    public void test_AddReview() {
        Restaurant instanceForTest = new Restaurant("Pho",2);
        Review test = new Review("This place is nice","Tim",4);
        instanceForTest.addReview(test);

        String expect = "The restaurant Pho has 4 stars and 2 dollor signs with reviews: [The review: 'This place is nice' is written by Tim with 4 stars.].";
        assertEquals(expect,instanceForTest.toString());
    }

    //test with more than one reviews. Tim gave this restaurant 4 star and Arron gave it 2 star. So finally this restaurant gets 3 star.
    @Test
    public void test_AddReview_MoreThanOne(){
        Restaurant instanceForTest = new Restaurant("Pho",2);
        Review test1 = new Review("This place is nice","Tim",4);
        Review test2 = new Review("It is not worthy","Arron",2);
        instanceForTest.addReview(test1);
        instanceForTest.addReview(test2);

        String expect = "The restaurant Pho has 3 stars and 2 dollor signs with reviews: [The review: 'This place is nice' is written by Tim with 4 stars., The review: 'It is not worthy' is written by Arron with 2 stars.].";
        assertEquals(expect,instanceForTest.toString());
    }

}