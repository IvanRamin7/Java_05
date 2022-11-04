public class OddIndices {
    /**
     * Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных
     * индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     **/

    public int[] oddIndices(int[] numbersArray) {
        if (numbersArray != null) {

            int[] out = new int[numbersArray.length / 2];
            int counter = 0;

            for (int i = 1; i < numbersArray.length; i += 2) {
                out[counter] = numbersArray[i];
                counter++;
            }

            return out;
        } else return new int[0];
    }
}


