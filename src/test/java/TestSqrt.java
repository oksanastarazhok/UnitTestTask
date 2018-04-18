import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSqrt extends BaseTest {

    @Test(dataProvider = "dataForSqrt", groups = {"double"}, priority = 0)
    public void sqrtOfNumber(double first, double expected) {
        double sqrt = calculator.sqrt( first );
        Assert.assertEquals( sqrt, expected );
        //checkTime();
       // Timeout.sleep( 2 );
    }

    @DataProvider(name = "dataForSqrt")
    public static java.lang.Object[][] dataForSqrt() {
        return new java.lang.Object[][]{
                {-1.0, 1.0},
                {-25.00, 5.0},
                {0, 0}};
    }
}
