public class BiggerValue {
    /**
     Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     Test Data:
     3333, 9999
     Expected Result = 9999
     **/

    public int biggerValue(int first, int second) {
        if(first > second) {

            return first;
        } else if(second > first) {

            return second;
        } else

            return 0;
    }
}
