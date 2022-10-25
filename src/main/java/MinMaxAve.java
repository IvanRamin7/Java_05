public class MinMaxAve {
    /**
     * Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов. Алгоритм возвращает
     * массив, который содержит минимальное значение, максимальное значение,  и среднее среди всех значений
     * между 2-мя индексами.
     * <p>
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     **/

    public int[] minMaxAve(int[] inputArray, int index1, int index2) {
        if (inputArray != null && index1 >= 0 && index2 <= inputArray.length) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sumForAverage = 0;

            for (int i = index1; i <= index2; i++) {
                sumForAverage += inputArray[i];
                if (inputArray[i] < min) {
                    min = inputArray[i];
                } else if (inputArray[i] > max) {
                    max = inputArray[i];
                }
            }

            return new int[]{min, max, sumForAverage / (index2 - index1 + 1)};
        } else return new int[0];
    }
}

