import java.lang.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(3);
    
        clock();
        
        }

   //methods
    public static String pluralize(String input, int court){
        if(court == 0 || court > 1 ){
            return input + "s";
        }else{
            return input;
        }
    }

    public static void flipNHeads (int n){
        int flip = 0;
        int courtHead = 0;
        while(courtHead != n) {
            double randomNum = Math.random();
            flip ++;

            if (randomNum < 0.5) {
                System.out.println("tails");
                courtHead=0;
            } else {
                System.out.println("heads");
                courtHead++;
                if (courtHead == n)
                    break;
            }

        }
        System.out.println("It took " + flip + " flips to flip " + n + " heads in a row.");
    }

    public static void clock(){
        LocalDateTime pres = LocalDateTime.now();
        while(true){
            // int preSecond = pres.getSecond();
            LocalDateTime now = LocalDateTime.now();
            Duration timeDiff = java.time.Duration.between(pres, now);
            long seconds = timeDiff.getSeconds();
            if(seconds >= 1){
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
                pres = now;
            }
            }
    
        }

    }
