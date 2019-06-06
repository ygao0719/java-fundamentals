package inheritance;

import org.junit.Test;


import java.sql.Array;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void test_toString() {
        Theater instanceForTest = new Theater("Seattle");
        instanceForTest.addMovie("Fast");
        instanceForTest.addMovie("Fast fusion");
        instanceForTest.addMovie("Fast car");
        instanceForTest.removeMovie("Fast");

        String expect = "The Seattle has movies [Fast fusion, Fast car].";

        assertEquals(expect, instanceForTest.toString());
    }
    //test for people just go to theater and get popcorn no movies
    @Test
    public void test_addReview(){
        Theater instanceForTest = new Theater("Auburn Theater");
        instanceForTest.addMovie("Fast");
        instanceForTest.addMovie("Fast fusion");
        instanceForTest.addMovie("Fast car");
        instanceForTest.removeMovie("Fast");

        Review newReviewForTheater = new Review("This theater is horrible", "Tim",1);
        instanceForTest.addReview(newReviewForTheater);
        String expect = "The Auburn Theater has movies [Fast fusion, Fast car]. [The review: 'This theater is horrible' is written by Tim with 1 stars.].";

        assertEquals(expect,instanceForTest.toString());
    }
    //test for people go to theater and watch movies
    @Test
    public void test_addReviewForMovie(){
        Theater instanceForTest = new Theater("Auburn Theater");
        instanceForTest.addMovie("Fast");
        instanceForTest.addMovie("Fast fusion");
        instanceForTest.addMovie("Fast car");
        instanceForTest.removeMovie("Fast");

        Review newReviewForTheater = new Review("This theater is horrible", "Tim",1,"Fast car");
        instanceForTest.addReview(newReviewForTheater);
        String expect = "The Auburn Theater has movies [Fast fusion, Fast car]. [The review: 'This theater is horrible' is written by Tim with 1 stars. I watched movie Fast car].";

        assertEquals(expect,instanceForTest.toString());
    }

    //test addMovie method
    @Test
    public void test_addMovie(){
        Theater instanceForTest = new Theater("Seattle theater");
        instanceForTest.addMovie("Bad dad");

        String expect = "The Seattle theater has movies [Bad dad].";
        assertEquals(expect, instanceForTest.toString());
    }

    //test removeMovie method
    @Test
    public void test_removeMovie(){
        Theater instanceForTest = new Theater("Seattle theater");
        instanceForTest.addMovie("Bad dad");
        instanceForTest.addMovie("Bad mom");
        instanceForTest.removeMovie("Bad mom");

        String expect = "The Seattle theater has movies [Bad dad].";
        assertEquals(expect, instanceForTest.toString());
    }

}