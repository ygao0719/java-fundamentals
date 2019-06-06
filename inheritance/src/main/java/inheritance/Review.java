package inheritance;

public class Review {
    private String body;
    private String author;
    private int numOfStarFromReview;
    private String movieName;
    //constructor for no movie
    public Review(String body, String author, int numOfStarFromReview){
        this.body = body;
        this.author = author;
        this.numOfStarFromReview = numOfStarFromReview;
    }
    //constructor for people go to theater and watch the movie
    public Review(String body, String author, int numOfStarFromReview, String movieName){
        this.body = body;
        this.author = author;
        this.numOfStarFromReview = numOfStarFromReview;
        this.movieName = movieName;
    }

    public String toString(){
        if (movieName == null) {
            return String.format("The review: '%s' is written by %s with %d stars.",
                    this.body, this.author, this.numOfStarFromReview);
        }else{
            return String.format("The review: '%s' is written by %s with %d stars. I watched movie %s",
                    this.body, this.author, this.numOfStarFromReview,this.movieName);
        }
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
