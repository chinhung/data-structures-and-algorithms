package palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.execute("abcba"));
        assertFalse(palindrome.execute("abcde"));
    }
}
