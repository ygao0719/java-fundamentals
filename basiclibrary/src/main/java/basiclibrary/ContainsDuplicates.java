package basiclibrary;

public class ContainsDuplicates {
    public boolean containsDuplicates(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result = true;
                    break;
                }
            }

        }
        return result;
    }
}
