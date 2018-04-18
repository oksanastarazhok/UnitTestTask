import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestIsNegative extends BaseTest {
    private long val;
    private boolean expected;

    @Factory(dataProvider = "dataForIsNegative")
    public TestIsNegative(long val, boolean result) {
        this.val = val;
        this.expected = result;
    }

    @DataProvider(name = "dataForIsNegative")
    public static Object[][]dataForIsNegative(){
        return new Object[][]{
                {1L, false } ,
                {-1L, true},
                {0L, false},
                {-78554221L, true}};
    }

    @Test (groups = {"negative"})
    public void checkNumber(){
        boolean result = calculator.isPositive(val);
        Assert.assertEquals( result,expected );

    }
}
