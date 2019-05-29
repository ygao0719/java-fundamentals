package basiclibrary;

public class Roll {
    public int[] roll(int n){
        int[] rollResult = new int[n];
        for (int i = 0; i < n; i ++){
            rollResult[i] = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        }
        return rollResult;
    }
}
