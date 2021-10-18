package factorial;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = null;

        assertEquals(BigInteger.ONE, factorial.calculate(0));
        assertEquals(BigInteger.ONE, factorial.calculate(1));
        assertEquals(BigInteger.valueOf(2L), factorial.calculate(2));
        assertEquals(BigInteger.valueOf(6L), factorial.calculate(3));
        assertEquals(BigInteger.valueOf(24L), factorial.calculate(4));
        assertEquals(BigInteger.valueOf(120L), factorial.calculate(5));
        assertEquals(BigInteger.valueOf(3628800L), factorial.calculate(10));
    }
}
