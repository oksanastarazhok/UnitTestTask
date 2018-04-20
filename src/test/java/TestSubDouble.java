import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestSubDouble extends BaseTest {

    private double firstD;
    private double secondD;
    private double expectedD;

    @Factory(dataProvider = "DataForSubDouble")
    public TestSubDouble(double firstD, double secondD, double expectedD) {
        this.firstD = firstD;
        this.secondD = secondD;
        this.expectedD = expectedD;
    }

    @DataProvider(name = "DataForSubDouble")
    public static Object[][] DataForSubDouble() {
        return new Object[][]{
                {5.5, 5.5, 0},
                {-1.85, -1.15, -0.7000000000000002},
                {0, 1.5, -1.5}};
    }

    @Test(description = "Verifies subtraction for double type", groups = {"double"})
    public void firstMinusSecondDP() {
        double sub = calculator.sub(firstD, secondD);
        Assert.assertEquals(sub, expectedD);

    }
}
