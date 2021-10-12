package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciCalculate() {
        Fibonacci fibonacci = null;

        assertEquals(0L, fibonacci.calculate(0));
        assertEquals(1L, fibonacci.calculate(1));
        assertEquals(1L, fibonacci.calculate(2));
        assertEquals(2L, fibonacci.calculate(3));
        assertEquals(3L, fibonacci.calculate(4));
        assertEquals(5L, fibonacci.calculate(5));
        assertEquals(8L, fibonacci.calculate(6));

        assertEquals(12586269025L, fibonacci.calculate(50));
    }
}
