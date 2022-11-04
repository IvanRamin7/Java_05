import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CreateArrayTest {

    @Test
    public void testCreateArrayFromText_HappyPath() {
        String text = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createArrayFromText(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArrayFromText_HappyPath9() {
        String numbers = "3 6 37 678 36 14 ";
        int[] expectedResult = {3, 6, 37, 678, 36, 14};

        int[] actualResult = new CreateArray().createIntArrayFromText(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArrayFromText_HappyPathDoubles() {
        String numbers = "53.9 64 10.84 1098.0 2";
        int[] expectedResult = {53, 64, 10, 1098, 2};

        int[] actualResult = new CreateArray().createIntArrayFromText(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
