package reverse_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReverse() {
        ReverseInteger reverseInteger = new ReverseIntegerImpl();

        assertEquals(-18, reverseInteger.reverse(-81));
        assertEquals(-1, reverseInteger.reverse(-10));
        assertEquals(-1, reverseInteger.reverse(-1));
        assertEquals(0, reverseInteger.reverse(0));
        assertEquals(1, reverseInteger.reverse(1));
        assertEquals(1, reverseInteger.reverse(10));
        assertEquals(18, reverseInteger.reverse(81));

        assertEquals(1, reverseInteger.reverse(100));
        assertEquals(801, reverseInteger.reverse(1080));
    }
}
