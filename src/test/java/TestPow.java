import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPow extends BaseTest {

    @Test(dataProvider = "dataForPow", groups = {"double"})
    public void testPow(double first, double second, double expected) {
        double pow = calculator.pow( first, second );
        Assert.assertEquals( pow, expected );
    }

    @DataProvider(name = "dataForPow")
    public static java.lang.Object[][] dataForPow() {
        return new java.lang.Object[][]{
                {10., 2, 100.},
                {-1., -1, -1.},
                {5.5, 3, 166.375},
                {25., -1, 0.04},
                {0., 5, 0.},
                {5., 0, 1.}};

    }
}
