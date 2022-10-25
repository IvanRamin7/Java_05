import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void test_HappyPath1() {
        int[] in = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(in);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_HappyPath2() {
        int[] in = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumArray(in);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
