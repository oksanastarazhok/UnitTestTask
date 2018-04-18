import org.testng.annotations.Test;

public class TestDivNegative extends BaseTest {

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero",
    groups = {"negative"})
    public void devisionOnZero() {
        calculator.div( 1, 0 );
    }
}
