package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String theaterName;
    private List<String> movies;
    private List<Review> reviewsForTheater;

    public Theater(String theaterName){

        this.theaterName = theaterName;
        this.movies = new ArrayList<>();
        this.reviewsForTheater = new ArrayList<>();
    }
    //add movies
    public void addMovie(String newMovie){
        if(newMovie.equals("")) {
            movies.add(newMovie);
        }
    }

    //remove movies
    public void removeMovie(String deleteMovie){
        if (movies.contains(deleteMovie) && deleteMovie != "") {
                movies.remove(deleteMovie);
        }else{
            throw new IllegalArgumentException();
        }
    }

    //to string
    public String toString(){
        if(this.reviewsForTheater.isEmpty()) {
            return String.format("The %s has movies %s.", this.theaterName, this.movies);
        }else{
            return String.format("The %s has movies %s. %s.", this.theaterName, this.movies, this.reviewsForTheater);

        }
    }

    //add review for theater
    public void addReview(Review newReviewForTheater){
        if (newReviewForTheater != null){
            reviewsForTheater.add(newReviewForTheater);
        }
    }
}
