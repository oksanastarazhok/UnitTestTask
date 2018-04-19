import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestSub extends BaseTest {
    private long first;
    private long second;
    private long expected;



    @Factory(dataProvider = "DataForSub")
    public TestSub(long first, long second, long expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }



    @DataProvider(name = "DataForSub")
    public static Object[][] DataForSub() {
        return new Object[][]{
                {1, 1, 0},
                {-2, -2, 0},
                {0, 0, 0},
                {1000000, 1, 999999}};
    }

    @Test(description = "Verifies subtraction for long type",
            groups = {"long"},alwaysRun = true)
    public void firstMinusSecondLong() {
        long sub = calculator.sub( first, second );
        Assert.assertEquals( sub, expected );

    }


}
