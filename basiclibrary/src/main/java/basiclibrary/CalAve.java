package basiclibrary;

public class CalAve {
    public int calAve(int[] inputArr){
        int result = 0;
        int ave = 0;
        for(int i = 0; i < inputArr.length; i ++){
            result = result + inputArr[i];
        }
        ave = result/inputArr.length;
        return ave;
    }
}
