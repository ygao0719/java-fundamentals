package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JSLinter {
    public static void main(String[] args){
        jsLinter("src/main/resources/gates.js");

    }
    public static int jsLinter(String path){
        int lineNum = 0;
        int countError = 0;

        try {
            Scanner sc = new Scanner(new File(path));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                lineNum ++;
                if (!line.contains(";") && line.length() > 0 && !line.contains("{") &&
                !line.contains("}") && !line.contains("if") && !line.contains("else")){
                    countError ++;
                    System.out.println("Line " + lineNum + " Missing semicolon." );
                }
            }

        } catch(FileNotFoundException e){
            System.out.println("File not found");
            System.out.println(e);

        }
        System.out.println("The total errors for " + path + " is " + countError);
        return countError;
    }

}

