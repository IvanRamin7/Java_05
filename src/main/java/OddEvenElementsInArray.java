import java.lang.reflect.Array;

public class OddEvenElementsInArray {

    OddEvenValuesInArray objectOfHelper = new OddEvenValuesInArray();
    /**
     * В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
     * который принимает на вход массив целых чисел и возвращает массив int[2], который содержит количество четных и
     * нечетных элементов входящего массива
     **/

    public int[] countOddEvenValuesInArray(int[] incoming) {
        if (incoming != null) {
            int counterEven = 0;
            int counterOdd = 0;


            for (int i = 0; i < incoming.length; i++) {
                if (incoming[i] % 2 == 0) {
                    counterEven++;
                } else counterOdd++;
            }

            return new int[]{counterEven, counterOdd};
        } else return new int[0];
    }

    /**
     * В классе OddEvenElementsInArray написать метод createOddEvenArray(), который принимает
     * массив целых случайных чисел, и возвращает двумерный массив (массив четных и массив нечетных чисел)
     */

    public int[][] createOddEvenArray(int[] incoming) {
        if(incoming != null || incoming.length > 0) {
            return  new int[][] {objectOfHelper.giveOnlyEvenFromArray(incoming),
                    objectOfHelper.giveOnlyOddFromArray(incoming)};
        }
        else return new int[0][0];
    }


}

