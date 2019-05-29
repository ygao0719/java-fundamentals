package basiclibrary;

public class ArrayOfArray {
    public int[] arrayOfArray(int[][] inputArray){
        double[] ave = new double[inputArray.length];
        for(int i = 0;i<inputArray.length;i++){
            int total = 0;
            for(int j = 0;j< inputArray[i].length;j++){
                total = total + inputArray[i][j];
            }
            ave[i] = total/inputArray[i].length;
        }

        double min = ave[0];
        int lowestIndex = 0;
        for (int i = 1; i < ave.length; i ++){
            if (ave[i] < min){
                min = ave[i];
                lowestIndex = i;
            }
        }
        return inputArray[lowestIndex];
    }
}
