import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSum extends BaseTest {

    @Test(description = "Verifies sum of two numbers for Long type",
            dataProvider = "DataForSumLong", groups = {"long"})
    public void firstPlusSecond(long first, long second, long expected){
        long sum = calculator.sum( first,second );
        Assert.assertEquals( sum, expected );
    }


    @DataProvider(name = "DataForSumLong")
    public static java.lang.Object[][] DataForSumLong() {
        return new java.lang.Object[][]{
                {1, 0, 1}, {-1, -1, -2},
                {0, 0, 0}, {7123456, 7123456, 14246912}};
    }


}
