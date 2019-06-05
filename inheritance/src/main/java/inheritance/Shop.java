package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String descrip;
    private int numOfDollor;
    private List<Review> reviews;

    public Shop(String name, String descrip, int numOfDollor){
        this.name = name;
        this.descrip = descrip;
        this.numOfDollor = numOfDollor;
        this.reviews = new ArrayList<>();
    }

    public String toSting(){
        return String.format("The %s is a %d dollor signs shop which %s. %s",
                this.name,this.numOfDollor,this.descrip,this.reviews);
    }

    public void addReview(Review newReview){
        if (newReview != null){
            reviews.add(newReview);
        }
    }

}
