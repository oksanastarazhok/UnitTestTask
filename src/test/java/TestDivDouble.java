import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDivDouble extends  BaseTest {

    @Test(description = "Verifies devision for double type", dataProvider = "DataForDivDouble",
            groups = {"double"}, priority = 3)
    public void firstDivideSecond(double first, double second, double expected){
        double div = calculator.div( first,second );
        Assert.assertEquals( div,expected );
    }

    @DataProvider(name = "DataForDivDouble")
    public static Object[][] DataForDivDouble(){
        return new Object[][]{
                {100.00, 50.00, 2.00},
                {-1.5, -1.2, 1.25}};
    }
}
