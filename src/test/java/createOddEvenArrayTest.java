import org.testng.Assert;
import org.testng.annotations.Test;

public class createOddEvenArrayTest {

    @Test
    public void test_MixedNumbers_HappyPath() {
        int[] numbers = {-189, 189, 40, - 40, 0};
        int[][] expectedResult = {{40, -40, 0}, {-189, 189}};

        int[][] actualResult = new OddEvenElementsInArray().createOddEvenArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
