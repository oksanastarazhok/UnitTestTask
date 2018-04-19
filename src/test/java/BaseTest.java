import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Date;

public class BaseTest {
    protected Calculator calculator;

    @BeforeClass(groups = "config")
    public void setup() {
        System.out.println( "Create new instance of Calculator" );
        calculator = new Calculator();
    }

    @AfterClass(groups = "config")
    public void tearDown() {
        System.out.println( "Return initial configuration back" );
    }

    @AfterClass(groups = "config")
    protected void checkTime() {
        System.out.println( "Current time:  " + new Date( System.currentTimeMillis() ) );
    }
}
