public class SumArray {

    /**Написать алгоритм SumArray, который возвращает сумму всех чисел массива

     Test Data:
     {0, 1, 2, 3, 4, 5} → 15
     {-7, -3} → -10
     **/

    public int sumArray(int[] numbers) {
        if(numbers != null) {
            int out = 0;

            for (int i = 0; i < numbers.length; i++) {
                out += numbers[i];
            }

            return out;
        } else

            return 0;
    }
}
