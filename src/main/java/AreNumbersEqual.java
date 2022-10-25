public class AreNumbersEqual {
    /**
     * Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
     * 0, если числа равны
     * -1, если первое число меньше второго
     * 1, если первое число больше второго
     * Test Data:
     * 89, 89
     * Expected result: 0
     * -89, 89
     * Expected result: -1
     * 89, -89
     * Expected result: 1
     **/

    public int areNumbersEqual(int first, int second) {
        if (first < second) {

            return -1;
        } else if (second < first) {

            return 1;
        } else

            return 0;
    }
}
