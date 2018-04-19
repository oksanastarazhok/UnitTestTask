import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTg extends BaseTest {

    @Test(dataProvider = "dataForTg", groups = {"double"})
    public void tgOfNumber(double first, double expected) {
        double tg = calculator.tg( first );
        Assert.assertEquals( tg, expected );
    }

    @DataProvider(name = "dataForTg")
    public static java.lang.Object[][] dataForTg() {
        return new java.lang.Object[][]{
                {0, 0.0},
                {3.5, 0.9981778976111987},
                {90.328, 1.0}};

    }
}
