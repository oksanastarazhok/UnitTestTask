import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCtg extends BaseTest {

    @DataProvider(name = "dataForCtg")
    public static java.lang.Object[][] dataForCtg() {
        return new java.lang.Object[][]{
                {0, 0},
                {180, 1.0},
                {360, 1.0}};
    }

    @Test(dataProvider = "dataForCtg", groups = {"double"})
    public void ctgOfNumber(double first, double expected) {
        double ctg = calculator.ctg( first );
        Assert.assertEquals( ctg, expected );
    }
}
