import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test
    public void testBothEqual_HappyPath() {
        int first = 89;
        int second = 89;
        int expectedResult = 0;

        int actualResult = new AreNumbersEqual().areNumbersEqual(first, second);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOneIsSmaller_HappyPath() {
        int first = -89;
        int second = 89;
        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(first, second);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOneIsSmaller2_HappyPath() {
        int first = 89;
        int second = -89;
        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(first, second);

        Assert.assertEquals(expectedResult, actualResult);
    }


}
