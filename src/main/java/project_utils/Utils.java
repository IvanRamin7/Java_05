package project_utils;

public class Utils {
  
    public int[] bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    isSorted = false;
                }
            }
        }

        return array;
    }

}
