package inheritance;

public class Review extends Restaurant{
    private String body;
    private String author;
    private int numOfStarFromReview;

    public Review(String name, int numOfStar, int numOfDollors,String body, String author, int numOfStarFromReview){
        super(name,numOfStar,numOfDollors);
        this.body = body;
        this.author = author;
        this.numOfStarFromReview = numOfStarFromReview;
    }
    public String toString(){
        return String.format("The review: %s is written by %s with %d stars for %s. After review, the star rating for %s is %d", this.body, this.author, this.numOfStarFromReview,this.getName(),this.getName(),(numOfStarFromReview + this.getNumOfStar())/2);
    }


}
