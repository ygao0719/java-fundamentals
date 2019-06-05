package inheritance;

import java.util.List;

public class Theater {
    private String theaterName;
    private List<String> movies;

    public Theater(String theaterName, List<String> movies){

        this.theaterName = theaterName;
        this.movies = movies;
    }
    //add moviews
    public void addMovie(String newMovie){
        if(newMovie != "") {
            movies.add(newMovie);
        }
    }
}
