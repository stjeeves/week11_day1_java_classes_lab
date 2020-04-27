import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(2, 4);
    }

    @Test
    public void addResult(){
        assertEquals(6, calculator.add());
    }

    @Test
    public void subtractResult(){
        assertEquals( -2, calculator.subtract());
    }

    @Test
    public void multiplyResult(){
        assertEquals( 8, calculator.multiply());
    }

    @Test
    public void divideResult(){
        assertEquals( 2, calculator.divide());
    }

}
