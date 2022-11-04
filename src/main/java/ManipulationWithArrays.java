import java.util.Arrays;

public class ManipulationWithArrays {
    /**
     * Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
     * Метод возвращает массив тех же чисел, умноженных на number
     * Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     **/

    public int[] multiplyArrayByNumber(int[] arrayNumbers, int number) {
        int[] out = new int[arrayNumbers.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            out[i] = arrayNumbers[i] * number;
        }
        return out;
    }

    /**
     * Написать метод toDoubleArray(), который принимает на вход массив целых чисел,  и возвращает массив типа double[]
     * из тех же чисел
     * Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     **/

    public double[] toDoubleArray(int[] incoming) {
        double[] out = new double[incoming.length];
        for (int i = 0; i < incoming.length; i++) {
            out[i] = incoming[i];
        }

        return out;
    }

    /**
     * Написать метод toIntArray(), который принимает на вход массив типа double[],  и возвращает массив типа int[] из
     * тех же чисел.
     * Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
     **/

    public int[] toIntArray(double[] doublesArray) {
        int[] out = new int[doublesArray.length];
        for (int i = 0; i < doublesArray.length; i++) {
            out[i] = (int) doublesArray[i];
        }

        return out;
    }

    /**
     * Написать метод toStringArray(), который принимает на вход массив целых чисел,  и возвращает массив типа String[]
     * из тех же чисел (желательно не использовать метод .toString(), нужно переводить вручную)
     * Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
     **/

    public String[] toStringArray(int[] arrayNumbers) {
        String[] out = new String[arrayNumbers.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            out[i] = String.valueOf((char) arrayNumbers[i]);
        }

        return out;
    }

    /**
     * Перегрузить метод toStringArray() параметром double[]. Этот метод должен возвращать массив типа String[]
     * (желательно не использовать метод .toString(), нужно переводить вручную)
     * Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
     */

    public String[] toStringArray(double[] arrayDoubles) {
        String[] out = new String[arrayDoubles.length];
        for (int i = 0; i < arrayDoubles.length; i++) {
            out[i] = arrayDoubles[i] + "";
        }

        return out;
    }

    /**
     * В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(), который принимает на вход
     * массив целых чисел и число number. Метод возвращает значение true, если все элементы массива больше number,
     * иначе возвращает false
     */

    public boolean areValuesGreaterThanNumber(int[] numbers, int number) {
        if (numbers.length > 0) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            if (sum > number) {

                return true;
            }
        }

        return false;
    }

    /**
     * В классе ManipulationsWithArrays написать метод getTheGreaterHalf(), который принимает массив целых чисел,
     * и возвращает  массив из суммарно бОльшей первой или второй половины входящего массива
     */

    public int[] getTheGreaterHalf(int[] input) {
        if (input == null) {

            return new int[0];
        } else if (input.length == 0 || input.length == 1) {

            return input;
        } else {
            int firstHalf = 0;
            int secondHalf = 0;
            int firstIndex = 0;
            int secondIndex = 0;

            for (int i = 0; i < input.length / 2; i++) {
                firstHalf += input[i];
                firstIndex++;
            }

            for (int i = input.length / 2; i < input.length; i++) {
                secondHalf += input[i];
                secondIndex++;
            }

            if (firstHalf == secondHalf) {

                return new int[0];
            } else if (firstHalf > secondHalf) {

                int[] output = new int[firstIndex];

                for (int i = 0; i < input.length / 2; i++) {
                    output[i] = input[i];
                }

                return output;
            } else {
                int[] output = new int[secondIndex];
                secondIndex = 0;

                for (int i = input.length / 2; i < input.length; i++) {
                    output[secondIndex] = input[i];
                    secondIndex++;
                }

                return output;
            }
        }
    }
}
