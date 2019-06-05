package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void test_toSting() {
        Shop instanceForTest = new Shop("Best Buy", "sells electrics", 3);
        String expect = "The Best Buy is a 3 dollor signs shop which sells electrics.";
        assertEquals(expect,instanceForTest.toSting());
    }

    @Test
    public void test_addReview() {
        Shop instanceForTest = new Shop("Best Buy", "sells electrics", 3);
        Review newReview = new Review("This place is nice","Tim",3);
        instanceForTest.addReview(newReview);

        String expect = "The Best Buy is a 3 dollor signs shop which sells electrics. [The review: 'This place is nice' is written by Tim with 3 stars.]";
        assertEquals(expect,instanceForTest.toSting());
    }

}