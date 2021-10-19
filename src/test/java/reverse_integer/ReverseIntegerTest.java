package reverse_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReverse() {
        ReverseInteger reverseInteger = null;

        assertEquals(-18, reverseInteger.reverse(-81));
        assertEquals(-10, reverseInteger.reverse(-1));
        assertEquals(-1, reverseInteger.reverse(-1));
        assertEquals(0, reverseInteger.reverse(0));
        assertEquals(1, reverseInteger.reverse(1));
        assertEquals(10, reverseInteger.reverse(1));
        assertEquals(18, reverseInteger.reverse(81));

        assertEquals(100, reverseInteger.reverse(1));
        assertEquals(1080, reverseInteger.reverse(801));
    }
}
