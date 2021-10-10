package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        FizzBizz fizzBizz = null;

        assertEquals("0", fizzBizz.execute(0));
        assertEquals("1", fizzBizz.execute(1));
        assertEquals("2", fizzBizz.execute(2));
        assertEquals("Fizz", fizzBizz.execute(3));
        assertEquals("4", fizzBizz.execute(4));
        assertEquals("Buzz", fizzBizz.execute(5));
        assertEquals("Fizz", fizzBizz.execute(6));
        assertEquals("7", fizzBizz.execute(7));

        assertEquals("14", fizzBizz.execute(14));
        assertEquals("FizzBuzz", fizzBizz.execute(15));
        assertEquals("16", fizzBizz.execute(16));
    }
}
