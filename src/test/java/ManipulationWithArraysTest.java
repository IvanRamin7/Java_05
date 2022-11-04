import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationWithArraysTest {

    @Test
    public void test_HappyPath() {
        int[] numbers = {2, 5, 3, 7, 8, 9};
        int[] expectedResult = {7, 8, 9};

        int[] actualResult = new ManipulationWithArrays().getTheGreaterHalf(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_HappyPathNotEvenArray() {
        int[] numbers = {2, 3, 1};
        int[] expectedResult = {3, 1};

        int[] actualResult = new ManipulationWithArrays().getTheGreaterHalf(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
