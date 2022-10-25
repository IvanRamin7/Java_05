import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

   @Test

   public void testNumNegative_HappyPath() {
       //arrange
       int num = -345;
       String expectedResult = "Odd";

       //act
       OddEven oddEven = new OddEven();
       String actualResult = oddEven.oddEven(num);

       //assert
       Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testNumZero_HappyPath() {
       //arrange
        int num = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(0);

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test

    public void testNumPositive_HappyPath() {
       int num = 22222;
       String expectedResult = "Even";

       String actualResult = new OddEven().oddEven(num);

       Assert.assertEquals(expectedResult, actualResult);
    }

}
