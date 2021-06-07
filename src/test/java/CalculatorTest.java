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
    public void testAddNumbers(){
        int num1 = 2;
        int num2 = 2;

        assertEquals(4,calculator.addNumbers(num1, num2));
    }
    @Test
    public void testMultiplyNumbers(){
        int num1 = 5;
        int num2 = 6;

        assertEquals(30, calculator.multiplyNumbers(num1, num2));
    }

    @Test
    public void testSubtractNumbers(){
        int num1 = 10;
        int num2 = 8;

        assertEquals(2,calculator.subtractNumbers(num1,num2));

    }

    @Test
    public void testDivideNumbers(){
        double num1 = 24.50;
        double num2 = 02.00;
        assertEquals(12.25, calculator.divideNumbers(num1,num2),0.00);
    }


}

