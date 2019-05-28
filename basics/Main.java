import java.lang.String;

public class Main {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        }
    public static String pluralize(String input, int court){
        if(court == 0 || court > 1 ){
            return input + "s";
        }else{
            return input;
        }
    }

    public static 
}