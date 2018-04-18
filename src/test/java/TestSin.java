import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSin extends BaseTest {
    @Test(dataProvider = "dataForSin", groups = {"double"})
    public void sinOfNumber(double first, double expected) {
        double tempFirst = Math.toRadians(first);
        double sin = calculator.sin( tempFirst );
        Assert.assertEquals( sin, expected );
    }

    @DataProvider(name = "dataForSin")
    public static java.lang.Object[][] dataForSin() {
        return new java.lang.Object[][]{
                {90, 1},
                {30, 0.49999999999999994},
                {45, 0.7071067811865475},
                {270, -1}};
    }
}
