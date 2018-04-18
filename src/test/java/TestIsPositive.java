import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestIsPositive extends BaseTest {
    private long val;
    private boolean expected;

    @Factory(dataProvider = "dataForIsPositive")
    public TestIsPositive(long val, boolean result) {
        this.val = val;
        this.expected = result;
    }

    @DataProvider(name = "dataForIsPositive")
    public static Object[][]dataForIsPositive(){
        return new Object[][]{
                {1, true } ,
                {-1, false},
                {0, true},
                {78554221, true}};
    }

    @Test (groups = {"positive"})
    public void checkNumber(){
        boolean result = calculator.isPositive(val);
        Assert.assertEquals( result,expected );

    }
}
