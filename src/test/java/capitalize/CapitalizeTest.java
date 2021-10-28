package capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeTest {

    @Test
    public void testCapitalize() {
        Capitalize capitalize = new Capitalize() {
            @Override
            public String execute(String sentence) {
                return null;
            }
        };

        assertEquals("", capitalize.execute(""));
        assertEquals("Hi", capitalize.execute("hi"));
        assertEquals("Hi, There!", capitalize.execute("hi, there!"));
    }
}
