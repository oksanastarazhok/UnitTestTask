import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDivDouble extends BaseTest {

    @DataProvider(name = "DataForDivDouble")
    public static Object[][] DataForDivDouble() {
        return new Object[][]{
                {100.00, 50.00, 2.00},
                {-1.5, -1.2, 1.25}};
    }

    @Test(description = "Verifies devision for double type", dataProvider = "DataForDivDouble",
            groups = {"double"})
    public void firstDivideSecond(double first, double second, double expected) {
        double div = calculator.div( first, second );
        Assert.assertEquals( div, expected );
    }

    public class TestDivNegativeDouble extends BaseTest {
        @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero",
                groups = {"negative"})
        public void doubleDivisionOnZero() {
            calculator.div( 1.56, 0.0 );
        }
    }
}
