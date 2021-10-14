package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testArrayFibonacci() {
        Fibonacci fibonacci = ArrayFibonacci.factory();

        assertEquals(0L, fibonacci.calculate(0));
        assertEquals(1L, fibonacci.calculate(1));
        assertEquals(1L, fibonacci.calculate(2));
        assertEquals(2L, fibonacci.calculate(3));
        assertEquals(3L, fibonacci.calculate(4));
        assertEquals(5L, fibonacci.calculate(5));
        assertEquals(8L, fibonacci.calculate(6));

        assertEquals(267914296L, fibonacci.calculate(42));
    }

    @Test
    public void testArrayFibonacci_NegativeNumber() {
        Fibonacci fibonacci = ArrayFibonacci.factory();

        assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.calculate(-1);
        });
    }

    @Test
    public void testRecursiveFibonacci() {
        Fibonacci fibonacci = RecursiveFibonacci.factory();

        assertEquals(0L, fibonacci.calculate(0));
        assertEquals(1L, fibonacci.calculate(1));
        assertEquals(1L, fibonacci.calculate(2));
        assertEquals(2L, fibonacci.calculate(3));
        assertEquals(3L, fibonacci.calculate(4));
        assertEquals(5L, fibonacci.calculate(5));
        assertEquals(8L, fibonacci.calculate(6));

        assertEquals(267914296L, fibonacci.calculate(42));
    }

    @Test
    public void testRecursiveFibonacci_NegativeNumber() {
        Fibonacci fibonacci = RecursiveFibonacci.factory();

        assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.calculate(-1);
        });
    }

    @Test
    public void testCachedRecursiveFibonacci() {
        Fibonacci fibonacci = CachedRecursiveFibonacci.factory();

        assertEquals(0L, fibonacci.calculate(0));
        assertEquals(1L, fibonacci.calculate(1));
        assertEquals(1L, fibonacci.calculate(2));
        assertEquals(2L, fibonacci.calculate(3));
        assertEquals(3L, fibonacci.calculate(4));
        assertEquals(5L, fibonacci.calculate(5));
        assertEquals(8L, fibonacci.calculate(6));

        assertEquals(267914296L, fibonacci.calculate(42));
    }

    @Test
    public void testCachedRecursiveFibonacci_NegativeNumber() {
        Fibonacci fibonacci = CachedRecursiveFibonacci.factory();

        assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.calculate(-1);
        });
    }
}
