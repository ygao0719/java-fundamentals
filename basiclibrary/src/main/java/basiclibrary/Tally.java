package basiclibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tally {
    public String tally(List<String> input){
        HashMap<String,Integer> voteCounts = new HashMap<>();

        for (String element : input){
            voteCounts.put(element, 0);
        }
        for (String voter : input){
            int countSoFar = voteCounts.get(voter);
            voteCounts.put(voter,countSoFar + 1);
        }

        int max = 0;
        String maxVoter = "";
        for (String vote : input){
            int count = voteCounts.get(vote);
            if (count > max){
                max = count;
                maxVoter = vote;
            }
        }
        return maxVoter;
    }
}
