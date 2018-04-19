import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCos extends BaseTest {

    @DataProvider(name = "dataForCos")
    public static java.lang.Object[][] dataForCos() {
        return new java.lang.Object[][]{
                {0.0, 1.0000},
                {90, 0.0},
                {360, 1.0},
                {180, -1.0}};
    }

    @Test(dataProvider = "dataForCos", groups = {"double"})
    public void cosOfNumber(double first, double expected) {
        double tempFirst = Math.toRadians( first );
        double cos = calculator.cos( tempFirst );
        Assert.assertEquals( cos, expected );
    }

}
