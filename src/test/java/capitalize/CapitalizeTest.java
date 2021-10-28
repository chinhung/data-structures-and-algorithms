package capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeTest {

    @Test
    public void testCapitalize() {
        Capitalize capitalize = new CapitalizeImpl();

        assertEquals("", capitalize.execute(""));
        assertEquals("Hi", capitalize.execute("hi"));
        assertEquals("Hi, There!", capitalize.execute("hi, there!"));
        assertEquals("This Is A Book", capitalize.execute("this is a book"));
    }
}
