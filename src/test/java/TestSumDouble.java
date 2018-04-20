import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSumDouble extends BaseTest {

    @DataProvider(name = "DataForSumDouble")
    public static java.lang.Object[][] DataForSumDouble() {
        return new java.lang.Object[][]{
                {1.5, 1.5, 3.0}, {-1.0, 1.0, 0},
                {0, 0, 0}, {-5.0, -5.0, -10.0}, {7.123456, 7.123456, 14.246912}};
    }

    @Test(description = "Verifies sum of two numbers for double type", dataProvider = "DataForSumDouble",
            groups = {"double"})
    public void firstPlusSecond(double first, double second, double expected) {
        double sum = calculator.sum(first, second);
        Assert.assertEquals(sum, expected);
    }
}
