import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(); }

    @Test
    public void hasAdd(){
        assertEquals(6, calculator.add(2,4));
    }

    @Test
    public void hasSubtract(){
        assertEquals(4, calculator.subtract(6,2));
    }

    @Test
    public void hasMultiply(){
        assertEquals(12, calculator.multiply(6,2));
    }
}
