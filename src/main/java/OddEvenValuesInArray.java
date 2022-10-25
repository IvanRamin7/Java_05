public class OddEvenValuesInArray {

    /**
     * Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел, и возвращает количество
     * четных чисел в этом массиве
     */

    public int countEvenValuesInArray(int[] numbers) {
        if(numbers.length > 0) {
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % 2 == 0) {
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
        if(numbers.length > 0) {
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % 2 != 0) {
                    count++;
                }
            }

            return count;

        } else return 0;
    }
}
