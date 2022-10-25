import org.testng.Assert;
import org.testng.annotations.Test;

public class GivenIntegerMTest {

    @Test
    public void testMultipleSevenNine() {
        int m = 63;
        String expectedResult = "Good Number";

        String actualResult = new GivenIntegerM().givenIntegerM(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleOnlyNine() {
        int m = 981;
        String expectedResult = "Bad Number";

        String actualResult = new GivenIntegerM().givenIntegerM(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleOnlyEleven() {
        int m = 88;
        String expectedResult = "Poor Number";

        String actualResult = new GivenIntegerM().givenIntegerM(m);

        //Assert.assertEquals(expectedResult, actualResult);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
