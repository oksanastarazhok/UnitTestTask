import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestMultDouble extends BaseTest {
    private double first;
    private double second;
    private double expected;

    @Factory (dataProvider = "DataForMultDouble")
    public TestMultDouble(double first, double second, double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @DataProvider(name = "DataForMultDouble")
    public static Object[][] DataForMultDouble(){
        return new Object[][]{
                {0, 100.00, 0},
                {-1.00, -1.00, 1.00},
                {0.5, 0.5, 0.25},
                {-5.0, 5.0, -25.00}
        };
    }

    @Test (groups = {"double"})
    public void firstTimesSecond(){
        double mult = calculator.mult( first, second );
        Assert.assertEquals( mult,expected );
    }
}
