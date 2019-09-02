import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void Before(){
        calculator = new Calculator(10.87, 5.21);
    }

    @Test
    public void canAdd(){
        assertEquals(16.08, calculator.add(), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(5.66, calculator.subtract(), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(56.63, calculator.multiply(), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(2.09, calculator.divide(), 0.01);
    }
}
