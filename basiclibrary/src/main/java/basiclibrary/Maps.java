package basiclibrary;

import java.util.HashSet;

public class Maps {
    public String maps(int[][] inputArr){
        int minValue = 9000;
        int maxValue = 0;
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i < inputArr.length; i++){
            for (int j = 0; j < inputArr[i].length; j++){
                if (inputArr[i][j] < minValue){
                    minValue = inputArr[i][j];
                }
                if (inputArr[i][j] > maxValue){
                    maxValue = inputArr[i][j];
                }
                h.add(inputArr[i][j]);
            }
        }

        String message = "High: " + maxValue + "Low: " + minValue;

        for (int i = minValue; i <= maxValue; i ++){
            if (!h.contains(i)){
                message = message + ("Never saw temperature: " + i);
            }
        }
        return message;
    }
}
