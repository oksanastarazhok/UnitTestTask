import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestDiv extends BaseTest {



    @DataProvider(name = "DataForDiv")
    public static Object[][] DataForDiv(){
        return new Object[][]{
                {100, 50, 2},
                {-1, -1, 1},
                {0, 1, 0}};
    }

    @Test (dataProvider = "DataForDiv",priority = 2, groups = {"long"})
    public void firstDivideSecond(long first, long second, long expected){
        long div = calculator.div( first, second );
        Assert.assertEquals( div, expected );


    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero",
            groups = {"negative"})
    public void devisionOnZero() {
        calculator.div( 1, 0 );
    }


}
