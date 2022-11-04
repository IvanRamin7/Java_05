import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

public class OddEvenElementsInArrayTest {

    @Test
    public void test_countOddEvenValuesInArray_HappyPath0 () {
        int [] numbers = {0, 0, 0};
        int [] expectedResult = {3, 0};

        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void test_countOddEvenValuesInArray_HappyPathMixed () {
        int [] numbers = {100, 0, 101, -88, Integer.MAX_VALUE};
        int [] expectedResult = {3, 2};

        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_createOddEvenArray_HappyPath() {
        int[] numbers = {1, 5, 2, 4, 7};
        int[][] expectedResult = {{2, 4}, {1, 5, 7}};

        int[][] actualResult = new OddEvenElementsInArray().createOddEvenArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
