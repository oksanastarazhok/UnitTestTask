import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestMult extends BaseTest {

    private long first;
    private long second;
    private long expected;

    @Factory(dataProvider = "DataForMult")
    public TestMult(long first, long second, long expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @DataProvider(name = "DataForMult")
    public static Object[][] DataForMult() {
        return new Object[][]{
                {0, 100, 0},
                {-1, -1, 1},
                {7, 7, 49},
                {-5, 5, -25}
        };
    }

    @Test(priority = 3, groups = {"long"})
    public void firstTimesSecond() {
        long mult = calculator.mult( first, second );
        Assert.assertEquals( mult, expected );
    }

}
