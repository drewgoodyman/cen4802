package module7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 4);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(6, 4);
        Assertions.assertEquals(24, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int result = calculator.square(4);
        Assertions.assertEquals(16, result);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        int result = calculator.power(2, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testNegativeExponent() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.power(2, -3);
        });
    }
}

