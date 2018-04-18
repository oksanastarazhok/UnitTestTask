import org.testng.annotations.Test;

public class TestDivNegativeDouble extends BaseTest{
    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero",
            groups = {"negative"})
    public void doubleDivisionOnZero(){
        calculator.div( 1.56,0.0 );
    }

}

