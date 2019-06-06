package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private int numOfStar;
    private int numOfDollors;
    private List<Review> reviews;

    //constructor
    public Restaurant(String name, int numOfDollors){
        this.name = name;
        this.numOfStar = 0;
        this.numOfDollors = numOfDollors;
        this.reviews = new ArrayList<>();
    }

    public String toString(){
        if (reviews.isEmpty()){
            return String.format("The restaurant %s has %d stars and %d dollor signs.",
                    this.name,this.numOfStar, this.numOfDollors);
        }else {
            return String.format("The restaurant %s has %d stars and %d dollor signs with reviews: %s.",
                    this.name, this.numOfStar, this.numOfDollors, this.reviews);
        }
    }

    public String getName(){
        return this.name;
    }

    public int getNumOfStar(){
        return  this.numOfStar;
    }

    //add review for restaurant
    public void addReview(Review newReview){
        if(newReview != null){
            reviews.add(newReview);
            updateStar();
        }
    }

    public void updateStar(){
        int sum = 0;
        for(Review r : reviews){
            sum += r.getNumOfStarFromReview();
        }
        numOfStar = sum/reviews.size();
    }

}
