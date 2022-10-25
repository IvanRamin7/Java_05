import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void test_HappyPath() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = new int[] {3, 7, 5};

        int[] actualResult = new MinMaxAve().minMaxAve(input, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_HappyPath2() {
        int[] input = {3, 7, 2, 8, 10, 1, 9, 4, 9, 2};
        int index1 = 0;
        int index2 = 4;
        int[] expectedResult = {2, 10, 6};

        int[] actualResult = new MinMaxAve().minMaxAve(input, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
