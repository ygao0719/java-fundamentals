package inheritance;

public class Review {
    private String body;
    private String author;
    private int numOfStarFromReview;

    public Review(String body, String author, int numOfStarFromReview){
        this.body = body;
        this.author = author;
        this.numOfStarFromReview = numOfStarFromReview;
    }
    public String toString(){
        return String.format("The review: '%s' is written by %s with %d stars.", this.body, this.author, this.numOfStarFromReview);
    }

    public String getBody(){
        return this.body;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getNumOfStarFromReview(){
        return this.numOfStarFromReview;
    }
}
