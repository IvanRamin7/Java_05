public class OddEven {

    /**
     * В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
     * если число нечетное, и “Even”, если число четное.
     *
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     **/

    public String oddEven(int num) {
        if (num % 2 == 0) {

            return "Even";
        } else return "Odd";
    }
}
