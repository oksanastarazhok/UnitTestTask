import org.testng.annotations.Test;

public class TestPowNegative extends BaseTest {
    @Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero",
    groups = {"negative"})
    public void powDivisionOnZero() {
        calculator.pow( 0, -1 );
    }
}
