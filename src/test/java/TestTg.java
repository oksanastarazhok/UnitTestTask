import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTg extends BaseTest {

    @DataProvider(name = "dataForTg")
    public static java.lang.Object[][] dataForTg() {
        return new java.lang.Object[][]{
                {0, 0.0},
                {3.5, 0.9981778976111987},
                {90.328, 1.0}};

    }

    @Test(dataProvider = "dataForTg", groups = {"double"}, dependsOnGroups = "long")
    public void tgOfNumber(double first, double expected) {
        double tg = calculator.tg(first);
        Assert.assertEquals(tg, expected);
    }
}
