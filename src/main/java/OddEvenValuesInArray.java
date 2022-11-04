public class OddEvenValuesInArray {

    /**
     * Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел, и возвращает количество
     * четных чисел в этом массиве
     */

    public int countEvenValuesInArray(int[] numbers) {
        if (numbers.length > 0) {
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    count++;
                }
            }

            return count;

        } else return 0;
    }

    /**
     * Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,  и возвращает количество
     * нечетных чисел в этом массиве
     */

    public int countOddValuesInArray(int[] numbers) {
        if (numbers.length > 0) {
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    count++;
                }
            }

            return count;

        } else return 0;
    }

    /**
     * Method for creating only EVEN numbers array from original array
     * */

    public int[] giveOnlyEvenFromArray(int[] input) {
        if (input != null || input.length == 0) {
            int[] out = new int[countEvenValuesInArray(input)];
            int outputIndex = 0;

            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 == 0) {
                    out[outputIndex++] = input[i];
                }
            }
            return out;
        } else return new int[0];
    }

    /**
     * Method for creating only ODD numbers array from original array
     * */

    public int[] giveOnlyOddFromArray(int[] input) {
        if(input != null || input.length == 0) {
            int[] out = new int[countOddValuesInArray(input)];
            int outputIndex = 0;

            for (int i = 0; i < input.length; i++) {
                if(input[i] % 2 != 0) {
                    out[outputIndex++] = input[i];
                }
            }

            return out;
        } else return new int[0];
    }
}
