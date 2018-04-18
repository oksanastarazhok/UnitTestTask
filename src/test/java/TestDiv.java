import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestDiv extends BaseTest {

    private long first;
    private long second;
    private long expected;

    @Factory(dataProvider = "DataForDiv")
    public TestDiv(long first, long second, long expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @DataProvider(name = "DataForDiv")
    public static Object[][] DataForDiv(){
        return new Object[][]{
                {100, 50, 2},
                {-1, -1, 1},
                {0, 1, 0}};
    }

    @Test (priority = 2, groups = {"long"})
    public void firstDivideSecond(){
        long div = calculator.div( first, second );
        Assert.assertEquals( div, expected );
    }




}
