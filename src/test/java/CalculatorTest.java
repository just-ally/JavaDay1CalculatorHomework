import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(52, calculator.add(42, 10));
    }

    @Test
    public void canSubtract(){
        assertEquals(32, calculator.subtract(42, 10));
    }

    @Test
    public void canMultiply(){
        assertEquals(420, calculator.multiply(42, 10));
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divide(40, 10));
    }

}
