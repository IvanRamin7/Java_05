import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public void test_HappyPath() {
        int first = 3333;
        int second = 9999;
        int expectedResult = 9999;

        int actualResult = new BiggerValue().biggerValue(first, second);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
