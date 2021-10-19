package reverse_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {

    @Test
    public void testReverse() {
        ReverseString reverseString = null;

        assertEquals("", reverseString.reverse(""));
        assertEquals("dlrow olleh", reverseString.reverse("hello world"));
        assertEquals("!gninroM", reverseString.reverse("Morning!"));
    }
}
