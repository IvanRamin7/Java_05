import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test

    public void testEasyArray_HappyPath() {
        int[] in = {1, 2, 3, 4, 5};
        int[] expectedResult = {2, 4};

        int[] actualResult = new OddIndices().oddIndicies(in);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test

    public void testArray_HappyPath() {
        int[] in = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndicies(in);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
