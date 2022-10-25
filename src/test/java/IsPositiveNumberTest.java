import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void testPositiveNumb_HappyPath() {
        int in = 555;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(in);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testZero_HappyPath() {
        int in = 0;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(in);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeNumb_HappyPath() {
        int in = -555;
        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(in);

        Assert.assertEquals(expectedResult, actualResult);
    }



}
