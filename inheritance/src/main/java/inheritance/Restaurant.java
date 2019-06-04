package inheritance;

public class Restaurant {
    private String name;
    private int numOfStar;
    private int numOfDollors;

    public Restaurant(String name, int numOfStar, int numOfDollors){

        this.name = name;
        this.numOfStar = numOfStar;
        this.numOfDollors = numOfDollors;
    }

    public String toString(){
        return String.format("The restaurant %s has %d stars and %d dollor signs.", this.name, this.numOfStar, this.numOfDollors);
    }
}
